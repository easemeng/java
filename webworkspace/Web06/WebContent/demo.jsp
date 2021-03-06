<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>三级联动页面</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/jq/jquery-1.8.3.js"></script>
<script type="text/javascript">
	// init 方法 查询所有的省以及直辖市 然后将查到的结果 放到第一个下拉框中 province 省
	$(function(){
		var url = "http://localhost:8080/Web06/LinkageServlet?state=init";
		$.post(url,function(data){
			$.each(data,function(){
				$("#province").append("<option value='" + this.id + "'>" + this.area_name + "</option>");
			});
		},"json");
	});
	$(function(){
		$("#province").change(function(){
			// alert(this.value);
			var url2 = "http://localhost:8080/Web06/LinkageServlet?state=city&pid=" + this.value;
			$.post(url2,function(data){
				// $("#city").empty();
				$("#area").prop("length",1);
				$("#city").prop("length",1);
				$.each(data,function(){
					$("#city").append("<option value='" + this.id + "'>" + this.area_name + "</option>");
				});
			},"json");
		});
	});
	$(function(){
		$("#city").change(function(){
			var url3 = "http://localhost:8080/Web06/LinkageServlet?state=area&cid=" + this.value;
			$.post(url3,function(data){
				// $("#area").empty(); // 变空之后 会产生一个小bug 由于清空之后只添加了一个option 所以值改变不了
				// $("#area").prop("length",1);		可以去掉 加不加无所谓 前一个加就可以
				$.each(data,function(){
					$("#area").append("<option value='" + this.id + "'>" + this.area_name + "</option>");
				});
			},"json");
		});
	})
</script>

</head>
<body>

	<center>
		<select id="province" name="province">
			<option value="none">--请选择省、直辖市--</option>
		</select>
		<select id="city" name="city">
			<option value="none">--请选择市--</option>
		</select>
		<select id="area" name="area">
			<option value="none">--请选择县、区--</option>
		</select>
	</center>

</body>
</html>