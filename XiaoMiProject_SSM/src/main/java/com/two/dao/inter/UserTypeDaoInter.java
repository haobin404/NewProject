package com.two.dao.inter;

import java.util.List;

import com.two.bean.UserTypeBean;

public interface UserTypeDaoInter {
abstract int deleteUserType(int id);
abstract int insertUserType(UserTypeBean ut);
abstract int updateUserType(int id);
abstract List<UserTypeBean> findUserTypeAll();
}
