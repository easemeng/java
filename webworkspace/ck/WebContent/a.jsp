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
		Cookie [] cks = request.getCookies();
		// 1. 浏览器内存中没有cookie数据 。
		// 2. 本地文件  服务器也没有写入cookie
		if(cks != null){
			// user:tom123
			// a:a1
			// b:b1
			for(Cookie ck:cks){
				String name = ck.getName();
				// name = user
				if(name.equals("user")){
					// value = tom123
					String value = ck.getValue();
					out.print(value);
				}
			}
		}else{
			// 服务器创建好一个cookie对象 。
			Cookie c1 = new Cookie("user","tom123");
			// 如果当前的cookie对象 ，没有调用setMaxAge()方法。 那么默认当前的cookie是存储在浏览器中的。浏览器一关闭。这个cookie数据也随着清除。
			// 将cookie发送给浏览器 。
			c1.setPath("/");
			c1.setMaxAge(36);
			response.addCookie(c1);
			// 
		}
	%>
</body>
</html>