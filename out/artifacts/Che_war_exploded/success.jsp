<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功页面</title>
</head>
<body>
	<%-- <h1>success.jsp
	${usersVo.username } | 
	${classVo.cname } |
	${classVo.username }</h1> --%>
	
	<!--怎么迭代List<String>集合-->
	<%-- <c:forEach items="${username}" var="u">
		${u}
	</c:forEach> --%>
	
	<!--迭代map集合-->
	<%-- <c:forEach items="${map}" var="m">
		${m.key}:${m.value}
	</c:forEach> --%>
	
	<h2>
	<!--迭代List<UsersVo>集合-->
	<%-- <c:forEach items="${list}" var="u">
		${u.username } - ${u.password }
	</c:forEach> --%>
	</h2>
</body>
</html>