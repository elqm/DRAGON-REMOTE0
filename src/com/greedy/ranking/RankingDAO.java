package com.greedy.ranking;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class RankingDAO {

	public List<RankingDTO> selectFirstRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectFirstRank");
	}

	public List<RankingDTO> selectSecondRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectSecondRank");
	}

	public List<RankingDTO> selectThirdRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectThirdRank");
	}

	public List<RankingDTO> selectFourthRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectFourthRank");
	}

	public List<RankingDTO> selectFifthRank(SqlSession sqlSession) {
		return sqlSession.selectList("RankingMapper.selectFifthRank");
	}

	
	

}
