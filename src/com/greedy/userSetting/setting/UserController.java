package com.greedy.userSetting.setting;

import java.util.List;


public class UserController {
	
	private final UserService userService;
	private final PrintResult printResult;
	
	public UserController() {
		this.userService = new UserService();
		this.printResult = new PrintResult();
	}
	


	public void findAllUser() {
		
		List<UserDTO> userList = userService.findAllUser();
		
		if(userList != null) {
			printResult.printUserList(userList);
		} else {
			printResult.printErrorMessage("findAllUser");
		}
	}

	

}


