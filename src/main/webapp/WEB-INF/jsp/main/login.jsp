<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>My JSP 'login.jsp' starting page</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
	<script src="./js/jquery.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	
	<script  type="text/javascript">
	//登录验证
	function check_login() {
		//验证账号是否为空
		var admin_code = $("#empCode").val();
		if (admin_code == "") {
			$("#admin_code_msg").text("请输入账号.");
			return;
		}
		//验证密码是否为空
		var password = $("#empPwd").val();
		if (password == "") {
			$("#password_msg").text("请输入密码.");
			return;
		}
		//验证验证码是否为空
		var image_code = $("#code").val();
		if (image_code == "") {
			$("#image_msg").text("请输入验证码.");
			return;
		}
		//提交表单，验证账号密码是否正确
		$.post("login/checkLogin.do", $("#login_form1").serialize(), function(data) {
			if (data == 0) {
				//成功，去向系统首页
				location.href = "./ship/toIndex.do";
			} else if (data == 1) {
				$("#admin_code_msg").text("账号错误.");
			} else if (data == 2) {
				$("#password_msg").text("密码错误.");
			} else {
				$("#image_msg").text("验证码错误.");
			}
		});
	}
	//重置提示信息
	function set_msg(id, txt) {
		$("#" + id).text(txt);
	}
	//刷新验证码图片
	function change_image() {
		$("#image_code").attr("src",
				"login/createImage.do?date=" + new Date().getTime());
	}
	function come_back(){
		location.href = "login/index.do";
	}
</script>
  </head>
  
  <body>
    <div class="container">
    	<div class="row text-center" style="margin-bottom:5%">
    		<h1>Login Page</h1>
    	</div>
    	<div class="row">
 		<div class="col-xs-2"></div>   
    	<div class="col-xs-8">  
		<form action="login/checkLogin.do" method="post" class="uk-form" name="login_form1" 
			id="login_form1">
          <div class="login-form" >
            <div class="form-group">
    		  <label>帐号：</label>
              <input type="text" class="form-control login-field" value="" placeholder="Enter your name" id="adminCode"
              name="empCode"onfocus="set_msg('admin_code_msg','30长度的字母、数字和下划线');" />
              <label class="login-field-icon fui-user" for="empCode"><span class="required" id="admin_code_msg" style="font-size:5px"></span></label>
            </div>

            <div class="form-group">
  			  <label>密码：</label>
              <input type="password" class="form-control login-field" value="" placeholder="Enter password" id="empPwd" name="empPwd"
              onfocus="set_msg('password_msg','30长度的字母、数字和下划线');" />
              <label class="login-field-icon fui-lock" for="empPwd"><span class="required" id="password_msg" style="font-size:5px"></span></label>
            </div>
			
			<div class="row">
			<div class="col-xs-6">
              <input name="code" id="code" type="text" class="form-control login-field" value="" placeholder="code num"
								onfocus="set_msg('image_msg','')" />
			  <label class="login-field-icon fui-lock" for="code"><span class="required" style="font-size:5px" id="image_msg"></span></label>
			</div>
			<div class="col-xs-6"><img src="login/createImage.do"
								alt="验证码" title="点击更换" id="image_code" onclick="change_image();" /></div>					
			</div>					
            
			
            <a class="btn btn-primary btn-lg btn-block" href="javascript:check_login();">Log in</a>
           <!--  <a class="btn btn-primary btn-lg btn-block" href="#">back</a> -->
            <a class="login-link" href="login/index.do">come back!</a>
          </div>
          </form>
          </div>
          <div class="col-xs-2"></div>
          </div>
    </div>
    <div class="navbar navbar-default navbar-fixed-bottom text-center" >
    		<h4>© Rabbits.cn</h4>		
  </div>
  </body>
</html>
