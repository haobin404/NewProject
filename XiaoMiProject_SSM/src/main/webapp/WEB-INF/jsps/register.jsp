<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String baseUrl = request.getContextPath() + "/";
	pageContext.setAttribute("baseUrl", baseUrl);
%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户注册</title>
		<link rel="stylesheet" type="text/css" href="${baseUrl}css/login.css">
     <script type="text/javascript" src="${baseUrl}js/verify.js">
		      </script>
 <script type="text/javascript" src="${baseUrl}js/jquery-3.3.1.js">
		      </script>
	 <script type="text/javascript" src="${baseUrl}js/register.js">
		      </script>
	</head>
	<body>
		<form  method="post" action="${baseUrl}dl/registerUser">
		<div class="regist">
			<div class="regist_center">
				<div class="regist_top">
					<div class="left fl">会员注册</div>
					<div class="right fr"><a href="${baseUrl}login" target="_self">小米商城</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="regist_main center">
					<div class="username">用&nbsp;&nbsp;户&nbsp;&nbsp;名:&nbsp;&nbsp;<input class="shurukuang" type="text" name="uname" placeholder="请输入你的用户名"/><span id="s1">用户名以字母开头 不能包含空格以及特殊字符</span></div>
					<div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;<input class="shurukuang" type="password" name="upassword" placeholder="请输入你的密码"/><span id="s2">请输入6-16位字符 并且能为空</span></div>
					
					<div class="username">确认密码:&nbsp;&nbsp;<input class="shurukuang" type="password" name="repassword" placeholder="请确认你的密码"/><span id="s3">两次密码要输入一致哦</span></div>
					<div class="username">手&nbsp;&nbsp;机&nbsp;&nbsp;号:&nbsp;&nbsp;<input class="shurukuang" type="text" name="uphone" placeholder="请填写正确的手机号"/><span id="s4">填写下手机号吧，方便我们联系您！</span></div>
					<div class="username">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:&nbsp;&nbsp;<input class="shurukuang" type="email" name="uemail" placeholder="请确认你的邮箱"/><span>符合邮箱格式</span></div>
					<div class="username">
						<div class="left fl">验&nbsp;&nbsp;证&nbsp;&nbsp;码:&nbsp;&nbsp;<input class="yanzhengma" type="text" name="verify" placeholder="请输入验证码"/></div>
						<div class="right fl"><img  src="${baseUrl}image/VerifyImage" id="ii" onclick="yan();">&nbsp;&nbsp;&nbsp;<span style="color:red">${fail }</span></div>
						<div class="clear"></div>
					</div>
				</div>
				<div class="regist_submit">
					<input class="submit" type="submit" name="submit" value="立即注册"/>
				</div>
			</div>
		</div>
		</form>
	</body>
</html>