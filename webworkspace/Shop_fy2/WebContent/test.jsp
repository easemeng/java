<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("emain","");
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
	%>
</body>
</html>