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
		// pageContext,application 用的都比较少
		// request,session ...
		pageContext.setAttribute("name", "zmy");
		pageContext.getServletConfig(); // 获得config对象
		pageContext.getServletContext(); // 获得application对象
		pageContext.getPage(); // page对象
		pageContext.getException(); // 获得异常对象	isErrorpage = "true";
		pageContext.getSession(); // 获得session对象
		pageContext.getRequest(); // 获得请求对象
		pageContext.getResponse(); // 获得响应对象
		pageContext.getOut(); // 获得out对象
		
		// 常量
		pageContext.setAttribute("name", "qmy",pageContext.SESSION_SCOPE);
	%>
	<!-- 1 2 3 4 -->
	<%=pageContext.PAGE_SCOPE %>
	<jsp:include page="header.jsp" /><br />
	<!-- 意思是在当前页面引入其他的jsp页面 方便网页布局 -->
	<%-- <%@ include file="header.jsp" %><br /> --%>
	主题内容<%=pageContext.getAttribute("name") %>
	<%-- <%@ include file="footer.jsp" %><br /> --%>
	<jsp:include page="footer.jsp" /><br />
	<!-- 
		out.write("<html>");
		...
		
	 -->
	 <%
	 	request.getRequestDispatcher("index.jsp").forward(request, response);
	 %>
	 <jsp:forward page="index.jsp"></jsp:forward>

</body>
</html>