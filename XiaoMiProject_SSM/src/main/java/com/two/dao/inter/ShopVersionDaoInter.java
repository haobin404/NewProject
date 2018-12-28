package com.two.dao.inter;

import java.util.List;

import com.two.bean.ShopBean;
import com.two.bean.ShopVersionBean;


public interface ShopVersionDaoInter {
//	  abstract int insertShopVersion(ShopVersionBean s);
//	  abstract int deleteShopVersion(int id);
//	  abstract int updateShopVersion(ShopVersionBean s);
//	  abstract List<ShopVersionBean> findShopVersionAll();
	  //根据shopid取出对应的数据
      abstract List<ShopVersionBean> getShopVersionId(int id);
}
