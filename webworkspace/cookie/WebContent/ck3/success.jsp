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
		//请求头中携带cookie   name="user"  value="tom"
		String userName = request.getParameter("userName");
		if(userName!=null&&!userName.trim().equals("")){
			out.print("欢迎你："+userName);
			//然后添加cookie
			Cookie cookie = new Cookie("user",userName);
			cookie.setMaxAge(40);
			cookie.setPath("/");//最好都加上 。
			response.addCookie(cookie);//发送cookie  ...    
			// 加密 。https://blog.csdn.net/qq_26420489/article/details/53395472
		}else{
			//拿到所有的cookie
			Cookie [] cookies = request.getCookies();
			if(cookies!=null&&cookies.length>0){//500
				for(Cookie cookie:cookies){
					//先得到cookie的name值。
					String cookieName = cookie.getName();
					if(cookieName.equals("user")){
						//拿到cookie中 user所对应的value数据 。
						String value = cookie.getValue();
						//去给userName进行赋值。
						userName=value;
					}
				}
			}
		}
		if(userName!=null&&!userName.trim().equals("")){
			out.print("欢迎你："+userName);
		}else{
			//登陆页 。
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>