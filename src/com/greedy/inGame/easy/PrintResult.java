package com.greedy.inGame.easy;

public class PrintResult {

//	public void printUserList(List<UserDTO> userList) {
//		for(UserDTO user : userList) {
//			System.out.println(user);
//		}
//	
//	}
	public void printErrorMessage(String errorCode) {
		
		String errorMessage = "";
		switch(errorCode) {
		case "findAllUser" : errorMessage = "랭킹 정보 조회 실패."; break;
		default : errorMessage = "알 수 없는 에러 발생!"; break;
	}
	System.out.println(errorMessage);
}
	public void printMenu(RegistDTO user) {
		System.out.println(user);
	}
	public void printSuccessMessage(String successCode) {
		String successMessage = "";
		switch(successCode) {
		case "registNewMenu" : successMessage = "랭킹 조회 성공,"; break;
		default : successMessage = "DML 구문은 성공적으로 수행했으나 잘못된 코드값이 전달되었습니다."; break;
		}
		System.out.println(successMessage);
	}
}