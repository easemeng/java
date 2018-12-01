<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/Style1.css"
	rel="stylesheet" type="text/css" />
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>
<script type="text/javascript">
	function addCategory() {
		
		window.location.href = "${pageContext.request.contextPath}/admin/category/add.jsp";
	}
</script>
</HEAD>
<body>
	<br>
	<table cellSpacing="1" cellPadding="0" width="100%" align="center"
		bgColor="#f5fafe" border="0">
		<TBODY>
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3"><strong>分类列表</strong>
				</TD>
			</tr>
			<tr>
				<td class="ta_01" align="right">
					<button type="button" id="add" name="add" value="添加"
						class="button_add" onclick="addCategory()">
						&#28155;&#21152;</button>

				</td>
			</tr>
			<tr>
				<td class="ta_01" align="center" bgColor="#f5fafe">
					<table cellspacing="0" cellpadding="1" rules="all"
						bordercolor="gray" border="1" id="DataGrid1"
						style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
						<tr
							style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

							<td align="center" width="18%">序号</td>
							<td align="center" width="17%">分类名称</td>
							<td width="7%" align="center">编辑</td>
							<td width="7%" align="center">删除</td>
						</tr>
						<!-- 后台返回的是一个List嵌套category类型的数据 。 -->
						<c:forEach items="${categoryList}" var="category">
							<tr onmouseover="this.style.backgroundColor = 'white'"
							onmouseout="this.style.backgroundColor = '#F5FAFE';">
							<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="18%">${category.cid}</td>
							<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="17%">${category.cname}</td>
							<td align="center" style="HEIGHT: 22px">
							<!-- ${pageContext.request.contextPath}/admin/category/edit.jsp?cname=${category.cname} -->
							<a href="${pageContext.request.contextPath}/admin/AdminServlet?state=edit&cname=${category.cname}&cid=${category.cid}">
									<img src="${pageContext.request.contextPath}/images/i_edit.gif"
									border="0" style="CURSOR: hand">
							</a></td>
							<!-- 先写一个删除请求 。 -->
							<td align="center" style="HEIGHT: 22px"><a href="${pageContext.request.contextPath}/admin/AdminServlet?state=delete&cid=${category.cid}"> <img
									src="${pageContext.request.contextPath}/images/i_del.gif"
									width="16" height="16" border="0" style="CURSOR: hand">
							</a></td>
						</tr>
						</c:forEach>
						
						<!-- //修改当前方法 ， 提交一个请求给servlet，添加之前先查询单一数据，然后将输入放入到请求域中 。 -->
						<%-- <c:forEach items="${categoryList}" var="category">
							<tr onmouseover="this.style.backgroundColor = 'white'"
								onmouseout="this.style.backgroundColor = '#F5FAFE';">
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
									width="18%">${category.cid}</td>
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
									width="17%">${category.cname}</td>
								<td align="center" style="HEIGHT: 22px"><a
									href="${ pageContext.request.contextPath }/admin/AdminServlet?state=queryOne&cid=${category.cid}">
										<!-- 修改之前先查询单一 所以要带着当前商品的id... -->
										<img
										src="${pageContext.request.contextPath}/images/i_edit.gif"
										border="0" style="CURSOR: hand">
								</a></td>
								<!-- 删除的时候  请传入id... -->
								<td align="center" style="HEIGHT: 22px"><a href="${ pageContext.request.contextPath }/admin/AdminServlet?state=deleteOne&cid=${category.cid}"> <img
										src="${pageContext.request.contextPath}/images/i_del.gif"
										width="16" height="16" border="0" style="CURSOR: hand">
								</a></td>
							</tr>
						</c:forEach> --%>
						<%-- <tr onmouseover="this.style.backgroundColor = 'white'"
								onmouseout="this.style.backgroundColor = '#F5FAFE';">
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
									width="18%">1</td>
								<td style="CURSOR: hand; HEIGHT: 22px" align="center"
									width="17%">手机数码</td>
								<td align="center" style="HEIGHT: 22px"><a
									href="${ pageContext.request.contextPath }/admin/category/edit.jsp">
										<img
										src="${pageContext.request.contextPath}/images/i_edit.gif"
										border="0" style="CURSOR: hand">
								</a></td>

								<td align="center" style="HEIGHT: 22px"><a
									href="">
										<img src="${pageContext.request.contextPath}/images/i_del.gif"
										width="16" height="16" border="0" style="CURSOR: hand">
								</a></td>
							</tr> --%>
					</table>
				</td>
			</tr>
		</TBODY>
	</table>
</body>
</HTML>

