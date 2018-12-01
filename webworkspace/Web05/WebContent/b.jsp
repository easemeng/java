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
		String pagecontexts = (String)pageContext.getAttribute("pageContextKey");
		String requests = (String)request.getAttribute("requestKey");
		String sessions = (String)session.getAttribute("sessionKey");
		String applications = (String)application.getAttribute("applicationKey");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
	%>
	<%=name %>
	<%=password %>
	<br />
	<%=pagecontexts + "pageContext域中的数据" %>
	<%=requests + "request域中的数据" %>
	<%=sessions + "session域中的数据" %>
	<%=applications + "applications域中的数据" %>
</body>
</html>