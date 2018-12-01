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
		String path = request.getContextPath();
	%>
	<%=path %>
	<!-- 两种获取项目路径的方式 在实际开发中 我们的请求路径 都要写成绝对路径 -->
	${pageContext.request.contextPath}
	
	<!-- 
		test3.jsp 访问 test2.jsp
		关于相对路径
			1. 要访问的资源跟当前所编辑的页面在同一级目录下 直接输入名称即可访问
			2. 当你要访问的资源，在一个内层的文件夹中
				href = "a/b/test4.jsp"
			3. 当你要访问的资源 在你当前所编辑的文件夹外部
				../来跳出文件 ../../../
		写绝对路径
	 -->
	 <a href="a/b/test4.jsp">点击</a>

</body>
</html>