package com.greedy.userSetting.setting;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import static com.greedy.userSetting.setting.Template.getSqlSession;

public class UserService{
	
	private final UserDAO userDAO;

	public  UserService() {
		this.userDAO = new UserDAO();
	
	}

	public List<UserDTO> findAllUser() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<UserDTO> userList = userDAO.selectAllUser(sqlSession);
		
		sqlSession.close();
		
		return userList;

	}

}
