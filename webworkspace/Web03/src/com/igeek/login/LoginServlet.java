package com.igeek.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void init(ServletConfig config) throws ServletException {
		// super.init(config);
    	// String userName = config.getInitParameter("username");
    	// String age = config.getInitParameter("age");
    	// 获得当前Servlet中的初始化参数
    	// System.out.println(userName + age);
    	// 返回一个Servlet上下文对象	通过这个对象可以访问全局的配置参数
    	ServletContext servletContext = config.getServletContext();
    	String name = servletContext.getInitParameter("name");
    	String age = servletContext.getInitParameter("age");
    	System.out.println(name + age + "LoginServlet");
    	
	}

	public LoginServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("doget方法执行了");
		// request 请求	请求对象中就封装了关于浏览器传递过来的所有数据
		
		response.setHeader("content-Type", "text/html;charset=UTF-8");
		// 处理响应乱码 	指定返回的内容类型 	为文本/html 字符集为utf-8
		// request 对象中就封装了 浏览器所有信息
		String header = request.getHeader("Accept-Language");
		String connection = request.getHeader("Connection");
		System.out.println(connection);
		System.out.println(header);
		// 获得请求头中所有信息
		
		// 如何处理get请求乱码	Tomcat8以上默认编码格式UTF-8		Tomcat8以下的编码是 8859-1
		// 获取传递过来的参数
		// 1. 在Tomcat配置文件中 修改端口号的位置 加入以下代码 URIEncoding="UTF-8"
		//   URI 统一资源描述符	URL 统一资源定位符
		// (推荐处理get乱码的方式)2. get  post	终极转码
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		System.out.println(loginName + "\t" + password);
		// String newLoginName = new String(loginName.getBytes("ISO-8859-1"),"UTF-8");
		// String newPassword = new String(password.getBytes("ISO-8859-1"),"UTF-8");
		// System.out.println(newLoginName + "\t" + newPassword);
		// 指的是对数据进行编码	iso-8859-1
		String encode = URLEncoder.encode(loginName,"iso-8859-1");
		String decode = URLDecoder.decode(password,"utf-8");
		System.out.println(decode);
		
		// PrintWriter
		
		PrintWriter out = response.getWriter();
		out.write("我收到了:" + decode);
	}

	// 不论是get请求 还是post请求 都会访问doget方法
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// doGet(request, response);
		// 处理post请求的乱码，方式一，使用终极转码	String 转完码之后的字符串=new String(需要转码的字符串.getBytes("ISO-8859-1"),"UTF-8")
		// (推荐的处理post乱码的方式)处理post请求乱码的方式二，在获取参数之前，最好写到第一行的位置，给当前请求设置一个编码
		// request.setCharacterEncoding("UTF-8"); 一般放在接收数据之前
		request.setCharacterEncoding("utf-8");
		String header = request.getHeader("Accept-Language");
		String connection = request.getHeader("Connection");
		System.out.println(connection);
		System.out.println(header);
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		
		System.out.println(loginName + "\t" + password);
		// String newLoginName = new String(loginName.getBytes("ISO-8859-1"),"UTF-8");
		// String newPassword = new String(password.getBytes("ISO-8859-1"),"UTF-8");
		// System.out.println(newLoginName + "\t" + newPassword);
		
	}

}
