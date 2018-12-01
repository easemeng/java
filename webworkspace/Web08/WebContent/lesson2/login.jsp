<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 增加验证码 防止恶意表单提交 -->
	<font color="red">
		${message==null?"":message}
	</font>
	<form action="${pageContext.request.contextPath}/CheckCodeServlet" method="post" >
		用户名：<input type="text" name="username" />
		验证码：<input type="text" name="checkCode" /><!-- 手动输入验证码 -->
		<img alt="验证码丢了 请刷新页面" src="<%=request.getContextPath()%>/ValidateColorServlet">
		<input type="submit" value="确定" />
	</form>

</body>
</html>