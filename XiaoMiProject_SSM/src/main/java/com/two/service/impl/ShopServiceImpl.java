package com.two.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.two.bean.PageBean;
import com.two.bean.ShopBean;
import com.two.dao.inter.ShopDaoInter;
import com.two.service.ShopServiceInter;
@Service
public class ShopServiceImpl implements ShopServiceInter {
	@Autowired
     private ShopDaoInter shopd;
     private static PageBean<ShopBean> pagebean=new PageBean<ShopBean>();
	@Override
	public List<ShopBean> findShopTwoType(List<String> sb) {
		 List<ShopBean> list=new ArrayList<ShopBean>();
		for(String str:sb) {
			List<ShopBean> sublist = shopd.findShopTwoType(str);
			list.addAll(sublist);
		}
		System.out.println(list);
		return list;
	}
	//按照类型分页查询
	@Override
	public PageBean<ShopBean> findShopFenYeType(String[] str,int begin,int len) {
     pagebean.setRowsize(len);
     pagebean.setNowpage(begin);
     pagebean.setType(str);
     //按照类型查找该类型的数据个数
     int count = shopd.getCountType(str);
     pagebean.setCount(count);
     System.out.println("hbb:"+count);
     //取出对应类型与页数的数据
     List<ShopBean> list = shopd.findShopFenYeType(str, (begin-1)*len, len);
     pagebean.setData(list);
		return pagebean;
	}
	//根据id获取shop中对应的值
	@Override
	public ShopBean getShopId(int id) {
		//从shop dao中取出对应数据
		ShopBean shop = shopd.getShopId(id);
		return shop;
	}
	/**
	 * 模糊查询
	 */
	@Override
	public List<ShopBean> getShopLike(String name) {
		List<ShopBean> s=shopd.getShopLike("%"+name+"%");
		return s;
	}


}
