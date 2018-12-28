package com.two.dao.inter;

import java.util.List;

import com.two.bean.ShopTypeBean;
public interface ShopTypeDaoInter {
	  abstract int insertShopType(ShopTypeBean s);
	  abstract int deleteShopType(int id);
	  abstract int updateShopType(ShopTypeBean s);
	  abstract List<ShopTypeBean> findShopTypeAll();
}
