package com.greedy.resultPage;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class ResultDAO {

	public List<ResultDTO> selectFirstRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectFirstRank");
	}

	public List<ResultDTO> selectSecondRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectSecondRank");
	}

	public List<ResultDTO> selectThirdRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectThirdRank");
	}

	public List<ResultDTO> selectFourthRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectFourthRank");
	}

	public List<ResultDTO> selectFifthRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectFifthRank");
	}

	
	

}
