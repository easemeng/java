<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function on(){
		var request;
		if(window.XMLHttpRequest){
			request = new XMLHttpRequest();
		}else{
			request = new ActiveXObject("Microsoft.XMLHTTP");
		}
		// callback 回调	回调函数	1. 自己定义的	2. 没有调用	3.执行了
		// 如何接收服务器响应的数据	onreadystatechange	当请求状态发生改变时会触发当前方法
		request.onreadystatechange=function(){
			// readyState==4 表示服务接收到的请求，并且处理完成发送响应给浏览器
			// status==200 表示请求被处理 没有任何问题
			// request.readyState==4 && request.status==200 请求发送成功 并且收到了服务器的响应
			if(request.readyState==4 && request.status==200){
				// request.responseText 表示服务器给你的响应数据	responseText 表示服务器给你响应的内容
				var data = request.responseText;
				alert(data); // 注册成功
			}
		}
		request.open("POST", "http://localhost:8080/Web08/AjaxTest?username=tom123", true);
		// 模拟 form 表单提交	只有 form 才能发送 post 请求
		request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		// 使用 ajax 发送 post 请求	application/x-www-form-urlencoded 模拟表单提交
		request.send("name=tom&age=122"); // 注意 如果是 get 请求 		send()方法中无法传递数据
		// 区别 post 请求的提交方式	send()可以传递参数	get方式 send()不能传递参数
	}
</script>
<body>

	<form action="${pageContext.request.contextPath}/AjaxTest" method="post">
		<input type="text" name="username" onblur="on()" /><span id="s1" ></span>
		<input type="submit" value="注册" />
	</form>

</body>
</html>