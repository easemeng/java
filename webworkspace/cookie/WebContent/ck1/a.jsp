<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// cookie的创建
		// 第一次访问请求 不会携带任何数据	服务器会发送一个cookie给浏览器(响应头中的Set-Cookie)
		// 以后每次访问请求，都会在请求头中携带cookie信息
		Cookie cookie = new Cookie("name","xxxxxxx");
		// 默认cookie会存储在内存中，浏览器关闭设置的cookie被清除
		// 当设置setMaxAge() 单位秒   后cookie将存储在硬盘中，到时间就被清除
		// 当设置为0时表示删除cookie
		// cookie.setMaxAge(36);
		response.addCookie(cookie);
		response.sendRedirect("b.jsp");
	%>
</body>
</html>