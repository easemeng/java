<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>

<!-- 弹出层插件 -->
<link href="${pageContext.request.contextPath}/css/popup_layer.css"
	type="text/css" rel="stylesheet" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/popup_layer.js"></script>
<!-- 调用插件弹出层的方法 -->
<script type="text/javascript">
	$(function() {
		// 弹出层插件调用
		new PopupLayer({ // popuplayer 提示警告
			trigger : ".clickedElement", // 触发对象
			popupBlk : "#showDiv", // 弹出层的div id
			closeBtn : "#closeBtn", // 关闭按钮点击的元素
			useOverlay : true
		// overlay 覆盖物
		});

	});

	function findOrderInfoByOid(oid) {

		// 清除显示详情内容的表格的中的内容
		$("#showDivTab").html("");
		// 显示订单编号
		$("#shodDivOid").html(oid);
		// 将等待的图片变为隐藏
		$("#loading").css({"display" : "block"});

		$.post("${root}/order/OrderServlet?state=getOrderItems", {"oid" : oid},
				function(data) {
					$("#loading").css({"display" : "none"});

					var content = "<tr id='showTableTitle'>"
							+ "<th width='20%'>图片</th>"
							+ "<th width='25%'>商品</th>"
							+ "<th width='20%'>价格</th>"
							+ "<th width='15%'>数量</th>"
							+ "<th width='20%'>小计</th>" + "</tr>"
					for ( var i in data) {
						content += "<tr style='text-align: center;'>" + 
						"<td><img src='${pageContext.request.contextPath}/" + data[i].pimage + 
						"' width='70' height='60'></td>" + 
						"<td><a target='_blank'>" + data[i].pname + "</a></td>" + 
						"<td>￥" + data[i].shop_price + "</td>" + 
						"<td>" + data[i].count + "</td>" + 
						"<td><span class='subtotal'>￥" + data[i].subtotal + "</span></td>" + 
						"</tr>"
					}
					$("#showDivTab").html(content);
				},
			"json"
			)
	}
</script>

</HEAD>
<body>

	<form id="Form1" name="Form1"
		action="${pageContext.request.contextPath}/admin/order/list.jsp"
		method="post">
		<table cellSpacing="1" cellPadding="0" width="100%" align="center"
			bgColor="#f5fafe" border="0">
			<TBODY>
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3"><strong>订单列表</strong>
					</TD>
				</tr>

				<tr>
					<td class="ta_01" align="center" bgColor="#f5fafe">
						<table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

								<!-- <td align="center" width="10%">
										序号
									</td> -->
								<td align="center" width="10%">订单编号</td>
								<td align="center" width="10%">订单金额</td>
								<td align="center" width="10%">收货地址</td>
								<td align="center" width="10%">收货人</td>
								<td align="center" width="10%">订单状态</td>
								<td align="center" width="50%">订单详情</td>
							</tr>

							<c:forEach items="${orderList}" var="order">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<!-- <td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="18%">
										1
									</td> -->
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${order.oid}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${order.total}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="18%">${order.address}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${order.name}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">${order.state==0?"未付款":"已付款"}</td>
									<td align="center" style="HEIGHT: 22px"><input
										type="button" value="订单详情" class="clickedElement"
										onclick="findOrderInfoByOid('${order.oid}')" /></td>

								</tr>
							</c:forEach>

							<!-- 				<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="18%">
										1
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										12345
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										300
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										zhangsan
									</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="17%">
										已付款
									</td>
									<td align="center" style="HEIGHT: 22px">
										<input type="button" value="订单详情" class="clickedElement" onclick="findOrderInfoByOid('fc86891e-5126-452e-932d-c4fe382ba73f')"/>
									</td>
					
								</tr> -->

						</table>
					</td>
				</tr>

			</TBODY>
		</table>
	</form>

	<!-- 弹出层 HaoHao added -->
	<div id="showDiv" class="blk" style="display: none;">
		<div class="main">
			<h2>
				订单编号：<span id="shodDivOid" style="font-size: 13px; color: #999"></span>
			</h2>
			<a href="javascript:void(0);" id="closeBtn" class="closeBtn">关闭</a>
			<div id="loading" style="padding-top: 30px; text-align: center;">
				<img alt=""
					src="${pageContext.request.contextPath }/images/loading.gif">
			</div>
			<div style="padding: 20px;">
				<table id="showDivTab" style="width: 100%">
					<%-- <tr id='showTableTitle'>
						<th width='20%'>图片</th>
						<th width='25%'>商品</th>
						<th width='20%'>价格</th>
						<th width='15%'>数量</th>
						<th width='20%'>小计</th>
					</tr>
					<tr style='text-align: center;'>
						<td><img
							src='${pageContext.request.contextPath }/products/1/c_0014'
							width='70' height='60'></td>
						<td><a target='_blank'>电视机</a></td>
						<td>￥3000</td>
						<td>3</td>
						<td><span class='subtotal'>￥9000</span></td>
					</tr>
					<tr style='text-align: center;'>
						<td><img
							src='${pageContext.request.contextPath }/products/1/c_0014'
							width='70' height='60'></td>
						<td><a target='_blank'>电视机</a></td>
						<td>￥3000</td>
						<td>3</td>
						<td><span class='subtotal'>￥9000</span></td>
					</tr> --%>


				</table>
			</div>
		</div>

	</div>


</body>
</HTML>

