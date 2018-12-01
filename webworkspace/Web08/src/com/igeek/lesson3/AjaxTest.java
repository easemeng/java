package com.igeek.lesson3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println(username);
		response.setContentType("text/html;charset=utf-8");
		// 取消同源策略的访问限制 让我们的接口可以被跨域访问到
		response.setHeader("Access-Control-Allow-Origin", "*");
		if(username.equals("tom")){
			request.setAttribute("msg", "用户名已存在");
			request.getRequestDispatcher("/lesson3/ajax.jsp").forward(request, response);
		}else{
			// 服务器给浏览器响应的数据
			response.getWriter().write("注册成功");
			// response.getWriter().write("{\"msg\":\"注册成功!\"}");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
