function check(){
	var phone=$("#phone").val();
$.ajax({
	url:"/Spring_Student_SSM/stu/check/"+phone,
    success:function(data){
    if(data=="ok"){
    	$("#sp").text("正确");
       	$("#sp").css("color","green");
    }else{
    	$("#sp").text("请输入合格的手机号0.0");
    	$("#sp").css("color","red");
    }
    }
})	

}