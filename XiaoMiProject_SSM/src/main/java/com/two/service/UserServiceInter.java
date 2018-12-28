package com.two.service;

import java.util.List;

import com.two.bean.UserBean;

public interface UserServiceInter {
	/**
	 * 登录
	 * @param userBean
	 * @return
	 */
	int login(UserBean userBean);
/**
 * 验证用户名
 * @param userBean
 * @return
 */
	boolean findUser(UserBean userBean);
     /**
      * 注册
      * @param userBean
      * @return
      */
	boolean insertUser(UserBean userBean);

}
