$(function(){
	$("input[name=uname]").blur(name);
	
	$("input[name=upassword]").blur(pass);
	//用户名验证
	function name(){
		var va=$("input[name=uname]").val();
		if(va=="" || va==null){
		$("input[name=uname]").css({"border-width":"2px","border-color":"red"});
		return false;
		}else{
			$("input[name=uname]").css("border-color","black");
			return true;
		}
	}
	//密码验证
	function pass(){
		var va=$("input[name=upassword]").val();
		var reg=/^[a-zA-Z0-9]{6,16}$/;
		if(va=="" || va==null || !reg.test(va)){
		$("input[name=upassword]").css({"border-width":"2px","border-color":"red"});
		return false;
		}else{
			$("input[name=upassword]").css("border-color","black");
			return true;
		}
	}
//登录 验证
$("input[type=submit]").click(function(){
	if(!name() || !pass()){
		alert("输入不合格!");
		return false;
	}else{
		
		return true;
	}
})


})