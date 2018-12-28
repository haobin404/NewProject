<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
      <% 
	String baseUrl = request.getContextPath()+"/"; 
	pageContext.setAttribute("baseUrl", baseUrl);%>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="author" content="order by dede58.com"/>
		<title>${sessionScope.xqs_shop.sname}立即购买-小米商城</title>
		<link rel="stylesheet" type="text/css" href="${baseUrl}css/style.css">
	<script type="text/javascript" src="${baseUrl}js/jquery-3.3.1.js"></script>
		<script type="text/javascript" src="${baseUrl}js/xiangqing.js"></script>
	</head>
	<body>
	<!-- start header -->
 <jsp:include page="../header/header_g.jsp"/>
	<!--end header -->
<!-- start banner_x -->
<jsp:include page="../header/header.jsp"/> 
	<!--end header -->
	<!-- xiangqing -->
	<form action="/XiaoMiProject_SSM/shopCart/addShop" name="frm" method="post">
	<input type="hidden" value="${sessionScope.xqs_shop.simg}" name="simg"/>
		<input type="hidden" value="${user.uid}" name="uid"/>
     <input type="hidden" size="5" value="${sessionScope.xqs_shop.sname}" readonly="readonly" name="sname"/>
	<div class="xiangqing">
		<div class="neirong w">
			<div class="xiaomi6 fl">${sessionScope.xqs_shop.sname}</div>
			<div class="clear"></div>
		</div>	
	</div>
	<div class="jieshao mt20 w">
		<div class="left fl"><img src="${baseUrl}image/${sessionScope.xqs_shop.simg}" width="100%" height="100%"></div>
		<div class="right fr">
			<div class="h3 ml20 mt20">${sessionScope.xqs_shop.sname}</div>
			<div class="jianjie mr40 ml20 mt10">${sessionScope.xqs_shop.sintro}</div>
			<div class="jiage ml20 mt10" id="div">${sessionScope.xqs_shop.sprice}元</div>
			<div class="ft20 ml20 mt20">选择版本</div>
			<div class="xzbb ml20 mt10">
			<% int i=0; %>
			<c:forEach items="${sessionScope.xqs_version}" var="version" varStatus="vs">
			<% i++; %>
				<div class="CheVer banben fl" id="bg<%=i%>">
					<a>
						<span>${version.svname}</span>|
						<span>${version.svprice}元</span>
					</a>
				</div>
				</c:forEach>
				<div class="clear"></div>
			</div>
			<div class="ft20 ml20 mt20">选择颜色</div>
			<div class="xzbb ml20 mt10">
				<div class="bg3 banben">
					<a>
						<span class="yuandian"></span>
						<span class="yanse">${sessionScope.xqs_shop.scolor}</span>
					</a>
				</div>
				
			</div>
			<div class="xqxq mt20 ml20">
				<div class="top1 mt10" style="height:40%; width:100%;">
					<div class="left1 fl" id="div1">
					${fail}
					<!--js写入-->
					</div>
					<div class="right1 fl" id="div2">
					<!--js写入-->
                   </div> 
					<div class="clear"></div>
				</div>
				<div class="bot mt20 ft20 ftbc" id="sumprice">
				   
				</div>
			</div>
			<div class="xiadan ml20 mt20">
					<input class="jrgwc"  type="button" name="ding" value="立即选购" />
					<input class="jrgwc" type=button name="gou" value="加入购物车" />
				
			</div>
		</div>
		<div class="clear"></div>
	</div>
	</form>
	<!-- footer -->
<jsp:include page="../header/floor.jsp"/>
	</body>
</html>