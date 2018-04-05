<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function()
	{
		var date=new Date();
		alert("2018-03-06">date.toDateString());

        $("#insert").click(function()
        {
            alert("好！");
            window.href="insert";
			/*第一种
			 var data={"a":"b","c":"d"};
			 for(var i in data)
			 {
			 alert(i);
			 alert(data[i]);
			 console.log("key:"+i);
			 console.log("value:"+data[i]);
			 }  */

			/* 第二种
			 var data={"a":"b","c":"d"};
			 var value=data.a;
			 alert(value); */

			/* 第三种
			 var data={"a":"b","c":"d"};
			 $.each(data,function(i){
			 alert(i);
			 alert(data[i]);
			 }) */

			/* 对象遍历*/
			/* var data=[{"id":"1","name":"A1"},
			 {"id":"2","name":"A2"},
			 {"id":"3","name":"A3"},
			 {"id":"4","name":"A4"}];
			 for(var i in data)
			 {
			 alert(i);
			 //获取值
			 alert(data[i].id);
			 alert(data[i].name);

			 for(var j in data[i])
			 {
			 //获取键
			 alert("哈哈");
			 alert(j);
			 //获取值
			 alert(data[i][j]);
			 }
			 }    */

        })
	})

	function show()
	{
		alert(1);
	}


</script>
<title>首页欢迎你！</title>
</head>
<body>
	<form action="insert" method="post">
		<input type="text" name="name" />
		<input type="submit" value="提交"/>
	</form>
	<h1>${pageContext.request.contextPath}</h1>
	<h1><a href="student/find">查询</a></h1>
	<a href="/Che/student/insert">新增</a>
	<a href="/Che/student/add">添加</a>
	<a href="/Che/main.jsp">跳转</a>
	<table>
		<c:forEach items="${slist}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.name}</td>
			</tr>
		</c:forEach>
	</table>
	<h2 id="insert">点击啊！</h2>
	<h2 onclick="show()">点击跳转方法！</h2>
	<%-- <h2>${slist.size()}</h2> --%>
</body>
</html>