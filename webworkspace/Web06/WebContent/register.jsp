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
		// ??? 	null
		String message = (String)request.getAttribute("mes");
	%>
	<form action="/Web06/RegisterServlet" method="post">
		用户名:<input type="text" name="username" /><span style="color:red"><%=(message==null?"":message)%></span>
		密码:<input type="password" name="password" />
		电话:<input type="text" name="phone" />
		<input type="submit" value="注册" />
		<input type="reset" value="重置">
	</form>
</body>
</html>