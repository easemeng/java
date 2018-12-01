<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		// HttpSession session = request.getSession();
		String token = new Date().getTime() + "";
		session.setAttribute("token", token);
	%>
	
	<form action="${pageContext.request.contextPath}/TokenServlet" method="post">
		<input type="hidden" name="token" value="<%=token %>" />
		<input type="text" name=username />
		<input type="submit" value="登录" />
	</form>
	
</body>
</html>