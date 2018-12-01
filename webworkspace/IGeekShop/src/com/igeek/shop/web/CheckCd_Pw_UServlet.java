package com.igeek.shop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.shop.entity.User;
import com.igeek.shop.service.CheckService;
import com.igeek.shop.service.CheckServiceImpl;

public class CheckCd_Pw_UServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CheckService cs = new CheckServiceImpl();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String state = request.getParameter("state");
		if(state.equals("code")){
			this.checkCode(request,response);
		}else if(state.equals("username")){
			this.checkUsername(request,response);
		}else if(state.equals("password")){
			this.checkPassword(request,response);
		}
		
	}

	private void checkPassword(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ss = request.getParameter("automatic");
		
		String username = request.getParameter("username");
		User user = cs.getUser(username);
		request.setAttribute("user", user);
		request.getRequestDispatcher("/LoginServlet").forward(request, response);
		
	}

	private void checkUsername(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		boolean isExist = cs.checkUsername(username);
		
		String json = "{\"isExist\":"+ isExist +"}";
		response.getWriter().write(json);
		
	}

	protected void checkCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String checkCode = request.getParameter("checkCode");
		String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");
		boolean flag = cs.checkCode(sessionCode, checkCode);
		
		String json = "{\"flag\":" + flag + "}";
		response.getWriter().write(json);
		
	}

}
