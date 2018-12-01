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
		// 获取 cookie .. 只能遍历
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies){
			out.print("cookie:" + cookie.getName() + "--" + cookie.getValue());
			out.print("<br />");
		}
	%>
</body>
</html>