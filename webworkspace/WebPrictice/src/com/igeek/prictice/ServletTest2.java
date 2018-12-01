package com.igeek.prictice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletTest2() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("context-Type", "text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		
		System.out.println(user + "\t" + password + "\t" + name + "\t" + sex);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
