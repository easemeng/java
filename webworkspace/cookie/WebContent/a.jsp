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
		session 内置对象	session 对话
		session的实现依赖	cookie 技术
		
		创建一个session对象	session有一个sessionid(........)
		然后服务器就会发送给浏览器一个cookie 这个cookie的name 就是(JSESSIONID)
		那么这个cookie的value 就是 session 对象的 sessionid
	 -->
	 <%=session.getId() %>
	 <%-- <%
	 	Cookie cookie = new Cookie("JSESSION",session.getId());
	 	cookie.setMaxAge(36);
	 	response.addCookie(cookie);
	 %> --%>
</body>
</html>