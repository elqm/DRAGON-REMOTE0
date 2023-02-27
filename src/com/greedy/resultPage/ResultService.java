package com.greedy.resultPage;

import static com.greedy.ranking.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class ResultService{
	
	private final ResultDAO resultDAO;

	public  ResultService() {
		this.resultDAO = new ResultDAO();
	
	}

	public List<ResultDTO> selectFirstRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<ResultDTO> resultList = resultDAO.selectFirstRank(sqlSession);
		
		sqlSession.close();
		
		return resultList;

	}

	public List<ResultDTO> selectSecondRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<ResultDTO> resultList = resultDAO.selectSecondRank(sqlSession);
		
		sqlSession.close();
		
		return resultList;
	}

	public List<ResultDTO> selectThirdRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<ResultDTO> resultList = resultDAO.selectThirdRank(sqlSession);
		
		sqlSession.close();
		
		return resultList;
	}

	public List<ResultDTO> selectFourthRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<ResultDTO> resultList = resultDAO.selectFourthRank(sqlSession);
		
		sqlSession.close();
		
		return resultList;
	}

	public List<ResultDTO> selectFifthRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<ResultDTO> resultList = resultDAO.selectFifthRank(sqlSession);
		
		sqlSession.close();
		
		return resultList;
	}

}
