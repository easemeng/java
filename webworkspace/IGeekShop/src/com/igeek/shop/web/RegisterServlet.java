package com.igeek.shop.web;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import com.igeek.common.utils.MailUtils;
import com.igeek.common.utils.StringUtils;
import com.igeek.shop.entity.User;
import com.igeek.shop.service.CheckService;
import com.igeek.shop.service.CheckServiceImpl;
import com.igeek.shop.service.RegisterService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("ִ��1");
		request.setCharacterEncoding("utf-8");
		User user = new User();
		try {
			// �ֶ���Stringת����Date����
			ConvertUtils.register(new Converter() {
				// ʵ�����͵�ת��
				// value ����Ҫת�������� clazz Ŀ�����������
				@Override
				public Object convert(Class clazz, Object value) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

					Date date = null;
					try {
						date = sdf.parse((String) value);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return date;
				}
			}, Date.class);

			// ��ȡ�������� BeanUtils��populate ���� �����л�ȡ������ӳ�䵽ʵ����
			// ��װuserʵ�����
			BeanUtils.populate(user, request.getParameterMap());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ������֤���Ƿ���ȷ
		String checkCode = request.getParameter("checkCode");
		String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");


		user.setUid(StringUtils.getUUID());
		String activeCode = StringUtils.getUUID();

		user.setCode(activeCode);
		// ����Service��ע�᷽��
		RegisterService rService = new RegisterService();
		boolean isSuccess = rService.rigest(user);

		CheckService cks = new CheckServiceImpl();
		
		if (cks.checkCode(sessionCode, checkCode)) {

			if (isSuccess) {

				if (cks.checkCode(sessionCode, checkCode)) {
					request.getSession().removeAttribute("CHECK_CODE_KEY");
				}
				// �����ʼ� �����˻�
				String emailMsg = "��ϲ��ע��ɹ���������������ӽ����˻����� <br>"
						+ "<a href='http://localhost:8080/IGeekShop/active?activeCode=" + activeCode + "'>"
						+ "http://localhost:8080/IGeekShop/active?activeCode=" + activeCode + "</a>";

				try {
					MailUtils.sendMail(user.getEmail(), emailMsg);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// ��ת�ɹ�ҳ��
				response.sendRedirect(request.getContextPath() + "/registerSuccess.jsp");

			} else {
				if (cks.checkCode(sessionCode, checkCode)) {
					request.getSession().removeAttribute("CHECK_CODE_KEY");
				}
				// ��תʧ��ҳ��
				response.sendRedirect(request.getContextPath() + "/registerFail.jsp");

			}
			//System.out.println("ִ��3");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
