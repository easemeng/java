package com.igeek.shop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.shop.service.RegisterService;


public class ActiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ��ȡ������
		String activeCode = request.getParameter("activeCode");
		// �����û�
		RegisterService service = new RegisterService();
		boolean isSuccess = service.active(activeCode);
		if(isSuccess){
			// ����ɹ� ��ת����¼ҳ��
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}else{
			response.sendRedirect(request.getContextPath() + "/error.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
