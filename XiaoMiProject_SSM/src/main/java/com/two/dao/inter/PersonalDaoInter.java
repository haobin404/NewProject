package com.two.dao.inter;

import java.util.List;

import com.two.bean.PersonalBean;

public interface PersonalDaoInter {
	  abstract int insertPersonal(PersonalBean p);
	  abstract int deletePersonal(int id);
	  abstract int updatePersonal(PersonalBean p);
	  abstract List<PersonalBean> findPersonalAll();
}
