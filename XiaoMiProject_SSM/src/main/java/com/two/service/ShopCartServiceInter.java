package com.two.service;

import java.util.List;

import com.two.bean.PageBean;
import com.two.bean.ShopCartBean;

public interface ShopCartServiceInter {
	  abstract boolean insertShopCart(ShopCartBean s);
	  //分页
	  abstract PageBean<ShopCartBean> ShopCartPage(Integer id,Integer current,Integer len);
//	  删除
	  abstract boolean deleteShopCart(int id);
}
