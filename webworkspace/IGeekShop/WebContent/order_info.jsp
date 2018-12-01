<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
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
	
	<div class="container">
		<div class="row">
			<div style="margin: 0 auto; margin-top: 10px; width: 950px;">
				<strong>订单详情</strong>
				<table class="table table-bordered">
					<tbody>
						<tr class="warning">
							<th colspan="5">订单编号:${order.oid}</th>
						</tr>
						<tr class="warning">
							<th>图片</th>
							<th>商品</th>
							<th>价格</th>
							<th>数量</th>
							<th>小计</th>
						</tr>
						
						<c:forEach items="${order.orderItems}" var="orderitem" >
							<tr class="active">
							<td width="60" width="40%"><input type="hidden" name="id"
								value="22"> <img src="${pageContext.request.contextPath}/${orderitem.product.pimage}" width="70"
								height="60"></td>
								<td width="30%"><a target="_blank">${orderitem.product.pname}</a></td>
							<td width="20%">￥${orderitem.product.shop_price}</td>
							<td width="10%">${orderitem.count}</td>
							<td width="15%"><span class="subtotal">￥${orderitem.subtotal}</span></td>
						</tr>
						</c:forEach>
					
					</tbody>
				</table>
			</div>

			<div style="text-align: right; margin-right: 120px;">
				商品金额: <strong style="color: #ff6600;">￥${order.total}元</strong>
			</div>
			<hr />
				<p style="text-align: right; margin-right: 100px;">
					<a href="${root}/product/ProductRelatedServlet?state=myOrder">
						<img src="./images/finalbutton.gif" width="204" height="51"
						border="0" />
					</a>
				</p>
			<hr />
		</div>
	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>

</html>