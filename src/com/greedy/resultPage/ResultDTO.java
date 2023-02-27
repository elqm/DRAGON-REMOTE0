package com.greedy.resultPage;

public class ResultDTO {

	private String resultNum;
	private int score;
	private int memberNum;
	private boolean open;
	private String userName;
	
	public ResultDTO() {}

	public ResultDTO(String resultNum, int score, int mamberNum, boolean open, String userName) {
		super();
		this.resultNum = resultNum;
		this.score = score;
		this.memberNum = mamberNum;
		this.open = open;
		this.userName = userName;
	}

	public String getResultNum() {
		return resultNum;
	}

	public int getScore() {
		return score;
	}

	public int getMamberNum() {
		return memberNum;
	}

	public boolean isOpen() {
		return open;
	}

	public String getUserName() {
		return userName;
	}

	public void setResultNum(String resultNum) {
		this.resultNum = resultNum;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setMamberNum(int mamberNum) {
		this.memberNum = mamberNum;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return userName + "]" + "              " + "[" + score;
	}
	
}
