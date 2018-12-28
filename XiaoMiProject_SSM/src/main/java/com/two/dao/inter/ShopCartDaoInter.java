package com.two.dao.inter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.two.bean.ShopCartBean;

public interface ShopCartDaoInter {
	/**
	 * 插入 购物车
	 * @param s
	 * @return
	 */
	  abstract void insertShopCart(ShopCartBean s)throws Exception;
	  /**
	   * 分页 获取个数
	   * @param id
	   * @return
	   */
		abstract int getCount(Integer id)throws Exception;
		abstract List<ShopCartBean> getShop(@Param("uid")Integer uid,@Param("begin")Integer current, @Param("end")int pageSize);
//		删除
	  abstract void deleteShopCart(int id)throws Exception;
//	  --------------------------------------------------
}
