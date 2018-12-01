<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/jq/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$("button").click(function(){
			// 发送一个ajax请求
			$.ajax({
				type:"POST",
				url:"http://localhost:8080/Web08/AjaxTest",
				data:"username=tom&location=Boston&age=20",
				// 成功之后回调函数	request.readyState==4&&request.status==200
				// 
				success:function(msg){
					// msg就表示服务器给你响应内容
					// alert("Data Saved:" + msg);
					$("#span1").append(msg);
				}
			});
		})
	});
</script>

</head>
<body>

	<button>点击</button>
	<span id = "span1" ></span>

</body>
</html>