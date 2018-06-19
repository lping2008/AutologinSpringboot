<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bookebuy login</title>
</head>
<body>

	this is the index page	<p>
		<c:if test="${not empty user }">
			当前用户:${user.username}<p>
		</c:if>
		<a href="${pageContext.request.contextPath}/login">登录</a>
</body>
</html>