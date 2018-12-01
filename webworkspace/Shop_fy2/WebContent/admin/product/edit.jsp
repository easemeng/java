<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 拿到项目的根路径  放入到域对象中 。 -->
<c:set var="root" value="${pageContext.request.contextPath }" />
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK href="${pageContext.request.contextPath}/css/Style1.css" type="text/css" rel="stylesheet">
	</HEAD>
	
	<body>
		<!--  -->
		<form id="userAction_save_do" name="Form1" action="${root}/admin/AdminProductServlet?state=update&pid=${product.pid}&pimage=${product.pimage}" method="post" enctype="multipart/form-data">
			<%-- <input type="hidden" name="pid" value="${product.pid}">
			<input type="hidden" name="pflag" value="${product.pflag}"> --%>
			
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<strong><STRONG>编辑商品</STRONG>
						</strong>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						商品名称：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="pname" value="${product.pname}" id="userAction_save_do_logonName" class="bg"/>
					</td>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						是否热门：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						
						<select name="is_hot">
							<c:if test="${product.is_hot==0}">
								<option selected value="0">否</option>
								<option value="1">是</option>
							</c:if>
							<c:if test="${product.is_hot==1}">
								<option  value="0">否</option>
								<option selected value="1">是</option>
							</c:if>
							<!-- ${product.pname} -->
							<!-- <option value="1">是</option>
							<option value="0">否</option> -->
						</select>
					</td>
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						市场价格：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="market_price" value="${product.market_price}" id="userAction_save_do_logonName" class="bg"/>
					</td>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						商城价格：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="shop_price" value="${product.shop_price}" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						商品图片：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="file" value="${product.pimage}" name="pimage" />
					</td>
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						所属分类：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<select name="cid">
							<c:forEach items="${categoryList}" var="category">
								<c:if test="${product.cid==category.cid}">
									<option selected value="${category.cid}">${category.cname}</option>
								</c:if>
								<c:if test="${product.cid!=category.cid}">
									<option value="${category.cid}">${category.cname}</option>
								</c:if>
							</c:forEach>
						<!-- 	<option value="">大型电器</option>
							<option value="">手机数码</option>
							<option value="">衣帽箱包</option> -->
						</select>
					</td>
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						商品描述：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<textarea name="pdesc" rows="5" cols="30">${product.pdesc}</textarea>
					</td>
				</tr>
				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="center"
						bgColor="#f5fafe" colSpan="4">
						<button type="submit" id="userAction_save_do_submit" value="确定" class="button_ok">
							&#30830;&#23450;
						</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<button type="reset" value="重置" class="button_cancel">&#37325;&#32622;</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
	</body>
</HTML>