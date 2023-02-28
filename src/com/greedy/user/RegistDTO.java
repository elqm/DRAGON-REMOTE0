package com.greedy.user;

public class RegistDTO {

	private int memberNum;
	private String userId;
	private String userPassword;
	private String userName;
	private String userUser;
	private String gradeNum;
	
	
	public RegistDTO() {} 

	public RegistDTO(int memberNum, String userId, String userPassword, String userName, String userUser,
			String gradeNum) {
		super();
		this.memberNum = memberNum;
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userUser = userUser;
		this.gradeNum = gradeNum;
	}

	public int getMemberNum() {
		return memberNum;
	}


	public String getUserId() {
		return userId;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public String getUserName() {
		return userName;
	}


	public String getUserUser() {
		return userUser;
	}


	public String getGradeNum() {
		return gradeNum;
	}


	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public void setUserUser(String userUser) {
		this.userUser = userUser;
	}


	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}


	@Override
	public String toString() {
		return "ResultDTO [memberNum=" + memberNum + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", userUser=" + userUser + ", gradeNum=" + gradeNum + "]";
	}
	
}
