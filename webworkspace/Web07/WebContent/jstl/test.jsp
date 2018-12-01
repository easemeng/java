<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.igeek.web07.*" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 1. 导入jar包	两个		2. 导入c标签库 固定的话	(只要页面想要使用c标签	必须加上) -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		pageContext.setAttribute("name","tom123");
		pageContext.setAttribute("i", 1);
	%>
	
	asdfghjkl
	<!-- var 表示 存储在test中的结果	把true的值 存储到c1变量中 -->
	<c:if test="${name=='tom123'}" var="c1" scope="request">
		如果test属性中结果为true 那么显示到页面上
		${sessionScope.c1}
	</c:if>
	${requestScope.c1}
	<!-- 
		test中需要些el表达式		''
		test = "true false"
		var 表示test属性返回值存储在var属性中	var="c1"
		c1=test的结果
		scope 可以指定c1变量存储的位置
	 -->

	<hr />
	<c:choose>
		<c:when test="${i==1}">
			第一种
		</c:when>
		<c:when test="${i==2}">
			第二种
		</c:when>
		<c:otherwise>
			其他
		</c:otherwise>
	</c:choose>
	
	<%
		pageContext.setAttribute("name", "zmy");
		// 跟下面的写法 作用一样
		pageContext.setAttribute("name", 1,3);	// 等价写法
	%>
	<c:set var="name" value="${i}" scope="session"></c:set>
	<c:set var="root" value="${pageContext.request.contextPath }" scope="session"></c:set>
	${root}
	
	<%
		Person p = new Person("tom123",122);
		session.setAttribute("user", p);
	%>
	<!-- target 给哪一个对象设置属性 property	name -->
	<c:set target="${user }" property="name" value="柳岩" ></c:set>
	${user.name}
	<hr>
	
	<c:out value="$haha" escapeXml="" default="没有数据"></c:out>
	<hr>
	<!-- 
		escapeXml 当设置成true  默认会把你输出的内容当成一个字符串，而不是按照html语法去解析。
		escapeXml
	 -->
	 <c:out value="<a href='http://www.baidu.com'>超链接</a>" escapeXml="false" default="没有数据"></c:out>
	<hr>
	<%
		List list = new ArrayList();
		list.add("芒果1");
		list.add("芒果2");
		list.add("芒果3");
		list.add("芒果4");
		list.add("芒果5");
		list.add("芒果6");
		list.add("芒果7");
		list.add("芒果8");
		request.setAttribute("list", list);
	%>
	<!-- items 表示你要遍历的对象 。 var="l" 给里面的每一个元素取一个别名 。 begin end指定下标 。 
		step="2" 指定间隔  基本用不着。
		varStatus="s"  其实 s 对象就封装了循环过程中的一些状态信息。
	 -->
	 <c:forEach items="${list}" var="l" varStatus="s">
	 	${l},${s.index},${s.count},${s.first},${s.last}<br />
	 </c:forEach>
	 <hr>
	 <%
    	Map map = new HashMap();
    	map.put("addr1", "东京");
    	map.put("addr2", "东莞");
    	map.put("addr3", "巴黎");
    	map.put("addr4", "东南亚");
    
    	pageContext.setAttribute("map", map);
     %>
     <!-- items	条目 名目 项目 -->
     <c:forEach items="${map}" var="m">
     	${m.key} + ${m.value}
     </c:forEach>
</body>
</html>