<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		JSP 九大内置对象
			pageContext
			request
			session
			application
			(以上四个 又是域对象	是JSP四大作用域)
			page
			out
			config
			response
			exception
	 -->
	
	<%
		pageContext.setAttribute("pageContextKey", "pageContext");
		request.setAttribute("requestKey", "request");
		session.setAttribute("sessionKey", "session");
		application.setAttribute("applicationKey", "application");
	%>
	
	<%
		// 重定向	response.sendRedirect("");	后面就是你要转发的路径或者请求的地址
		response.sendRedirect("http://www.baidu.com?name=tom&password=123");
		// request.getRequestDispatcher("/b.jsp?name=tom&password=123").forward(request,response);
		
		// JSP九大内置对象 四大作用域	请求转发 重定向的区别
		// 1. 请求转发的时候 地址栏不会发生改变，重定向的地址栏会发生改变
		// 2. 请求转发是服务器行为，重定向是浏览器(客户端)行为
		// 3. 请求转发只发送一次请求，使用的是同一个request对象，重定向发送两次请求，使用的不是同一个request对象
		// 4. 使用请求转发可以访问到请求域中的数据，使用重定向是无法访问请求域中的数据的
		// 5. 请求转发和重定向后面都可以跟?传递参数	后面可以用request.getParameter接收
		// 6. 请求转发的效率高一些，重定向的效率稍低
		// 7. 请求转发只能在当前项目下	重定向可以定位到任意项目(包括跳转一些网页)
		/*
			Foward是在服务器端的跳转，就是客户端一个请求发送给服务器，服务器直接将请求相关的参数的信息原封不动的传递到该服务器的
			其他jsp或servlet去处理，而sendRedirect是在客户端的跳转，服务端会返回给客户端一个响应报头和新的URL地址，原来
			的参数什么的信息如果服务器端没有特别处理就不存在了，浏览器会访问新的URL所指向的servlet或jsp
		*/
	%>
</body>
</html>