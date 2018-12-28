$(function(){
	//全选
	$(".sub_top>input").change(function(){
		if($(this).is(":checked")){
			$("input[name=xuan]").each(function(){
				$(this).prop("checked",true);
			})
		}else{
			$("input[name=xuan]").each(function(){
				$(this).prop("checked",false);
			})
		}			 dange();
	})
		//改变数字 该变 小计
		  $(".sub_content>input[type=number]").each(function(a,b){
			  $(this).change(function(){
			 var va=$(this).val();
			 var price=$(".sub_content>span>input[name=dj]")[a].value;
			 $(".sub_content>span>input[name=xj]")[a].value=(va*price).toFixed(1);
			 dange();
		  })	  
		  })
		//单选的改变 级联
			$(".sub_content>input[name=xuan]").change(dange);
			function dange(){
//				一共多少件a
				var snum=0;
				//总价格
				var price=0;
				//几种
				var jnum=0;
				var xuan=document.getElementsByName("xuan");
				var xj=document.getElementsByName("xj");
				var num=document.getElementsByName("num"); 
				for(var i=0;i<xuan.length;i++){
					if(xuan[i].checked==true){
						jnum++;
						price+=parseInt(xj[i].value);
						snum+=parseInt(num[i].value);
					}
				}
			$("#jnum").text(jnum);
		    $("#snum").text(snum);
		    $("#price").text(price.toFixed(2));
			}

   //提交未处理
	
})