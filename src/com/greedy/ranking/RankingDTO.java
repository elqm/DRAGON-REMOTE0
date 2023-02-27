package com.greedy.ranking;

public class RankingDTO {

	private String resultNum;
	private int score;
	private int memberNum;
	private boolean open;
	private String userName;
	private String gradeKind;
	
	public RankingDTO() {}

	public RankingDTO(String resultNum, int score, int memberNum, boolean open, String userName, String gradeKind) {
		super();
		this.resultNum = resultNum;
		this.score = score;
		this.memberNum = memberNum;
		this.open = open;
		this.userName = userName;
		this.gradeKind = gradeKind;
	}

	public String getResultNum() {
		return resultNum;
	}

	public int getScore() {
		return score;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public boolean isOpen() {
		return open;
	}

	public String getUserName() {
		return userName;
	}

	public String getGradeKind() {
		return gradeKind;
	}

	public void setResultNum(String resultNum) {
		this.resultNum = resultNum;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setGradeKind(String gradeKind) {
		this.gradeKind = gradeKind;
	}

	@Override
	public String toString() {
		return userName + "]" + "              " + "[" + score;
	}
	
}
