<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <% 
	String baseUrl = request.getContextPath()+"/"; 
	pageContext.setAttribute("baseUrl", baseUrl);%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header2</title>
</head>
<body>
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="http://www.mi.com/" target="_blank">小米商城</a></li>
						<li>|</li>
						<li><a href="#">MIUI</a></li>
						<li>|</li>
						<li><a href="#">米聊</a></li>
						<li>|</li>
						<li><a href="#">游戏</a></li>
						<li>|</li>
						<li><a href="#">多看阅读</a></li>
						<li>|</li>
						<li><a href="#">云服务</a></li>
						<li>|</li>
						<li><a href="#">金融</a></li>
						<li>|</li>
						<li><a href="#">小米商城移动版</a></li>
						<li>|</li>
						<li><a href="#">问题反馈</a></li>
						<li>|</li>
						<li><a href="#">Select Region</a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="./dingdan.jsp">我的订单</a></div>
					<div class="fr">
						<ul>
							<li><a href="${baseUrl}login" target="_self">
                                                                           【 <c:choose>
                              <c:when test="${!empty user}">
                               <font color="#ff6700">${user.uname}</font>
                              </c:when>
                             <c:otherwise>
                                                                         未登录
                             </c:otherwise>】
                             </c:choose>
                             </a></li>
							<li>|</li>
							<li><a href="${baseUrl}register" target="_self" >注册</a></li>
							<li>|</li>
							<li><a href="./self_info.html">个人中心</a></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
</body>
</html>