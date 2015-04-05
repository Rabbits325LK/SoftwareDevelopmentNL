<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="<%=basePath%>">

<title>My JSP 'sign.jsp' starting page</title>
<meta charset="utf-8">
<link rel="stylesheet" href="./css/bootstrap.min.css">
<script src="./js/jquery.min.js"></script>
<script src="./js/bootstrap.min.js"></script>

</head>

<body>
	<div class="container">
		<div class="row text-center"></div>
		<div class="row text-center" style="margin-bottom:5%">
			<h1>Sign Page</h1>
		</div>
		<div class="row" style="margin-bottom:10%">
			<div class="col-sm-1"></div>

			<div class="col-sm-10">
				<form action="login/toSign.do" method="post">

					<div class="form-group">
						<label class="col-sm-2 control-label"> empName: </label>
						<div class="col-sm-10">
							<input type="text" name="empName"
								class="form-control login-field">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label"> empPwd: </label>
						<div class="col-sm-10">
							<input type="password" name="empPwd"
								class="form-control login-field">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">address:</label>
						<div class="col-sm-10">
							<input type="text" name="address"
								class="form-control login-field">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label"> phone:</label>
						<div class="col-sm-10">
							<input type="tel" name="phone" class="form-control login-field">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label"> age:</label>
						<div class="col-sm-10">
							<input type="text" name="age" class="form-control login-field">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">empEmail</label>
						<div class="col-sm-10">
							<input type="email" name="empEmail"
								class="form-control login-field">
						</div>
					</div>
					<div class="form-group">
						<lable class="col-sm-2 control-label">empQQ</lable>
						<div class="col-sm-10">
							<input type="empQQ" name="empQQ" class="form-control login-field">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label"> birth:</label>
						<div class="col-sm-10">
							<input type="text" name="birthDate"
								class="form-control login-field">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">EmpLevel</label> <select
							name="empLevel" class="form-control">
							<c:forEach items="${empLevels }" var="el">
								<option value="${el.empLevel }">${el.empLevelName }</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">DepartmentNum</label> <select
							name="empLevel" class="form-control">
							<c:forEach items="${departmentNum }" var="dn">
								<option value="${dn.departmentNum }">${dn.departmentNumName }</option>
							</c:forEach>
						</select>
					</div>

					<div class="radio">
						<label>Sex</label> <label> <input type="radio" name="sex"
							id="sex" value="1" aria-label="男"> 男
						</label> <label> <input type="radio" name="sex" id="sex" value="0"
							aria-label="女"> 女
						</label>
					</div>


					<div class="col-xs-2"></div>
					<div class="col-xs-3">
						<input type="submit" value="sgin in" class="btn btn-block btn-default">
					</div>
					<div class="col-xs-2"></div>
					<div class="col-xs-3">
						<input type="button" value="come back" class="btn btn-block btn-default"
							onclick="comeback()">
					</div>
					<div class="col-xs-2"></div>

				</form>
			</div>
		</div>
	</div>
	<div class="navbar navbar-default navbar-fixed-bottom text-center">
		<h4>© Rabbits.cn</h4>
	</div>
	<script type="text/javascript">
		function comeback() {
			window.location.href = "login/index.do";
		}
	</script>
</body>
</html>
