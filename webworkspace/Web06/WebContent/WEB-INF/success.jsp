<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="com.igeek.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// Object user = session.getAttribute("user");
		// String name = user.getUsername();
		String name = (String)request.getAttribute("name");
		// 从请求域中拿到productList
		List<Product> productList = (List<Product>)session.getAttribute("productList");
	%>

	登录成功欢迎：<br><h1 style="color:red"><%=name %></h1><br>
	
	<%
		for(Product p : productList){
			int pid = p.getPid();
			String pname = p.getPname();
			double price = p.getPrice();
			String category_id = p.getCategory_id();
			%>
			<!-- <input type="hidden" value="<%=pid %>" /> -->
			<a href="#" title="<%=pname %>的价格:<%=price %>" categoryid="<%=category_id %>"><%=pname %></a>
			<%
		}
	%>
</body>
</html>