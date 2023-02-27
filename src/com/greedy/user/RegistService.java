package com.greedy.user;

import static com.greedy.user.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class RegistService{
	
	private static RegistDAO registDAO;

	public  RegistService() {
		this.registDAO = new RegistDAO();
	
	}

	public static boolean registNewMember(RegistDTO member) {

		SqlSession sqlSession = getSqlSession();
		
		int result = registDAO.insertMember(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}



}
