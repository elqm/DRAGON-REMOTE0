package com.greedy.user;

import org.apache.ibatis.session.SqlSession;

public class RegistDAO {

	public int insertMember(SqlSession sqlSession, RegistDTO member) {
		return sqlSession.insert("RegistMapper.insertMember", member);
	}



	
	

}
