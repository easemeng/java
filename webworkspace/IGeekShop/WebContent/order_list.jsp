<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<script type="text/javascript">
	function payment(oid){
		window.location="${root}/product/ProductRelatedServlet?state=payment&oid=" + oid; 
	}
</script>

</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div style="margin: 0 auto; margin-top: 10px; width: 950px;">
				<strong>我的订单</strong>
				<table class="table table-bordered">
					<c:forEach items="${orderList}" var="order">
						<tbody>
							<tr class="success">
								<th colspan="5">订单编号:${order.oid}&nbsp;&nbsp;&nbsp;${order.state==0?"未付款":"待发货"}&nbsp;&nbsp;&nbsp;
									<c:if test="${order.state==0}">
										<a href="${root}/product/ProductRelatedServlet?state=delOrder&oid=${order.oid}">取消订单</a>
									</c:if> <c:if test="${order.state==1}">
										<a href="#">申请退款</a>
									</c:if></th>
							</tr>
							<tr class="warning">
								<th>图片</th>
								<th>商品</th>
								<th>价格</th>
								<th>数量</th>
								<th>小计</th>
							</tr>
							<c:forEach items="${order.orderItems}" var="orderItem">
								<tr class="active">
									<td width="60" width="40%"><input type="hidden" name="id"
										value="22"> <img src="${root}/${orderItem.product.pimage}"
										width="70" height="60"></td>
									<td width="30%"><a target="_blank">${orderItem.product.pname}</a></td>
									<td width="20%">￥${orderItem.product.shop_price}</td>
									<td width="10%">${orderItem.count}</td>
									<td width="15%"><span class="subtotal">￥${orderItem.subtotal}</span></td>
								</tr>
							</c:forEach>
							<tr class="success">
								<th colspan="5" style="text-align: right;" >合计:${order.total}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<c:if test="${order.state==0}"><a href="javascript:;" onclick="payment('${order.oid}')" class="payment">去付款</a></c:if></th>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
		</div>
		<div style="text-align: center;">
			<ul class="pagination">
				<li class="disabled"><a href="#" aria-label="Previous"><span
						aria-hidden="true">&laquo;</span></a></li>
				<li class="active"><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">6</a></li>
				<li><a href="#">7</a></li>
				<li><a href="#">8</a></li>
				<li><a href="#">9</a></li>
				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
		</div>
	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>

</html>