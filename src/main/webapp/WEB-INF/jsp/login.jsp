<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	login page
	${login.message }<p>
	<form action="${pageContext.request.contextPath}/user/login" method="post">
	username:<input type="text" name="username"><p>
	password:<input type="password" name="password"><p>
	<input type="checkbox" name="autologin" value="on" />自动登陆
			<input type="submit" value="登录">
	</form>
</body>
</html>