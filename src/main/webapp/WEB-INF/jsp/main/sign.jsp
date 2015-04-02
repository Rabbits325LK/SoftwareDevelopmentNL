<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="<%=basePath%>">

<title>My JSP 'sign.jsp' starting page</title>
<meta charset="utf-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	This is my Sign page.
	<br>
	<form action="login/toSign.do" method="post">
		empName:<input type="text" name="empName"><br> empPwd:<input
			type="password" name="empPwd"><br> address:<input
			type="text" name="address"><br> department:<input
			type="text" name="department"><br> phone:<input
			type="tel" name="phone"><br> sex:<input type="radio"
			name="sex" value="1" /> 男 <input type="radio" name="sex" value="0" />
		女 <br> age:<input type="text" name="age"><br>
		emplevel:<input type="radio" name="emplevel" value="0" />老总 <input
			type="radio" name="emplevel" value="1" /> 经理 <input type="radio"
			name="emplevel" value="2" /> 职员<br> birth:<input type="text"
			name="birthDate">("1990-00-25")
			
			<br> <input type="submit" value="sgin in">
		<input type="reset" value="reset">
	</form>
</body>
</html>
