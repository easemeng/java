package com.igeek.login;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet生命周期五个阶段(也有说是三个阶段  加载和卸载不需要干预)
 * 		加载
 * 		初始化：init()		该方法会在Servlet被加载并实例化以后执行 只会执行一次
 * 		服务：service()	-->	doGet()   doPost()
 * 		销毁：destroy()	该方法会在Servlet被系统回收时执行	只会执行一次
 * 		卸载
 *
 */

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestServlet() {
       
    	System.out.println("调用空参构造器");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("初始化方法");
		
		String userName = config.getInitParameter("username");
		String age = config.getInitParameter("age");
		// 获得当前Servlet中的初始化参数
		System.out.println(userName+age);
		ServletContext servletContext = config.getServletContext();
		String name = servletContext.getInitParameter("name");
		String age2 = servletContext.getInitParameter("age");
		System.out.println(name + age2 + "TestServlet 可以访问当前的全局数据");
	}

	public void destroy() {
		System.out.println("销毁方法");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("服务   方法");
	}

}
