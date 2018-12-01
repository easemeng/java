<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- page中 session="false" 表示当前jsp页面 禁止使用session那个内置对象	自己创建出来的session还是可以使用的 -->
	<%
		// 如何创建一个cookie	cookie 是 名 值 对儿的形式存在	并且名跟值都必须是字符串
		Cookie cookie = new Cookie("name1","xxxxxxxx");
		Cookie cookie2 = new Cookie("ss","xxxxxxxx");
		cookie.setPath("/"); // 一般创建cookie 默认路径就是一个 / 代表当前项目的根路径
		// 通过setMaxAge()方法 给当前的cookie进行持久化
		cookie.setMaxAge(36);
		// 服务端  创建好的 cookie 如何发送给客户端(浏览器)
		response.addCookie(cookie);
		response.addCookie(cookie2);
		response.sendRedirect("b.jsp");
	%>
</body>
</html>