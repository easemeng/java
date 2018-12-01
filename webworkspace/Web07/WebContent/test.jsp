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
		pageContext.setAttribute("name", "丽丽",4);
		pageContext.setAttribute("name", "星星",3);
		pageContext.setAttribute("name", "玲玲",2);
		pageContext.setAttribute("name", "婷婷",1);
		session.setAttribute("key1", "session中key1value值");
	%>
	<%=pageContext.APPLICATION_SCOPE %>
	<%=pageContext.SESSION_SCOPE %>
	<%=pageContext.REQUEST_SCOPE %>
	<%=pageContext.PAGE_SCOPE %>
	
	<%=pageContext.getSession().getAttribute("name") %>
	<%=session.getAttribute("name") %>
	<!-- el的内置对象 不用创建 直接使用 -->
	<!-- 使用el表达式 可以很方便的拿到想要的数据 -->
	<br />
	${pageScope.name}
	${sessionScope.name}
	${requestScope.name}
	${applicationScope.name}
	
	<!-- 如果不知道区域的话 那么默认会从四个域中查找 查到的话就返回该value 拿不到不会显示任何内容 -->
	${key2}
	<hr>
	<!-- 查找顺序 1,2,3,4 当四个域中都有name属性之后 只会找到第一个 -->
	${name}	
	
</body>
</html>