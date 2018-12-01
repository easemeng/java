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
		//System.out.println("执行1");
		request.setCharacterEncoding("utf-8");
		User user = new User();
		try {
			// 手动将String转换成Date类型
			ConvertUtils.register(new Converter() {
				// 实现类型的转换
				// value 代表要转换的数据 clazz 目标的数据类型
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

			// 获取表单中数据 BeanUtils的populate 方法 将表单中获取的数据映射到实体类
			// 组装user实体对象
			BeanUtils.populate(user, request.getParameterMap());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 检验验证码是否正确
		String checkCode = request.getParameter("checkCode");
		String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");


		user.setUid(StringUtils.getUUID());
		String activeCode = StringUtils.getUUID();

		user.setCode(activeCode);
		// 调用Service的注册方法
		RegisterService rService = new RegisterService();
		boolean isSuccess = rService.rigest(user);

		CheckService cks = new CheckServiceImpl();
		
		if (cks.checkCode(sessionCode, checkCode)) {

			if (isSuccess) {

				if (cks.checkCode(sessionCode, checkCode)) {
					request.getSession().removeAttribute("CHECK_CODE_KEY");
				}
				// 发送邮件 激活账户
				String emailMsg = "恭喜您注册成功！请点击下面的链接进行账户激活 <br>"
						+ "<a href='http://localhost:8080/IGeekShop/active?activeCode=" + activeCode + "'>"
						+ "http://localhost:8080/IGeekShop/active?activeCode=" + activeCode + "</a>";

				try {
					MailUtils.sendMail(user.getEmail(), emailMsg);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 跳转成功页面
				response.sendRedirect(request.getContextPath() + "/registerSuccess.jsp");

			} else {
				if (cks.checkCode(sessionCode, checkCode)) {
					request.getSession().removeAttribute("CHECK_CODE_KEY");
				}
				// 跳转失败页面
				response.sendRedirect(request.getContextPath() + "/registerFail.jsp");

			}
			//System.out.println("执行3");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
