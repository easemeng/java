<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/jquery.validate.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}

.container .row div {
	/* position:relative;
				 float:left; */
	
}

font {
	color: #666;
	font-size: 22px;
	font-weight: normal;
	padding-right: 17px;
}

.error{
	color:red;
}
</style>

<script type="text/javascript">
$(function(){
	$("#cd1").click(function(){
		$("#img1").attr("src","<%=request.getContextPath()%>/ValidateColorServlet?" + new Date().getTime());
	})
})

		$.validator.addMethod(
			"checkUsername",
			function(value,element,params){
				
				var flag = true;
				$.ajax({
					"async":false, // 同步操作
					"url":"${pageContext.request.contextPath}/checkUsername",
					"type":"POST",
					"data":{"username":value},
					"dataType":"json",
					"success":function(data){
						//alert(data,isExist);
						flag = data.isExist;	// true---存在 false---不存在
					}
				});
				return flag;
				
			});

	$.validator.addMethod(
			"checkCoder",
			function(value,element,params){
				
				var flags = true;
				$.ajax({
					"async":false,
					"url":"${pageContext.request.contextPath}/checkCodeServlet",
					"type":"POST",
					"data":{"checkCode":value},
					"dataType":"json",
					"success":function(data){
						//alert(data,flag);
						flags = data.flag;
					}
				});
				return flags;
			}); 
	
	$.validator.addMethod(
			"checkPassword",
			function(value,element,params){
				
				var fgs = true;
				$.ajax({
					"async":false,
					"url":"${pageContext.request.contextPath}/checkPwdServlet",
					"type":"POST",
					"data":{"checkPwd":value},
					"dataType":"json",
					"success":function(data){
						//alert(data,flag);
						fgs = data.fg;
					}
				});
				return fgs;
			}); 
	
$(function() {
	$("#loginForm").validate({
		rules : {
			"username" : {
				"required" : true,
				"checkUsername" : true
			},
			"checkPwd" : {
				"required" : true,
				"checkPassword" : true
			},"checkCode" : {
				"required" : true,
				"checkCoder" : true
			}
		},
		messages : {
				"username" : {
					"required" : "用户名不能为空",
					"checkUsername" : "该用户不存在"
				},
				"checkPwd" : {
					"required" : "密码不能为空",
					"checkPassword" : "密码输入错误"
				},
				"checkCode" : {
					"required" : "验证码不能为空",
					"checkCoder" : "验证码输入错误"
				}
			}
	});
});
</script>

</head>
<body>

	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>


	<div class="container"
		style="width: 100%; height: 460px; background: #FF2C4C url('images/loginbg.jpg') no-repeat;">
		<div class="row">
			<div class="col-md-7">
				<!--<img src="./image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录">-->
			</div>

			<div class="col-md-5">
				<div
					style="width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 60px; background: #fff;">
					<font>会员登录</font>USER LOGIN
					<div>&nbsp;</div>
					<form action="${root}/LoginServlet" method="post" class="form-horizontal" id="loginForm">
						<div class="form-group">
							<label for="username" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="username" name="username"
									placeholder="请输入用户名">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="inputPassword2" name="checkPwd"
									placeholder="请输入密码">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">验证码</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="inputPassword3" name="checkCode"
									placeholder="请输入验证码">
							</div>
							<div class="col-sm-3" id="cd1">
								<img id="img1" alt="验证码丢了 请刷新页面" src="<%=request.getContextPath()%>/ValidateColorServlet">
								<span id="sp1" style="color:blue" >看不清 换一张</span>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label> <input type="checkbox" name="automatic" value="off" onclick="au(this)"> 自动登录
									</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label> 
									<input type="checkbox" name="remember" value="off" onclick="re(this)"> 记住用户名
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="submit" width="100" value="登录" name="submit"
									style="background: url('./images/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>
</html>