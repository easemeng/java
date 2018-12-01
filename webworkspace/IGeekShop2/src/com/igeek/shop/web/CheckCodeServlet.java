package com.igeek.shop.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igeek.shop.service.RegisterService;


public class CheckCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String checkCode = request.getParameter("checkCode");
	//	System.out.println(checkCode);
		String sessionCode = (String) request.getSession().getAttribute("CHECK_CODE_KEY");
	//	System.out.println(sessionCode);

		RegisterService service = new RegisterService();
		boolean flag = service.checkCode(sessionCode, checkCode);
				
		String json = "{\"flag\":" + flag + "}";
		response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
