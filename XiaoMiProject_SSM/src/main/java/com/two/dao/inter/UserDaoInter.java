package com.two.dao.inter;

import java.util.List;

import com.two.bean.UserBean;

public interface UserDaoInter {
//	登录
	abstract int login(UserBean u)throws Exception;
	/**
	 * 判断重复注册
	 */
	abstract int findUser(UserBean userBean)throws Exception;
	   /**
     * 注册
     * @param userBean
     * @return
     */
	abstract void insertUser(UserBean u);

}
