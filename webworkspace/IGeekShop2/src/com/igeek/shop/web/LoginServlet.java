package com.igeek.shop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.shop.entity.User;
import com.igeek.shop.service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		User user = new User();
		
		String checkCode = request.getParameter("checkCode");
		String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");
		
		if(sessionCode != null && checkCode.equals(sessionCode)){
			
			String remember = request.getParameter("remember");
			String automatic = request.getParameter("automatic");
			
			if(remember != null && remember.equals("on")){
				// 需要记住用户名 密码
				Cookie cookie = new Cookie("username",user.getUsername());
				cookie.setPath("/");
				cookie.setMaxAge(60*60*24*7);
				response.addCookie(cookie);
			}else{
				Cookie cookie = new Cookie("username","");
				cookie.setPath("/");
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
			
			response.sendRedirect(request.getContextPath() + "/index.jsp");	
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
