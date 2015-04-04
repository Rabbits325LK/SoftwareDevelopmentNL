<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<!-- <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page"> -->
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="./css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<!-- <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap-theme.min.css"> -->

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="./js/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="./js/bootstrap.min.js"></script>
  </head>
  
  <body>
   	<img alt="" src="./img/NL.log.jpg" class="img-responsive" width="100%" margin-bottom="0">
    <div class="container-fluid" style="margin-bottom:5%">
    	<div class="row">
    		<div class="col-xs-4" ></div>
    		<div class="col-xs-4" >
    			<button class="btn btn-default btn-block" type="submit">开始使用</button>
    		</div>
    		<div class="col-xs-4" ></div>
    	</div>
    </div>   
  <div class="navbar navbar-default navbar-fixed-bottom text-center" >
    		<h4>© Rabbits.cn</h4>		
  </div>
  </body>
</html>
