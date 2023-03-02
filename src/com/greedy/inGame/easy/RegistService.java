package com.greedy.inGame.easy;

import static com.greedy.inGame.easy.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class RegistService{
	
	private static RegistDAO registDAO;

	public  RegistService() {
		this.registDAO = new RegistDAO();
	
	}

	public static boolean registNewResult(RegistDTO result) {
		SqlSession sqlSession = getSqlSession();
		
		int newResult = registDAO.insertResult(sqlSession, result);
		 
		if(newResult > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return newResult > 0? true: false;
	}



}
