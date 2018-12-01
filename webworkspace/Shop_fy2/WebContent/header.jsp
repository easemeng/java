<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<script type="text/javascript">
	var content="";
	$(function (){
		$.post("${root}/index/IndexServlet?state=initnav",function (data){
			//alert(data);
			$.each(data,function(){
				content+="<li><a href='${root}/index/IndexServlet?state=categorypage&page=1&cid="+this.cid+"'>"+this.cname+"</a></li>"
			});
			$("#ulnav").html(content);
		},"json");
	});
</script>
<!DOCTYPE html>
<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="${root}/img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="${root}/img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top:20px">
		<ol class="list-inline">
			<%-- <li><a href="${root}/login.jsp">登录</a></li>
			<li><a href="register.jsp">注册</a></li> --%>
			<c:if test="${empty user }">
				<li><a href="${root}/login.jsp">登录</a></li>
				<li><a href="register.jsp">注册</a></li>
			</c:if>
			<c:if test="${not empty user }">
				<li><a href="#">${user.email}</a></li>
				<li><a href="${root}/loginOut.jsp">注销</a></li>
			</c:if>
			<li><a href="cart.jsp">购物车</a></li>
			<li><a href="order_list.jsp">我的订单</a></li>
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
				<!-- index.jsp -->
				<a class="navbar-brand" href="${root}/index/IndexServlet">首页</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul id="ulnav" class="nav navbar-nav">
					<%-- <li class="active"><a href="${root}/index/IndexServlet?state=pageInit">手机数码<span class="sr-only">(current)</span></a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li> --%>
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