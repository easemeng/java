package com.igeek.lesson4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ajax
 */
public class Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// url
	// http://localhost:8080/Web08/Ajax?state=ajax1
	// http://localhost:8080/Web08/Ajax?state=ajax2
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		// 状态分发
		String state = request.getParameter("state");
		if(state.equals("ajax1")){
			// 根据状态不同 调用不同的放法	(好处 不用每次新增一个请求 就去写一个servlet)
			ajax1(request,response);
		}else if(state.equals("ajax2")){
			ajax2(request,response);
		}
		
	}

	protected void ajax1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// game
		
		String[] arrays = request.getParameterValues("arrays");
		String[] games = request.getParameterValues("game");
		String ss = request.getParameter("ss");
		System.out.println(ss);
		for (String string : games) {
			System.out.println(string);
		}
		for (String string : arrays) {
			System.out.println(string);
		}
		
		response.setContentType("text/html;charset=utf-8");
		// {"msg":"成功","age":"20"}
		// response.getWriter().write("{\"msg\":\"成功\",\"age\":\"20\"}");
		PrintWriter out = response.getWriter();
		out.write("{\"msg\":\"成功\",\"age\":\"20\"}");
		// ajax 用来异步获取数据
		// 只要是ajax请求 都是通过out对象返回json数据
	}

	protected void ajax2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request.getParameter() request.getAttribute()
		String name = request.getParameter("name");
		System.out.println(name);
		String[] arrays = request.getParameterValues("arrays[]");
		for (String string : arrays) {
			System.out.println(string);
			// service.deleteAll(string);
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// {"msg":"你成功了!","age":"20"} 
		out.write("{\"msg\":\"你成功了!\",\"age\":\"20\"}"); 
	}

}
