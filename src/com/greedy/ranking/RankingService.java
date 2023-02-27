package com.greedy.ranking;

import static com.greedy.ranking.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class RankingService{
	
	private final RankingDAO rankingDAO;

	public  RankingService() {
		this.rankingDAO = new RankingDAO();
	
	}

	public List<RankingDTO> selectFirstRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<RankingDTO> rankingList = rankingDAO.selectFirstRank(sqlSession);
		
		sqlSession.close();
		
		return rankingList;

	}

	public List<RankingDTO> selectSecondRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<RankingDTO> rankingList = rankingDAO.selectSecondRank(sqlSession);
		
		sqlSession.close();
		
		return rankingList;
	}

	public List<RankingDTO> selectThirdRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<RankingDTO> rankingList = rankingDAO.selectThirdRank(sqlSession);
		
		sqlSession.close();
		
		return rankingList;
	}

	public List<RankingDTO> selectFourthRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<RankingDTO> rankingList = rankingDAO.selectFourthRank(sqlSession);
		
		sqlSession.close();
		
		return rankingList;
	}

	public List<RankingDTO> selectFifthRank() {
		SqlSession sqlSession = getSqlSession();
		System.out.println(sqlSession);
		
	List<RankingDTO> rankingList = rankingDAO.selectFifthRank(sqlSession);
		
		sqlSession.close();
		
		return rankingList;
	}

}
