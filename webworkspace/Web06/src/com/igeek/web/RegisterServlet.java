package com.igeek.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igeek.domain.Product;
import com.igeek.domain.User;
import com.igeek.service.LoginService;
import com.igeek.service.RegisterService;
import com.igeek.utils.StringUtils;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RegisterService registerService = new RegisterService();
	private LoginService loginService = new LoginService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		// 取数据	获得前台输入的数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		HttpSession session = request.getSession();
		// System.out.println(username + password + phone);
		// 插入之前 需要先判断当前用户名 在数据库中是否存在	若存在 返回注册页面 提示消息 该用户已存在   成功则跳转到登录页面
		User dbUser = registerService.checkUser(username);
		
		if(dbUser != null){		// 数据库中存在
			request.setAttribute("mes", "该用户已存在");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}else{
			// 正常插入到数据库
			User user = new User(StringUtils.getUUID(),username,password,Integer.parseInt(phone));
			registerService.insertUser(user);
			// 跳转到成功页面
			// 这个user 要和 成功页中的 "user" 一致
			session.setAttribute("user", user);
			// 再放置商品
			List<Product> productList = loginService.getProductList(0);
			// name String ""	value Object
			session.setAttribute("productList", productList);
			request.setAttribute("mess", "注册成功！请登录");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	

}
