package com.greedy.resultPage;

import java.util.List;

public class ResultController {
	
	private final ResultService resultService;
	private final PrintResult printResult;
	
	public ResultController() {
		this.resultService = new ResultService();
		this.printResult = new PrintResult();
	}
	


	public List<ResultDTO> selectFirstRank() {
		
		List<ResultDTO> resultList = resultService.selectFirstRank();
		
		if(resultList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return resultList;
	}



	public List<ResultDTO> selectSecondRank() {
		List<ResultDTO> resultList = resultService.selectSecondRank();
		
		if(resultList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return resultList;
	}



	public List<ResultDTO> selectThirdRank() {
		List<ResultDTO> resultList = resultService.selectThirdRank();
		
		if(resultList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return resultList;
	}



	public List<ResultDTO> selectFourthRank() {
		List<ResultDTO> resultList = resultService.selectFourthRank();
		
		if(resultList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return resultList;
	}



	public List<ResultDTO> selectFifthRank() {
		List<ResultDTO> resultList = resultService.selectFifthRank();
		
		if(resultList == null) {
			printResult.printErrorMessage("findAllUser");
		}
		return resultList;
	}

	

}


