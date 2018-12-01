package com.igeek.prictice;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest3 extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("自定义service");
	}

	@Override
	public void destroy() {
		System.out.println("销毁构造器");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("初始化");
	}
	
	

}
