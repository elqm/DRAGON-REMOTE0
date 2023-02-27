package com.greedy.user.memberSetting;

public class MemberDTO {

	private String userId;
	private String password;
	private String name;
	private String user;
	private int memberNum;
	private int gradeNum;
	
	public MemberDTO() {}

	public MemberDTO(String userId, String password, String name, String user, int memberNum, int gradeNum) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.user = user;
		this.memberNum = memberNum;
		this.gradeNum = gradeNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public int getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}

	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", password=" + password + ", name=" + name + ", user=" + user
				+ ", memberNum=" + memberNum + ", gradeNum=" + gradeNum + "]";
	}
	
	
}
