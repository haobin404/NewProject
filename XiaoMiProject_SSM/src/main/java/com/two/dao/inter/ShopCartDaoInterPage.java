package com.two.dao.inter;

import java.util.List;

import com.two.bean.ShopCartBean;

/**
 * 购物车列表的分页查询
 *
 */
public interface ShopCartDaoInterPage {

	//获取到购物车中总的商品数量
	public int getCount(int id);
	//分页显示购物车中的商品信息
	public List<ShopCartBean> getShop(int id,int currentPage,int pageSize);
	
}
