$(function(){
	//用户名验证
	$("input[name=uname]").blur(user);
	//密码验证
	$("input[name=upassword]").blur(pass);
	//密码匹配验证
	$("input[name=repassword]").blur(repass);
	//电话号码验证
	$("input[name=uphone]").blur(tel);
	//全部函数使用具体名称
	//用户名验证
	function user(){
	var va=$("input[name=uname]").val();
	var reg=/^[a-z][a-z0-9A-Z]{3,9}$/;
	if(va==null || va==="" || !reg.test(va)){
		$("#s1").text("用户名以字母开头 不能包含空格以及特殊字符");
		$("#s1").attr("style","color:red");
		return false;
	}else{
		$("#s1").html("<img src='/XiaoMiProject_SSM/image/win.png' width=20px height=20px line-height=-5/>");
	  return true;
	}
	}
	//密码验证
	function pass(){
		var va=$("input[name=upassword]").val();
		var reg=/^[a-zA-Z0-9]{6,16}$/;
		if(va==null || va==="" || !reg.test(va)){
			$("#s2").text("请输入6-16位字符 并且能为空");
			$("#s2").attr("style","color:red");
			return false;
		}else{
			$("#s2").html("<img src='/XiaoMiProject_SSM/image/win.png' width=20px height=20px line-height=-5/>");
		  return true;
		}}
		//密码匹配验证
		function repass(){
			var va=$("input[name=repassword]").val();
			var va1=$("input[name=upassword]").val();
			var reg=/^[a-zA-Z0-9]{6,16}$/;
			if(va==null || va==="" || !reg.test(va) || !(va===va1)){
				$("#s3").text("两次密码要输入一致哦");
				$("#s3").attr("style","color:red");
				return false;
			}else{
				$("#s3").html("<img src='/XiaoMiProject_SSM/image/win.png' width=20px height=20px line-height=-5/>");
			  return true;}
	}
		//电话号码验证
		function tel(){
			var va=$("input[name=uphone]").val();
			var reg=/^[0-9]{11}$/;
			if(va==null || va==="" || !reg.test(va)){
				$("#s4").text("不符合手机号码规范");
				$("#s4").attr("style","color:red");
				return false;
			}else{
				$("#s4").html("<img src='/XiaoMiProject_SSM/image/win.png' width=20px height=20px line-height=-5/>");
			  return true;}}
		//总 验证
		$("input[type=submit]").click(function(){
		   if(user() && pass() && repass() && tel()){
			   return true;
		   }else{
			   alert("输入不合格！");
			   return false;
		   }
		})
})
