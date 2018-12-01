package com.igeek.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igeek.domain.Product;
import com.igeek.domain.User;
import com.igeek.service.LoginService;
import com.igeek.service.RegisterService;
import com.igeek.utils.StringUtils;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RegisterService registerService = new RegisterService();
	private LoginService loginService = new LoginService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		// ȡ����	���ǰ̨���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		HttpSession session = request.getSession();
		// System.out.println(username + password + phone);
		// ����֮ǰ ��Ҫ���жϵ�ǰ�û��� �����ݿ����Ƿ����	������ ����ע��ҳ�� ��ʾ��Ϣ ���û��Ѵ���   �ɹ�����ת����¼ҳ��
		User dbUser = registerService.checkUser(username);
		
		if(dbUser != null){		// ���ݿ��д���
			request.setAttribute("mes", "���û��Ѵ���");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}else{
			// �������뵽���ݿ�
			User user = new User(StringUtils.getUUID(),username,password,Integer.parseInt(phone));
			registerService.insertUser(user);
			// ��ת���ɹ�ҳ��
			// ���user Ҫ�� �ɹ�ҳ�е� "user" һ��
			session.setAttribute("user", user);
			// �ٷ�����Ʒ
			List<Product> productList = loginService.getProductList(0);
			// name String ""	value Object
			session.setAttribute("productList", productList);
			request.setAttribute("mess", "ע��ɹ������¼");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	

}
