package com.two.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.two.bean.UserBean;
import com.two.dao.inter.UserDaoInter;
import com.two.service.UserServiceInter;
@Service
public class UserServiceImpl implements UserServiceInter {
	@Autowired
	private UserDaoInter ud;
	@Override
	public int login(UserBean userBean) {
		try {
			int id=ud.login(userBean);
			if(id>0)
				return id;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 判断重复注册
	 */
	@Override
	public boolean findUser(UserBean userBean) {
        try {
			int result=ud.findUser(userBean);
			if(result>0)
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean insertUser(UserBean userBean) {
		ud.insertUser(userBean);
		return true;
	}

}
