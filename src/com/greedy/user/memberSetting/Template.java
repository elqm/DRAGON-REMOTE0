package com.greedy.user.memberSetting;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {

	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getsqlSession() {
		
		if(sqlSessionFactory == null) {
			String resource =  "com/greedy/user/memberSetting/mybatis-config.xml";
			
			InputStream inputStream;
			
			try {
				inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		return sqlSessionFactory.openSession(false);
		
	}
	
}
