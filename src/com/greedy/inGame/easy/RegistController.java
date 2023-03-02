package com.greedy.inGame.easy;

import java.util.Map;

public class RegistController {
	
	private final RegistService registService;
	private final PrintResult printResult;
	
	public RegistController() {
		this.registService = new RegistService();
		this.printResult = new PrintResult();
	}

	public void regitsResult(Map<String, String> parameter) {
		
		String name = parameter.get("name");
		String difficulty = parameter.get("difficulty");
		int playTime = Integer.parseInt(parameter.get("playTime"));
		int goldScore = Integer.parseInt(parameter.get("goldScore"));
		int totalScore = Integer.parseInt(parameter.get("totalScore"));
		
		RegistDTO result = new RegistDTO();
		result.setUserName(name);
		result.setDifficulty(difficulty);
		result.setPlayTime(playTime);
		result.setGoldScore(goldScore);
		result.setScore(totalScore);
		
		if(RegistService.registNewResult(result)) {
			printResult.printSuccessMessage("registNewMenu");
		} else {
			printResult.printErrorMessage("registNewMenu");
		}
		
		
	}
}


