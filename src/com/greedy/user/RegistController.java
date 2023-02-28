package com.greedy.user;

import java.util.List;
import java.util.Map;

import com.greedy.character.choiceCharacter;
import com.greedy.ranking.RankingDTO;

public class RegistController {
	
	private final RegistService registService;
	private final PrintResult printResult;
	
	public RegistController() {
		this.registService = new RegistService();
		this.printResult = new PrintResult();
	}

	public void registNewMember(Map<String, String> parameter) {

		String id = parameter.get("id");
		String pwd = parameter.get("pwd");
		String name = parameter.get("name");
		
		RegistDTO member = new RegistDTO();
		member.setUserId(id);
		member.setUserPassword(pwd);
		member.setUserName(name);
		
		if(RegistService.registNewMember(member)) {
			printResult.printSuccessMessage("registNewMenu");
		} else {
			printResult.printErrorMessage("registNewMenu");
		}
		
	}
 
	public void loginMember(Map<String, String> parameter) {

		String id = parameter.get("id");
		String pwd = parameter.get("pwd");
		
		RegistDTO member = new RegistDTO();
		member.setUserId(id);
		member.setUserPassword(pwd);
		
		if(RegistService.loginMember(member) != null) {
			choiceCharacter cc = new choiceCharacter();
			cc.display();

		} else {
			printResult.printErrorMessage("registNewMenu");

			
	}
	

}
}


