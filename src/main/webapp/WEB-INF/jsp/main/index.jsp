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
<link rel="stylesheet" href="./css/bootstrap.min.css">
<script src="./js/jquery.min.js"></script>
<script src="./js/bootstrap.min.js"></script>
  </head>
  
  <body>
   	<img alt="" src="./img/NL.log.jpg" class="img-responsive" width="100%" margin-bottom="0">
    <div class="container" style="margin-bottom:5%">
    	<div class="row ">
    		<div class="col-xs-2" ></div>
    		<div class="col-xs-3" >
    			<input class="btn btn-default btn-block" type="button" value="Login" onclick="toLogin()">
    		</div>
    		<div class="col-xs-2"></div>
    		<div class="col-xs-3">
    			<input class="btn btn-default btn-block" type="button" value="Sign" onclick="toSign()">
    		</div>
    		<div class="col-xs-2" ></div>
    	</div>
    </div>   
  <div class="navbar navbar-default navbar-fixed-bottom text-center" >
    		<h4>© Rabbits.cn</h4>		
  </div>
  
  <script type="text/javascript">
  	function toSign(){
  		window.location.href="login/toSign.do";
  	}
  	function toLogin(){
		window.location.href="login/toLogin.do";  	
  	}
  </script>
  </body>
</html>
