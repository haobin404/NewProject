package com.two.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
 * 购物车
 * @author Administrator
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;

import com.two.bean.PageBean;
import com.two.bean.ShopCartBean;
import com.two.bean.UserBean;
import com.two.service.ShopCartServiceInter;
@Controller
@RequestMapping("/shopCart")
public class ShopCartController {
	@Autowired
	private ShopCartServiceInter shopc;
	/**
	 * 加入购物车
	 * @param shopCarBean
	 * @return
	 */
	@PostMapping(value="addShop")
	public String addShop(ShopCartBean shopCarBean) {
		System.out.println("-----------------------0.0.");
		shopCarBean.setSvprice(shopCarBean.getSvprice().substring(0,shopCarBean.getSvprice().lastIndexOf("元")));
		boolean bo = shopc.insertShopCart(shopCarBean);
		if(bo) {
			return "forward:pageShopCard";
		}else {
			return "xianqing";
		}
	}
	/**
	 * 购物车分页
	 * @param currentpage
	 * @param session
	 * @return
	 */
	@RequestMapping("pageShopCard")
	public String pageShopCard(Integer currentpage,HttpSession session) {
		UserBean u=(UserBean)session.getAttribute("user");
		if (currentpage == null) {
			currentpage = 1;
		}
		PageBean<ShopCartBean> shopCartPage = shopc.ShopCartPage(u.getUid(),currentpage,3);
		session.setAttribute("pageBean", shopCartPage);
		// 重定向到页面
		return "Shoping";
	}
	/**
	 * 删除
	 * @param id 删除的id
	 * @return
	 */
	@RequestMapping("deleteShop/{id}")
	public String deleteShop(@PathVariable Integer id) {
		shopc.deleteShopCart(id);
         return "forward:/shopCart/pageShopCard";			
	}

} 