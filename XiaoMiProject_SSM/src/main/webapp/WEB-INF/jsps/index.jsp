<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
          <% 
	String baseUrl = request.getContextPath()+"/"; 
	pageContext.setAttribute("baseUrl", baseUrl);%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>小米商城</title>
		<link rel="stylesheet" type="text/css" href="${baseUrl}css/style.css">
        <script type="text/javascript" src="${baseUrl}js/jquery-3.3.1.js"></script>	
	<script type="text/javascript" src="${baseUrl}js/index.js"></script>
<!-- <link type="text/css" rel="stylesheet" href="http://i1.mb5u.com/css/jscode.css" />
 -->	</head>
 <script type="text/javascript">
/*  function load(){
	 setTimeout(window.location.reload(),50000);
 }
 /* 待定 */
	/*function moveAjax(one,two,three){
		  $.ajax({
			  url:"${baseUrl}shop/ShopType?name="+one+"&name="+two+"&name="+three,
			  success:function(){
				 $("#pop").css("display","block");
				load();
			  }
		  })
			} */
 </script>
	<body onload="show()">
 <jsp:include page="../header/header_g.jsp"/>
	<!--end header -->
<!-- start banner_x -->
<jsp:include page="../header/header.jsp"/>  
<!-- end banner_x -->
	<!-- start banner_y -->
		<div class="banner_y center" id="dd">
			<div class="nav">				
				<ul>
				<!--one begin  -->
					<li class="lisd">
		<a href="${baseUrl}shop/ShopType?name=手机&name=电话卡">手机&nbsp;&nbsp;电话卡</a>
					</li>
					<!--one end  -->
					<li class="lisd">
	<a href="${baseUrl}shop/ShopType?name=笔记本&name=平板">笔记本&nbsp;&nbsp;平板</a>
					</li>
					<li class="lisd">
	<a href="${baseUrl}shop/ShopType?name=电视&name=盒子">电视&nbsp;&nbsp;盒子</a>
					</li>
					<li class="lisd">
	<a href="${baseUrl}shop/ShopType?name=路由器&name=智能硬件">路由器&nbsp;&nbsp;智能硬件</a>
					</li>
					<li class="lisd">
	 <a href="${baseUrl}shop/ShopType?name=移动电源&name=电池&name=插线板">电池&nbsp;&nbsp;移动电源&nbsp;&nbsp;插线板</a>
						
					</li>
					<li class="lisd">
	<a href="${baseUrl}shop/ShopType?name=耳机&name=音箱">耳机&nbsp;&nbsp;音箱</a>
					</li>
					<li class="lisd">
	<a href="${baseUrl}shop/ShopType?name=保护套&name=贴膜">保护套&nbsp;&nbsp;贴膜</a>
						
					</li>
					<li class="lisd">
	<a href="${baseUrl}shop/ShopType?name=线材&name=支架&name=储存卡">线材&nbsp;&nbsp;支架&nbsp;&nbsp;储存卡</a>
					</li>
					<li class="lisd">
	<a href="${baseUrl}shop/ShopType?name=鞋&name=眼镜&name=服饰&name=箱包">鞋&nbsp;&nbsp;眼镜&nbsp;&nbsp;服饰&nbsp;&nbsp;箱包</a>
							
					</li>
					<li  class="lisd">
	<a href="${baseUrl}shop/ShopType?name=米兔&name=生活周边">米兔&nbsp;&nbsp;生活周边</a>
				<c:if test="${!empty shops}">  
							<div class="pop" id="pop">
							<!-- left -->
							<div class="left fl">
							<!--  -->
							<c:forEach items="${shops}" var="shop" end="5">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${baseUrl}image/${shop.simg}" width="40px" height="50px" alt=""></div>
											<span class="fl">${shop.sname}</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="${baseUrl}shop/xqs/${shop.sid}">选购</a></div>
									<div class="clear"></div>
								</div>
								</c:forEach>
								</div>
								<!--  left end-->
									<!-- ctn -->
								<div class="ctn fl">
					           <c:forEach items="${shops}" var="shop" begin="5" end="10">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${baseUrl}image/${shop.simg}" width="40px" height="50px" alt=""></div>
											<span class="fl">${shop.sname}</span>
											<div class="clear"></div>
										</a>
									</div>
									<div class="xuangou_right fr"><a href="${baseUrl}shop/xqs/${shop.sid}">选购</a></div>
									<div class="clear"></div>
								</div>
								</c:forEach>
							</div>
                                 <!--ctn end  -->
								<!-- rigth-->
							<div class="right fl">
							<c:forEach items="${shops}" var="shop" begin="10" end="15">
								<div>
									<div class="xuangou_left fl">
										<a href="">
											<div class="img fl"><img src="${baseUrl}image/${shop.simg}" width="40px" height="50px" alt=""></div>
											<span class="fl">${shop.sname}</span>
											<div class="clear"></div>
										</a>
									</div>
				            <div class="xuangou_right fr"><a href="${baseUrl}shop/xqs/${shop.sid}">选购</a></div>
									<div class="clear"></div>
								</div>
								</c:forEach>
							</div>
							<!-- rigth end-->
							<div class="clear"></div>
						</div>
					 </c:if>  
					</li>
				</ul>
			</div>
                <!-- shop end -->		
		</div>	

		<div class="sub_banner center">
			<div class="sidebar fl">
				<div class="fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/hjh_01.gif"></a></div>
				<div class="fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/hjh_02.gif"></a></div>
				<div class="fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/hjh_03.gif"></a></div>
				<div class="fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/hjh_04.gif"></a></div>
				<div class="fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/hjh_05.gif"></a></div>
				<div class="fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/hjh_06.gif"></a></div>
				<div class="clear"></div>
			</div>
			<div class="datu fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/hongmi4x.png" alt=""></a></div>
			<div class="datu fl"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/xiaomi5.jpg" alt=""></a></div>
			<div class="datu fr"><a href="javascript:alert('暂无货源')"><img src="${baseUrl}image/pinghengche.jpg" alt=""></a></div>
			<div class="clear"></div>


		</div>
	<!-- end banner -->
	<!-- <div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>

	start danpin
		<div class="danpin center">
			
			<div class="biaoti center">小米明星单品</div>
			<div class="main center">
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="./image/pinpai1.png" alt=""></a></div>
					<div class="pinpai"><a href="">小米MIX</a></div>
					<div class="youhui">5月9日-21日享花呗12期分期免息</div>
					<div class="jiage">3499元起</div>
				</div>
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="./image/pinpai2.png" alt=""></a></div>
					<div class="pinpai"><a href="">小米5s</a></div>
					<div class="youhui">5月9日-10日，下单立减200元</div>
					<div class="jiage">1999元</div>
				</div>
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="./image/pinpai3.png" alt=""></a></div>
					<div class="pinpai"><a href="">小米手机5 64GB</a></div>
					<div class="youhui">5月9日-10日，下单立减100元</div>
					<div class="jiage">1799元</div>
				</div>
				<div class="mingxing fl"> 	
					<div class="sub_mingxing"><a href=""><img src="./image/pinpai4.png" alt=""></a></div>
					<div class="pinpai"><a href="">小米电视3s 55英寸</a></div>
					<div class="youhui">5月9日，下单立减200元</div>
					<div class="jiage">3999元</div>
				</div>
				<div class="mingxing fl">
					<div class="sub_mingxing"><a href=""><img src="./image/pinpai5.png" alt=""></a></div>
					<div class="pinpai"><a href="">小米笔记本</a></div>
					<div class="youhui">更轻更薄，像杂志一样随身携带</div>
					<div class="jiage">3599元起</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<div class="peijian w">
			<div class="biaoti center">配件</div>
			<div class="main center">
				<div class="content">
					<div class="remen fl"><a href=""><img src="./image/peijian1.jpg"></a>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span>新品</span></div>
						<div class="tu"><a href=""><img src="./image/peijian2.jpg"></a></div>
						<div class="miaoshu"><a href="">小米6 硅胶保护套</a></div>
						<div class="jiage">49元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="">
								<span>发货速度很快！很配小米6！</span>
								<span>来至于mi狼牙的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian3.jpg"></a></div>
						<div class="miaoshu"><a href="">小米手机4c 小米4c 智能</a></div>
						<div class="jiage">29元</div>
						<div class="pingjia">372人评价</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:red">享6折</span></div>
						<div class="tu"><a href=""><img src="./image/peijian4.jpg"></a></div>
						<div class="miaoshu"><a href="">红米NOTE 4X 红米note4X</a></div>
						<div class="jiage">19元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="">
								<span>发货速度很快！很配小米6！</span>
								<span>来至于mi狼牙的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian5.jpg"></a></div>
						<div class="miaoshu"><a href="">小米支架式自拍杆</a></div>
						<div class="jiage">89元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="">
								<span>发货速度很快！很配小米6！</span>
								<span>来至于mi狼牙的评价</span>
							</a>
						</div>
					</div>
					<div class="clear"></div>
				</div>
				<div class="content">
					<div class="remen fl"><a href=""><img src="./image/peijian6.png"></a>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian7.jpg"></a></div>
						<div class="miaoshu"><a href="">小米指环支架</a></div>
						<div class="jiage">19元</div>
						<div class="pingjia">372人评价</div>
						<div class="piao">
							<a href="">
								<span>发货速度很快！很配小米6！</span>
								<span>来至于mi狼牙的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian8.jpg"></a></div>
						<div class="miaoshu"><a href="">米家随身风扇</a></div>
						<div class="jiage">19.9元</div>
						<div class="pingjia">372人评价</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian9.jpg"></a></div>
						<div class="miaoshu"><a href="">红米4X 高透软胶保护套</a></div>
						<div class="jiage">59元</div>
						<div class="pingjia">775人评价</div>
					</div>
					<div class="remenlast fr">
						<div class="hongmi"><a href=""><img src="./image/hongmin4.png" alt=""></a></div>
						<div class="liulangengduo"><a href=""><img src="./image/liulangengduo.png" alt=""></a></div>					
					</div>
					<div class="clear"></div>
				</div>				
			</div>
		</div> -->
			<!-- start header -->
	<!--end header -->
		<jsp:include page="../header/floor.jsp"/>
	</body>
</html>