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
		
		// 获取激活码
		String activeCode = request.getParameter("activeCode");
		// 激活用户
		RegisterService service = new RegisterService();
		boolean isSuccess = service.active(activeCode);
		if(isSuccess){
			// 激活成功 跳转到登录页面
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
