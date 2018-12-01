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
			// http://localhost:8080/Web08/lesson4/jq.jsp
			var arrs = [1,2,3,4,5,6,7];
			var names = ["wow","lol","sks","akm"];
			$.ajax({
				// 请求 类型 get post
				type:"POST",
				url:"http://localhost:8080/Web08/Ajax?state=ajax1",
				traditional:true, // 防止深度序列化	如果不加这句话 后台无法接收到数据
				// 要给后台传递的数据
				data:{
					"arrays":arrs,
					game:names,
					"ss":"字符串"
					// name 值   加不加双引号都可以
				},
				// 成功之后回调函数 request.readyState==4&&request.status==200
				dataType:"json",
				success:function(data){
					// msg 就表示服务器给你响应的内容
					// alert("Data Saved:" + msg);
					// $("#span1").append(msg);
					alert(data.msg);
					alert(data.age)
				}
			})
		})
	})
</script>

</head>
<body>

	<button>点击</button>
	<span id = "span1" ></span>

</body>
</html>