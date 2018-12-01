<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="${root}/css/bootstrap.min.css" type="text/css" />
<script src="${root}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="${root}/js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="${root}/css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
	width: 100%;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>


	<div class="row" style="width: 1210px; margin: 0 auto;">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
			</ol>
		</div>
		<c:forEach items="${pageBean.data}" var="pro">
			<div class="col-md-2" style="height: 230px">
				<a href="product_info.jsp"> <img src="${root}/${pro.pimage}"
					width="170" height="170" style="display: inline-block;">
				</a>
				<p>
					<a href="product_info.html" style='color: green'>${pro.pname}</a>
				</p>
				<p>
					<font color="#FF0000">商城价：&yen;${pro.shop_price}</font>
				</p>
			</div>
		</c:forEach>
		<!-- 		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10001.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>冬瓜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>

		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10002.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>圆白菜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>

		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10003.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>甜玉米</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>

		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10004.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>胡萝卜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10005.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>芹菜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>

		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10006.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>韭菜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>

		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10007.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>香菜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10008.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>土豆</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10007.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>香菜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10008.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>土豆</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10007.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>香菜</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="products/1/cs10008.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>土豆</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>
 -->
	</div>

	<!--分页 -->
	<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
		<ul class="pagination" style="text-align: center; margin-top: 10px;">
			<li><a href="${root}/index/IndexServlet?state=categorypage&page=1&cid=${pageBean.cid}" aria-label="Previous"><span aria-hidden="true">首页</span></a></li>
			<!-- <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li> -->
			<!-- start=1 end=5 -->
			
			<c:if test="${pageBean.currentPageNumber==1}">
				<li class="disabled"><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
			</c:if>
			<c:if test="${pageBean.currentPageNumber!=1}">
				<li ><a href="${root}/index/IndexServlet?state=categorypage&page=${pageBean.currentPageNumber-1}&cid=${pageBean.cid}" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
			</c:if>
			
			<c:forEach begin="${pageBean.start}" end="${pageBean.end}" step="1" var="i">
				<li <c:if test="${pageBean.currentPageNumber==i}">class="active"</c:if> ><a href="${root}/index/IndexServlet?state=categorypage&page=${i}&cid=${pageBean.cid}">${i}</a></li>
			</c:forEach>
			
			<c:if test="${pageBean.currentPageNumber==pageBean.totalPage}">
				<li class="disabled"><a href="javascript:void(0)" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</c:if>
			<c:if test="${pageBean.currentPageNumber!=pageBean.totalPage}">
				<li><a href="${root}/index/IndexServlet?state=categorypage&page=${pageBean.currentPageNumber+1}&cid=${pageBean.cid}" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</c:if>
			<!-- <li class="active"><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#">6</a></li>
			<li><a href="#">7</a></li>
			<li><a href="#">8</a></li>
			<li><a href="#">9</a></li> -->
			<li><a href="${root}/index/IndexServlet?state=categorypage&page=${pageBean.totalPage}&cid=${pageBean.cid}" aria-label="Next"><span aria-hidden="true">尾页</span></a></li>
		</ul>
	</div>
	<!-- 分页结束 -->

	<!--商品浏览记录-->
	<div
		style="width: 1210px; margin: 0 auto; padding: 0 9px; border: 1px solid #ddd; border-top: 2px solid #999; height: 246px;">

		<h4 style="width: 50%; float: left; font: 14px/30px 微软雅黑">浏览记录</h4>
		<div style="width: 50%; float: right; text-align: right;">
			<a href="">more</a>
		</div>
		<div style="clear: both;"></div>

		<div style="overflow: hidden;">

			<ul style="list-style: none;">
				<li
					style="width: 150px; height: 216; float: left; margin: 0 8px 0 0; padding: 0 18px 15px; text-align: center;"><img
					src="products/1/cs10001.jpg" width="130px" height="130px" /></li>
			</ul>

		</div>
	</div>


	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>

</html>