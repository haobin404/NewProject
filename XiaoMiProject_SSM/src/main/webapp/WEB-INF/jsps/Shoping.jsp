<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	      <% 
	String baseUrl = request.getContextPath()+"/"; 
	pageContext.setAttribute("baseUrl", baseUrl);%>
<html>
<head>
<meta charset="UTF-8">
<meta name="author" content="order by dede58.com" />
<title>我的购物车-小米商城</title>
<link rel="stylesheet" type="text/css" href="${baseUrl}css/style.css">
<script type="text/javascript" src="${baseUrl}js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${baseUrl}js/Shoping.js"></script>
</head>
<body>
	<!-- start header -->
	<!--end header -->
	<!-- start banner_x -->
	<div class="banner_x center">
		<a href="${baseUrl}index" target="_blank"><div class="logo fl"></div></a>

		<div class="wdgwc fl ml40">我的购物车</div>
		<div class="wxts fl ml20">温馨提示：产品是否购买成功，以最终下单为准哦，请尽快结算</div>
		<div class="dlzc fr">
			<ul><li><a href="${baseUrl}">[
			<c:choose>
			<c:when test="${empty user}">
			 未登录
			</c:when>
			<c:otherwise>
			 <font color="red">${user.uname}</font>
			</c:otherwise>
			</c:choose>
				]</a></li>
				<li>|</li>
				<li><a href="${baseUrl}register">注册</a></li>
			</ul>

		</div>
		<div class="clear"></div>
	</div>
	<div class="xiantiao"></div>
	<div class="gwcxqbj">
		<div class="gwcxd center">
			<div class="top2 center">
				<div class="sub_top fl">
					<input type="checkbox" value="quanxuan" class="quanxuan" name="quanxuan1"/>全选
				</div>
				<div class="sub_top fl">商品名称</div>
				<div class="sub_top fl">单价</div>
				<div class="sub_top fl">数量</div>
				<div class="sub_top fl">小计</div>
				<div class="sub_top fr">操作</div>
				<div class="clear"></div>
			</div>
			<c:forEach items="${pageBean.data}" var="data">
			<div class="content2 center">
				<div class="sub_content fl ">
					<input type="checkbox" class="quanxuan" name="xuan" />
				</div>
				<div class="sub_content fl">
					<img src="${baseUrl}image/${data.simg}" width="50px" height="70px" name="img">
				</div>
				<div class="sub_content fl ft20">${data.svname}</div>
				<div class="sub_content fl ">
				<span>
				<input type="text" value="${data.svprice}" name="dj" readonly="readonly"/>
				</span>
				</div>
				<div class="sub_content fl">
					<input class="shuliang" type="number" value="1" step="1" min="1" name="num">
				</div>
				<!-- 小计-->
				<div  class="sub_content fl">
				<span >
				<input type="text" value="${data.svprice}" name="xj" readonly="readonly"/>
				</span>
				</div>
				<div class="sub_content fl">
					<a href="/XiaoMiProject_SSM/shopCart/deleteShop/${data.scid}" onclick="return confirm('是否确定删除!')">×</a>
				</div>
				<div class="clear"></div>
			</div>
			</c:forEach>
			<!--  -->
			<div style="position:absolute;left:750px;">
			<c:choose>
					<c:when test="${pageBean.nowpage==1}">
					<font color="gray" size="5">首页</font>
					<font color="gray" size="5">上一页</font>
					</c:when>
					<c:otherwise>
					<a href="/XiaoMiProject_SSM/shopCart/pageShopCard?currentpage=1"><font color="red" size="5">首页</font></a>
					<a href="/XiaoMiProject_SSM/shopCart/pageShopCard?currentpage=${pageBean.nowpage-1}"><font color="red" size="5">上一页</font></a>
					</c:otherwise>
					</c:choose>
					<font color="blue" size="5">当前${pageBean.nowpage}页</font>
					<c:choose>
					<c:when test="${pageBean.sumpage==pageBean.nowpage}">
					<font color="gray" size="5">下一页</font>
					<font color="gray" size="5">尾页</font>
					</c:when>
					<c:otherwise>
					<a href="/XiaoMiProject_SSM/shopCart/pageShopCard?currentpage=${pageBean.nowpage+1}"><font color="red" size="5">下一页</font></a>
					<a href="/XiaoMiProject_SSM/shopCart/pageShopCard?currentpage=${pageBean.sumpage}"><font color="red" size="5">尾页</font></a>
					</c:otherwise>
					</c:choose>
					</div>
			<!--  -->
		</div>
		<div class="jiesuandan mt20 center">
			<div class="tishi fl ml20">
				<ul>
					<li><a href="./list.jsp">继续购物</a></li>
					<li>|</li>
					<li>共<span id="jnum">0</span>件商品，已选择<span id="snum">0</span>件
					</li>
					<!-- js-->
				</ul>

			</div>
			<div class="jiesuan fr">
				<div class="jiesuanjiage fl">
					合计（不含运费）：<span id="price">0.00</span>元
				</div>
				<div class="jsanniu fr">
					<input class="jsan" type="submit" name="jiesuan" value="去结算" />
				</div>
				<div class="clear"></div>
			</div>
			<div class="clear"></div>
		</div>

	</div>
	<!-- footer -->
	</body>
</html>
