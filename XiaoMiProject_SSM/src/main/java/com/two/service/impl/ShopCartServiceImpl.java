package com.two.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.two.bean.PageBean;
import com.two.bean.ShopCartBean;
import com.two.dao.inter.ShopCartDaoInter;
import com.two.service.ShopCartServiceInter;
@Service
public class ShopCartServiceImpl implements ShopCartServiceInter {
	private static PageBean<ShopCartBean> page=new PageBean<ShopCartBean>();
    //插入订单数据
	@Autowired
	private ShopCartDaoInter shopcardap;
	@Override
	public boolean insertShopCart(ShopCartBean s) {
		System.out.println(s);
	     try {
			shopcardap.insertShopCart(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return true;
	}
	@Override
	public boolean deleteShopCart(int id) {
		try {
			shopcardap.deleteShopCart(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	return true;
	}
	/**
	 * 分页
	 */
	@Override
	public  PageBean<ShopCartBean> ShopCartPage(Integer uid,Integer current,Integer len) {
		page.setNowpage(current);
		// 获取到总的数据量
		int count=0;
		try {
			count = shopcardap.getCount(uid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.setCount(count);
		// 设置页面的大小为3个
		page.setRowsize(len);
		// 获取到当前页的总数据量
		List<ShopCartBean> shopCar = shopcardap.getShop(uid,(current-1)*len, len);
		page.setData(shopCar);
		return page;
	}

}
