package com.greedy.inGame.easy;

import org.apache.ibatis.session.SqlSession;

public class RegistDAO {

	public int insertResult(SqlSession sqlSession, RegistDTO result) {
		return sqlSession.insert("RegistMapper.inserResult", result);
	}
 


	
	

}
