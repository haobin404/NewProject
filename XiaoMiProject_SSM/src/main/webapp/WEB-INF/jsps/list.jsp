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
		<title>小米手机列表</title>
		<link rel="stylesheet" type="text/css" href="${baseUrl}css/style.css">
	</head>
	<body>
 <jsp:include page="../header/header_g.jsp"/>
	<!--end header -->
<!-- start banner_x -->
<jsp:include page="../header/header.jsp"/>  
	<!--end header -->
	<!-- start danpin -->
		<div class="danpin center">
			<div class="biaoti center">${pagebean.type[0]}|${pagebean.type[1]}</div>
			<div class="main center">
			<!-- 遍历 begin-->
			<c:forEach items="${pagebean.data}" var="data" end="4">
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href="${baseUrl}shop/xqs/${data.sid}" target="_blank"><img src="${baseUrl}image/${data.simg}" alt=""></a></div>
					<div class="pinpai"><a href="${baseUrl}shop/xqs/${data.sid}" target="_blank">${data.sname}</a></div>
					<div class="youhui">${data.sintro }</div>
					<div class="jiage">${data.sprice}</div>
				</div>
				</c:forEach>
			<!--遍历end  -->	
				<div class="clear"></div>
			</div>
			<div class="main center mb20">
			<!-- 遍历 begin-->
			<c:forEach items="${pagebean.data}" var="data" begin="5" end="9">
				<div class="mingxing fl mb20" style="border:2px solid #fff;width:230px;cursor:pointer;" onmouseout="this.style.border='2px solid #fff'" onmousemove="this.style.border='2px solid red'">
					<div class="sub_mingxing"><a href="${baseUrl}shop/xqs?/${data.sid}"><img src="${baseUrl}image/${data.simg}" alt=""></a></div>
					<div class="pinpai"><a href="${baseUrl}shop/xqs/${data.sid}" >${data.sname}</a></div>
					<div class="youhui">${data.sintro }</div>
					<div class="jiage">${data.sprice}</div>
				</div>
				</c:forEach>
			<!--遍历end  -->	
				<div class="clear"></div>
			</div>
		</div>
		<div style="position:absolute;left:650px">
			<c:choose>
			<c:when test="${pagebean.nowpage==1}">
			<font size="4" color="gray">首页</font>
			<font size="4" color="gray">上一页</font>
			</c:when>
			<c:otherwise>
			<a href="${baseUrl}shop/ShopTypeList?name=${pagebean.type[0]}&name=${pagebean.type[1]}&nowpage=1"><font size="4" color="red">首页</font></a>
			<a href="${baseUrl}shop/ShopTypeList?name=${pagebean.type[0]}&name=${pagebean.type[1]}&nowpage=${pagebean.nowpage-1}"><font size="4" color="red">上一页</font></a>
			</c:otherwise>
			</c:choose>
			<font size="3" color="blue">当前${pagebean.nowpage}页</font>
			<c:choose>
			<c:when test="${pagebean.sumpage==pagebean.nowpage}">
			<font size="4" color="gray">下一页</font>
			<font size="4" color="gray">尾页</font>
			</c:when>
			<c:otherwise>
			<a href="${baseUrl}shop/ShopTypeList?name=${pagebean.type[0]}&name=${pagebean.type[1]}&nowpage=${pagebean.nowpage+1}"><font size="4" color="red">下一页</font></a>
			<a href="${baseUrl}shop/ShopTypeList?name=${pagebean.type[0]}&name=${pagebean.type[1]}&nowpage=${pagebean.sumpage}"><font size="4" color="red">尾页</font></a>
			</c:otherwise>
			</c:choose>
			</div>
		<jsp:include page="../header/floor.jsp"/>
	<!-- end danpin -->
	</body>
</html>