package com.two.service;

import java.util.List;
import java.util.Map;

import com.two.bean.PageBean;
import com.two.bean.ShopBean;
import com.two.bean.ShopVersionBean;

public interface ShopServiceInter {
	//按照类别取出商品
	abstract List<ShopBean> findShopTwoType(List<String> sb);
	//按照类别分页取出
	abstract PageBean findShopFenYeType(String[] str,int begin,int length);
	//根据id取出对应的商品
	abstract ShopBean getShopId(int id);
	//
	abstract List<ShopBean> getShopLike(String name);
}
