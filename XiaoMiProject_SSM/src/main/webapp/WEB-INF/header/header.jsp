<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <% 
	String baseUrl = request.getContextPath()+"/"; 
	pageContext.setAttribute("baseUrl", baseUrl);%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header1</title>
</head>
<body>
<div class="banner_x center">
			<a href="${baseUrl}index"><div class="logo fl"></div></a>
			<a href=""><div class="ad_top fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="${baseUrl}shop/ShopTypeList?name=手机">小米手机</a></li>
					<li><a href="${baseUrl}shop/ShopTypeList?name=红米">红米</a></li>
					<li><a href="${baseUrl}shop/ShopTypeList?name=平板&name=笔记本">平板·笔记本</a></li>
					<li><a href="${baseUrl}shop/ShopTypeList?name=电视">电视</a></li>
					<li><a href="${baseUrl}shop/ShopTypeList?name=盒子&name=音箱">盒子·影音</a></li>
					<li><a href="${baseUrl}shop/ShopTypeList?name=路由器">路由器</a></li>
					<li><a href="${baseUrl}shop/ShopTypeList?name=智能硬件">智能硬件</a></li>
				</ul>
			</div>
			<div class="search fr">
				<form action="${baseUrl}shop/shopLike" method="get">
					<div class="text fl">
						<input type="text" class="shuru"  placeholder="小米6&nbsp;小米MIX现货" name="name">
					</div>
					<div class="submit fl">
						<input type="submit" class="sousuo" value="搜索"/>
					</div>
					<div class="clear"></div>
				</form>
				<div class="clear"></div>
			</div>
		</div>
</body>
</html>