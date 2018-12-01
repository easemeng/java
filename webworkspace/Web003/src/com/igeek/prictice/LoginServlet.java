package com.igeek.prictice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletConfig config;
	
    public LoginServlet() {
        
    }

	public void init(ServletConfig config) throws ServletException {
		
		this.config = config;
		
		String userName = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		// System.out.println(userName + password);
		ServletContext servletContext = config.getServletContext();
		String adminUser = servletContext.getInitParameter("adminUser");
		String adminPwd = servletContext.getInitParameter("adminPwd");
		
	}

	public void destroy() {
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		// 设置响应头 解决响应乱码问题
		response.setHeader("content-Type", "text/html;charset=UTF-8");
		
		String loginName = request.getParameter("loginName");
		String password1 = request.getParameter("password");
		// System.out.println(loginName + password);
		ServletContext servletContext = request.getServletContext();
		String adminUser = servletContext.getInitParameter("adminUser");
		String adminPwd = servletContext.getInitParameter("adminPwd");
		
		// String userName = config.getInitParameter("username");
		// String password = config.getInitParameter("password");
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println(username + password);
		
		PrintWriter out = response.getWriter();
		
		if(loginName.equals(username) && password1.equals(password)){
			out.write("登录成功！");
		}else if(loginName.equals(adminUser) && password1.equals(adminPwd)){
			out.write("欢迎管理员：" + adminUser + "登录！");
		}else{
			out.write("登录失败！");
		}
	}

}
