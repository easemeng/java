<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>

<script>
	$(function(){
		
		var count = "";
		// 发送一个ajax请求 到后台服务器获取category数据
		$.post(
			"${pageContext.request.contextPath}/product/ProductRelatedServlet?state=categoryPage",
			// 第一个参数 发送的URL的地址	 第二个参数 数据 (要获取所有的数据 所以不传参数)
			function(data){
				// 解析data   将数据绑定到页面中
				// [{"cid":"xxx","cname":"xxx"},{},{}...]
				$.each(data,function(){
					count += "<li><a href='${pageContext.request.contextPath}/product/ProductRelatedServlet?state=productCgPage&page=1&cid="+ this.cid +"'>"+ this.cname +"</a></li>";
				})
				
/* 				for(var i = 0;i < data.length;i++){
					count += "<li><a href='${pageContext.request.contextPath}/product/ProductRelatedServlet?state=productCgPage&pid=1&cid="+ data[i].cid +"'>"+ data[i].cname +"</a></li>";
				} */
				
				$("#categoryUL").html(count);
			},
			"json"
		);
		// 动态的绑定到页面中
		
	})
</script>

<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="${root}/img/logo.png" />
	</div>
	<div class="col-md-5">
		<img src="${root}/img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top:20px">
		<ol class="list-inline">
			<c:if test="${empty user}">
				<li><a href="${root}/login.jsp">登录</a></li>
				<li><a href="${root}/register.jsp">注册</a></li>
			</c:if>
			<c:if test="${not empty user}">
				<li><a href="#">${user.username}</a></li>
				<li><a href="${root}/loginOut.jsp">注销</a></li>
			</c:if>
			<li><a href="${root}/cart.jsp">购物车</a></li>
			<li><a href="${root}/product/ProductRelatedServlet?state=myOrder">我的订单</a></li>
			<li><a href="${root}/product/ProductRelatedServlet?state=waitingForDelivery">待发货</a></li>
		</ol>
	</div>
</div>

<!-- 导航条 -->
<div class="container-fluid">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${root}/product/ProductRelatedServlet?state=index">首页</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav" id="categoryUL">
<!-- 				<li class="active"><a href="product_list.htm">手机数码<span class="sr-only">(current)</span></a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li> -->
					
<%-- 				<c:forEach items="${CategoryList}" var="category">
					<li><a href="#">${category.cname}</a></li>
					</c:forEach> --%>
					<!-- 只在主页面显示  -->
				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</nav>
</div>