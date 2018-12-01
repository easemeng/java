package com.igeek.shop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.shop.service.RegisterService;

public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 获取参数
		String username = request.getParameter("username");

		// service验证是否存在
		RegisterService service = new RegisterService();
		boolean isExist = service.checkUsername(username);
		
		String json = "{\"isExist\":"+ isExist +"}";
		response.getWriter().write(json);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
