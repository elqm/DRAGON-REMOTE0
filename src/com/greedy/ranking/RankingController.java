package com.greedy.ranking;

import java.util.List;

public class RankingController {
	
	private final RankingService rankingService;
	private final PrintResult printResult;
	
	public RankingController() {
		this.rankingService = new RankingService();
		this.printResult = new PrintResult();
	}
	


	public List<RankingDTO> selectFirstRank() {
		
		List<RankingDTO> rankingList = rankingService.selectFirstRank();
		
		if(rankingList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return rankingList;
	}



	public List<RankingDTO> selectSecondRank() {
		List<RankingDTO> rankingList = rankingService.selectSecondRank();
		
		if(rankingList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return rankingList;
	}



	public List<RankingDTO> selectThirdRank() {
		List<RankingDTO> rankingList = rankingService.selectThirdRank();
		
		if(rankingList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return rankingList;
	}



	public List<RankingDTO> selectFourthRank() {
		List<RankingDTO> rankingList = rankingService.selectFourthRank();
		
		if(rankingList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return rankingList;
	}



	public List<RankingDTO> selectFifthRank() {
		List<RankingDTO> rankingList = rankingService.selectFifthRank();
		
		if(rankingList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return rankingList;
	}

	

}


