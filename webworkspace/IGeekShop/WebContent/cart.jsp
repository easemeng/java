<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>极客商城购物车</title>
<link rel="stylesheet" href="${root}/css/bootstrap.min.css"
	type="text/css" />
<script src="${root}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="${root}/js/bootstrap.min.js" type="text/javascript"></script>
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

</style>

<script type="text/javascript">
	function delOne(pid){
		if(confirm("您确定要删除该记录吗?")){
			window.location="${root}/product/ProductRelatedServlet?state=delCartProduct&pid=" + pid;
		}
	}
	function emptyCart(){
		if(confirm("您确定要清空购物车吗?")){
			window.location="${root}/product/ProductRelatedServlet?state=emptyCart";
		}
	}
</script>

</head>

<body>
	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>

	<c:if test="${empty cart}">
		<img src="${root}/images/cart-empty.png" />
		<a href="${root}/IndexServlet">返回首页</a>
	</c:if>
	<c:if test="${!empty cart}">
		<div class="container">
			<div class="row">

				<div style="margin: 0 auto; margin-top: 10px; width: 950px;">
					<strong style="font-size: 16px; margin: 5px 0;">订单详情</strong>
					<table class="table table-bordered">
						<tbody>
							<tr class="warning">
								<th>图片</th>
								<th>商品</th>
								<th>价格</th>
								<th>数量</th>
								<th>小计</th>
								<th>操作</th>
							</tr>

							<c:forEach items="${cart.cartItems}" var="cartItems">
								<tr class="active">
									<td width="60" width="40%"><input type="hidden" name="id"
										value="22"> <img
										src="${root}/${cartItems.value.product.pimage}" width="70"
										height="60"></td>
									<td width="30%"><a target="_blank">${cartItems.value.product.pname}</a></td>
									<td width="20%">￥${cartItems.value.product.shop_price}</td>
									<td width="10%"><input type="text" name="quantity"
										value="${cartItems.value.quantity}" maxlength="4" size="10"></td>
									<td width="15%"><span class="subtotal">￥${cartItems.value.subTotal}</span></td>
									<td><a href="javascript:;" onclick="delOne('${cartItems.value.product.pid}')" class="delete">删除</a></td>
								</tr>
							</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
			</div>

			<div style="margin-right: 130px;">
				<div style="text-align: right;">
					<em style="color: #ff6600;"> 登录后确认是否享有优惠&nbsp;&nbsp; </em> 赠送积分: <em
						style="color: #ff6600;">${cart.totlePrice/10}</em>&nbsp; 商品金额: <strong
						style="color: #ff6600;">￥${cart.totlePrice}元</strong>
				</div>
				<div
					style="text-align: right; margin-top: 10px; margin-bottom: 10px;">
					<a href="javascript:void(0)" onclick="emptyCart()" id="clear" class="clear">清空购物车</a> <a
						href="${root}/product/ProductRelatedServlet?state=submitOrder"> <input type="submit" width="100"
						value="提交订单" name="submit" border="0"
						style="background: url('./images/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
					</a>
				</div>
			</div>

		</div>

		<!-- 引入footer.jsp -->
		<jsp:include page="/footer.jsp"></jsp:include>
</body>

</html>