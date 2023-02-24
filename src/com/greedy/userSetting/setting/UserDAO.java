package com.greedy.userSetting.setting;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class UserDAO {

	public List<UserDTO> selectAllUser(SqlSession sqlSession) {
		return sqlSession.selectList("UserMapper.selectAllUser");
	}

	
	

}
