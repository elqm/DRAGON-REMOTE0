package com.greedy.user;

import java.util.Map;

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
	




	

}


