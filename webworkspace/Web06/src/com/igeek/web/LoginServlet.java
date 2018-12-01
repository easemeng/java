package com.igeek.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igeek.domain.Product;
import com.igeek.domain.User;
import com.igeek.service.LoginService;

/**
 * Servlet implmentation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private LoginService loginService = new LoginService();
	// servlet 负责接收(从前台页面接收)传递(把数据传递给前台 其实是放到4个域对象中)数据
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("utf-8");
		// 接收账号密码
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		
		User user = loginService.checkLogin(loginName, password);
		// servlet中如何获取session对象
		// jsp 中的 session 对象 其实就是 servlet 中的HttpSession类的对象
		HttpSession session = request.getSession();
		// jsp 中的 application 对象 其实就是 servlet 中的 ServletContext 类的对象
		ServletContext application = this.getServletContext();
		// request session application 三个常用的域对象的获得方式(Servlet中的获取方式)
		
		if(user != null){
			// 在登录成功之前 需要先将显示的数据 放入某一个域中(pageContext,request,session,application)
			
			// List<Product> list   把当前的 list 放入到请求域
			List<Product> productList = loginService.getProductList(0);
			
			// seesion
			// application.setAttribute(name,object);
			session.setAttribute("productList", productList);
			// 登录成功
			
			request.setAttribute("user",user);
			request.setAttribute("name", user.getUsername());
			// 只能请求转发到 WEB-INF 下 WEB-INF下的东西不能被浏览器直接访问
			request.getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
		}else{
			// 向请求域中发送错误信息
			request.setAttribute("message", "账号密码有误");
			// 跳转到登录页
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
