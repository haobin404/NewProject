<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String baseUrl = request.getContextPath() + "/";
	pageContext.setAttribute("baseUrl", baseUrl);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="author" content="order by dede58.com" />
<title>会员登录</title>
<link rel="stylesheet" type="text/css" href="${baseUrl}css/login.css">
</head>
<body>
	<script type="text/javascript" src="${baseUrl}js/verify.js">
		
	</script>
	<script type="text/javascript" src="${baseUrl}js/jquery-3.3.1.js">
		
	</script>
	<script type="text/javascript" src="${baseUrl}js/login.js">
		
	</script>
	<!-- login -->
	<div class="top center">
		<div class="logo center">
<!-- 安全路径  需要 controller -->
			<a href="${baseUrl}"><img src="${baseUrl}image/mistore_logo.png" alt=""></a>
		</div>
	</div>
	<form method="post" action="${baseUrl}dl/login" class="form center">
		<div class="login">
			<div class="login_center">
				<div class="login_top">
					<div class="left fl">会员登录</div>
					<div class="right fr">
						您还不是我们的会员？<a href="${baseUrl}register" target="_self">立即注册</a>
					</div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>
				<div class="login_main center">
					<div class="username">
						用户名:&nbsp;<input class="shurukuang" type="text" name="uname"
							placeholder="请输入你的用户名" />
					</div>
					<div class="username">
						密&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;<input class="shurukuang"
							type="password" name="upassword" placeholder="请输入你的密码" />
					</div>
					<div class="username">
						<div class="left fl">
							验证码:&nbsp;<input class="yanzhengma" type="text" name="verify"
								placeholder="请输入验证码" />
						</div>
						<div class="right fl">
							<img src="${baseUrl}image/VerifyImage" id="ii" onclick="yan();">
						</div>
						<div class="clear"></div>
						<font size='3' color="red">${fail}</font>
					</div>
				</div>
				<div class="login_submit">
					<input class="submit" type="submit" name="submit" value="立即登录">
				</div>

			</div>
		</div>
	</form>
	<footer>
	<div class="copyright">简体 | 繁体 | English | 常见问题</div>
	<div class="copyright">
		小米公司版权所有-京ICP备10046444-<img src="./image/ghs.png" alt="">京公网安备11010802020134号-京ICP证110507号
	</div>
	</footer>
</body>
</html>