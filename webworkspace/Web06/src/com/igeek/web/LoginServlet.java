package com.igeek.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igeek.domain.Product;
import com.igeek.domain.User;
import com.igeek.service.LoginService;

/**
 * Servlet implmentation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private LoginService loginService = new LoginService();
	// servlet �������(��ǰ̨ҳ�����)����(�����ݴ��ݸ�ǰ̨ ��ʵ�Ƿŵ�4���������)����
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��������
		request.setCharacterEncoding("utf-8");
		// �����˺�����
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		
		User user = loginService.checkLogin(loginName, password);
		// servlet����λ�ȡsession����
		// jsp �е� session ���� ��ʵ���� servlet �е�HttpSession��Ķ���
		HttpSession session = request.getSession();
		// jsp �е� application ���� ��ʵ���� servlet �е� ServletContext ��Ķ���
		ServletContext application = this.getServletContext();
		// request session application �������õ������Ļ�÷�ʽ(Servlet�еĻ�ȡ��ʽ)
		
		if(user != null){
			// �ڵ�¼�ɹ�֮ǰ ��Ҫ�Ƚ���ʾ������ ����ĳһ������(pageContext,request,session,application)
			
			// List<Product> list   �ѵ�ǰ�� list ���뵽������
			List<Product> productList = loginService.getProductList(0);
			
			// seesion
			// application.setAttribute(name,object);
			session.setAttribute("productList", productList);
			// ��¼�ɹ�
			
			request.setAttribute("user",user);
			request.setAttribute("name", user.getUsername());
			// ֻ������ת���� WEB-INF �� WEB-INF�µĶ������ܱ������ֱ�ӷ���
			request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
		}else{
			// ���������з��ʹ�����Ϣ
			request.setAttribute("message", "�˺���������");
			// ��ת����¼ҳ
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
