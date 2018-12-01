<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 服务器可以接收浏览器传递过来的cookie的 -->
	<%
		// 只能遍历的方式来获取cookie
		Cookie[] cks = request.getCookies();
		// 先判断cookie是否为空
		if(cks != null && cks.length > 0){
			// 再去循环
			for(Cookie ck : cks){ // 只能遍历
				if(ck.getName().equals("name1")){
					out.print(ck.getValue());
				}
			}
		}else{
			out.print("当前cookie中没有数据");
		}
	%>
</body>
</html>