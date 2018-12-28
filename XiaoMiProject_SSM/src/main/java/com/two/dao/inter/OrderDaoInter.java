package com.two.dao.inter;

import java.util.List;

import com.two.bean.OrderBean;

public interface OrderDaoInter {
	  abstract int insertOrder(OrderBean o);
	  abstract int deleteOrder(int id);
	  abstract int updateOrder(OrderBean o);
	  abstract List<OrderBean> findOrderAll();
}
