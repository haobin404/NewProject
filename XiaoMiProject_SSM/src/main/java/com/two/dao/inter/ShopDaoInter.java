package com.two.dao.inter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.two.bean.ShopBean;

public interface ShopDaoInter {
//	  me 取对应类型的商品
	  abstract List<ShopBean> findShopTwoType(String name);
	  abstract List<ShopBean> findShopFenYeType(@Param("str")String[] str,@Param("begin")int begin,@Param("len")int len);
	  abstract int getCountType(@Param("str")String[] str);
      //根据id取出对应的商品
      abstract ShopBean getShopId(int id);
	abstract List<ShopBean> getShopLike(String string);
   }
