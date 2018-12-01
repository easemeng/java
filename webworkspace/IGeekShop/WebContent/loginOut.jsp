<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("username","");
		cookie.setPath("/");
		cookie.setMaxAge(0);
		response.addCookie(cookie);//cookie清理
		//清理session  .
		session.invalidate();
		
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	%>
</body>
</html>