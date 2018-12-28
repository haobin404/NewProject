$(function(){
//	var num=false;
	//版本点击时候 的判定 改变 以及相应的css变化
    $(".CheVer").click(function(){
//    	if(num==false){
//    		num=true;
//    	$(this).attr("style","background:rgba(255,67,0,0.3)");}
//    	else{
//    		num=false;
//    	$(this).attr("style","");}
    	var id=$(this).attr("id");
    	//如果id为bg 就会把bg1的颜色变化 bg2的变为默认 向反则反向操作
    	if(id==="bg1" || id=="bg1"){
    		$("#bg1").attr("style","background:rgba(255,67,0,0.3)");
    		$("#bg2").attr("style","");
    	}else{
    		$("#bg2").attr("style","background:rgba(255,67,0,0.3)");
    		$("#bg1").attr("style","");
    	}
    	//取出选中版本的文本
    	var va=$(this).text();
    	//将内容与价格拆分
    	var price=va.substring(va.lastIndexOf("|")+1);
    	var version=va.substring(0,va.lastIndexOf("|"));   
    	//将内容和价格写入不同的input元素中返回 
    	$("#div1").html("<input type=text size=10 readonly=readonly name=svname value="+version+">");
        $("#div").html("<input type=text value="+price+"size=5 name=svprice readonly=readonly>")
       //显示总价格
        $("#sumprice").text("总计："+price);
    });
    //颜色选择 取出文本 写入input显示 并且将本div背景色改变
    $(".bg3").click(function(){
    	var color=$(".yanse").text();
    	$("#div2").html("<input type=text size=5  readonly=readonly name=scolor value="+color+">");
		$(this).attr("style","background:rgba(255,67,0,0.3)");
    })
    //点击购买进行表单判定
    $("input[name=ding]").click(function(){
      var color=$("input[name=scolor]").val();
       var version=$("input[name=svname]").val();
        var uid=$("input[name=uid]").val();
       if(color==undefined || version==undefined ||color=="" || version==""){
    	   alert("请选择购买的类型!")
    	   return false;
       }else{
    	   if(uid=="" || uid==null){
     		    alert("请登录后操作!")
    		    return false;
    	   } else{
    		   $("form[name=frm]").attr("action","XiaoMiProject_SSM/shopCart/addShop");
    		   $("form[name=frm]").submit();
    	   }
       }
    })
    //点击加入购物车按钮 进行表单判定
    $("input[name=gou]").click(function(){
    	 var color=$("input[name=scolor]").val();
         var version=$("input[name=svname]").val();
          var uid=$("input[name=uid]").val();
         if(color==undefined || version==undefined ||color=="" || version==""){
      	      alert("请选择购买的类型!")
        	 return false;
         }else{
      	   if(uid=="" || uid==null){
      		    alert("请登录后操作!")
      		   return false;
      	   } else{
      		   $("form[name=frm]").attr("action","/XiaoMiProject_SSM/shopCart/addShop");
      		   $("form[name=frm]").submit();
      	   }
         }
    })
    
});
