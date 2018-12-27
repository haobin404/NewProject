package com.hbb.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtil {
private static SqlSessionFactory sqlSessionFactory=null;
static {
	String s="mybatis.xml";
	InputStream in;
	try {
		in = Resources.getResourceAsStream(s);
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
		sqlSessionFactory=build;      
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
            
}
public static SqlSession getSession() {
	return sqlSessionFactory.openSession();
}
}
