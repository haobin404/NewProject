package com.two.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.two.bean.PageBean;
import com.two.bean.ShopVersionBean;
import com.two.dao.inter.ShopVersionDaoInter;
import com.two.service.ShopVersionServiceInter;
@Service
public class ShopVersionServiceImpl implements ShopVersionServiceInter {

	@Autowired
	private ShopVersionDaoInter svd;
//	/根据id获取shop version中对应的值
	@Override
	public List<ShopVersionBean> getShopVersionId(int id) {
		//从shop version 取出对应数据
		List<ShopVersionBean> list = svd.getShopVersionId(id);
		return list;
	}

}
