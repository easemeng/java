<%@page import="java.util.*" import="com.igeek.web07.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List list = new ArrayList();
		list.add("白米饭");
		list.add("咸菜");
		list.add("蛋花汤");
		pageContext.setAttribute("list", list);
		
		Map map = new HashMap();
		map.put("sj1", "诺基亚");
		map.put("sj2", "黑莓");
		map.put("sj3", "摩托罗拉");
		map.put("sj4", "大哥大");
		map.put("aa.bb.cc", "8848钛金手机"); // 推荐使用key值中不要加入.
		pageContext.setAttribute("map", map);
		int[] arrays = {12,34,56,78,90};
		pageContext.setAttribute("arr", arrays,2);
		
		Person p = new Person("tom",122);
		pageContext.setAttribute("person", p);
		
		pageContext.setAttribute("x", "123abc");
	%>
	${arr[0]}
	<br />
	${tom[2]}
	<br />
	${map.sj4} <!-- 推荐写法 -->
	${map["sj4"]} <!-- 两种写法都可以	第二种写法 可以用在key值中包含很多.的场景 -->
	${map["aa.bb.cc"]}
	<br />
	${person.name}
	${person.age}
	<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
	${empty person}
	${10+20}
	${person!=null?person.name:""}
	
	<%-- ${x+123} --%> <!-- 产生 数字格式异常	x = 123abc	不能转化成基本数据类型 -->
</body>
</html>