<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head></head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员注册</title>
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

font {
	color: #3164af;
	font-size: 18px;
	font-weight: normal;
	padding: 0 10px;
}
.error{
	color:red;
}
</style>
</head>

<script type="text/javascript">
$(function(){
	$("#code1").click(function(){
		$("#img1").attr("src","<%=request.getContextPath()%>/ValidateColorServlet?" + new Date().getTime());
	})
})	
	// 自定义校验规则
	$.validator.addMethod(
			"checkUsername",	// 自定义校验规则的名称
			function(value,element,params){	// 自定义校验规则的实现
				// alert(value);	// 表单中输入的元素
				// alert(element);	// 校验的元素对象
				// alert(params);	// 校验规则输入的参数
				
				var flag = true;
				
				// 发送一个Ajax请求 到服务器验证用户是否存在
				
				$.ajax({
					// 异步请求  设置为 true 与外部操作不同步
					// 属于两个线程	互不影响
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
				
				// 需要一个返回值 false-----该校验器失败 true-----校验通过
				return !flag;
				
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

	$(function() {
		$("#registForm").validate({
			rules : {
				"username" : {
					"required" : true,
					"checkUsername" : true
				},
				"password" : {
					"required" : true,
					"rangelength" : [ 6, 12 ]
				},
				"confirmpwd" : {
					"required" : true,
					"rangelength" : [ 6, 12 ],
					"equalTo" : "#password"
				},
				"email" : {
					"required" : true,
					"email" : true
				},
				"telephone" : {
					"required" : true
				},
				"name" : {
					"required" : true
				},
				"birthday" : {
					"required" : true,
					"date" : true
				},
				"sex" : {
					"required" : true
				},
				"checkCode" : {
					"required" : true,
					"checkCoder" : true
				}
			},
			messages : {
				"username" : {
					"required" : "用户名不能为空",
					"checkUsername" : "用户名已存在"
				},
				"password" : {
					"required" : "密码不能为空",
					"rangelength" : "密码长度在6-12位"
				},
				"confirmpwd" : {
					"required" : "确认密码不能为空",
					"rangelength" : "确认密码长度在6-12位",
					"equalTo" : "两次密码不一致"
				},
				"email" : {
					"required" : "邮箱不能为空",
					"email" : "邮箱格式不正确"
				},
				"telephone" : {
					"required" : "电话不能为空"
				},
				"name" : {
					"required" : "真实姓名不能为空"
				},
				"birthday" : {
					"required" : "生日不能为空",
					"date" : "日期格式不正确"
				},
				"sex" : {
					"required" : "性别必须选择"
				},
				"checkCode" : {
					"required" : "验证码不能为空",
					"checkCoder" : "验证码输入错误"
				}
			}
		});
	})
	
</script>

<body>

	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>

	<div class="container"
		style="width: 100%; background: url('image/regist_bg.jpg');">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8"
				style="background: #fff; padding: 40px 80px; margin: 30px; border: 7px solid #ccc;">
				<font>会员注册</font>USER REGISTER
				<form class="form-horizontal" id="registForm"
					action="${root}/RegisterServlet"
					method="post" style="margin-top: 5px;">
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label">用户名</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="username"
								name="username" placeholder="请输入用户名">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" id="password"
								name="password" placeholder="请输入密码">
						</div>
					</div>
					<div class="form-group">
						<label for="confirmpwd" class="col-sm-2 control-label">确认密码</label>
						<div class="col-sm-6">
							<input type="password" class="form-control" id="confirmpwd" name="confirmpwd"
								placeholder="请输入确认密码">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
						<div class="col-sm-6">
							<input type="email" class="form-control" id="inputEmail3"
								name="email" placeholder="Email">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">电话</label>
						<div class="col-sm-6">
							<input type="tel" class="form-control" id="telephone"
								name="telephone" placeholder="Telephone">
						</div>
					</div>
					<div class="form-group">
						<label for="usercaption" class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" id="usercaption"
								name="name" placeholder="请输入姓名">
						</div>
					</div>
					<div class="form-group opt">
						<label for="inlineRadio1" class="col-sm-2 control-label">性别</label>
						<div class="col-sm-6">
							<label class="radio-inline"> <input type="radio"
								name="sex" id="inlineRadio1" value="男"> 男
							</label> <label class="radio-inline"> <input type="radio"
								name="sex" id="inlineRadio2" value="女"> 女
							</label>
						</div>
					</div>
					<div class="form-group">
						<label for="date" class="col-sm-2 control-label">出生日期</label>
						<div class="col-sm-6">
							<input type="date" class="form-control" name="birthday">
						</div>
					</div>

					<div class="form-group">
						<label for="date" class="col-sm-2 control-label">验证码</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" name="checkCode">

						</div>
						<div class="col-sm-2" id="code1">
							<img id="img1" alt="验证码丢了 请刷新页面" src="<%=request.getContextPath()%>/ValidateColorServlet">
							<span id="sp1" style="color:blue" >看不清 换一张</span>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" width="100" value="注册" name="submit"
								style="background: url('./images/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
						</div>
					</div>
				</form>
			</div>

			<div class="col-md-2"></div>

		</div>
	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>
</html>




