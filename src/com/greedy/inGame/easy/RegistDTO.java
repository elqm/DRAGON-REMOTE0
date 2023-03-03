package com.greedy.inGame.easy;

public class RegistDTO {

	private String resultNum;
	private int score;
	private int memberNum;
	private String openYn;
	private String userName;
	private String difficulty;
	private int playTime;
	private int goldScore;

	public RegistDTO() {}

	public RegistDTO(String resultNum, int score, int memberNum, String openYn, String userName, String difficulty,
			int playTime, int goldScore) {
		super();
		this.resultNum = resultNum;
		this.score = score;
		this.memberNum = memberNum;
		this.openYn = openYn;
		this.userName = userName;
		this.difficulty = difficulty;
		this.playTime = playTime;
		this.goldScore = goldScore;
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

	public String getOpenYn() {
		return openYn;
	}

	public String getUserName() {
		return userName;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public int getPlayTime() {
		return playTime;
	}

	public int getGoldScore() {
		return goldScore;
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

	public void setOpenYn(String openYn) {
		this.openYn = openYn;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public void setGoldScore(int goldScore) {
		this.goldScore = goldScore;
	}

	@Override
	public String toString() {
		return userName + "]" + "              " + "[" + score;
	}
	
}
