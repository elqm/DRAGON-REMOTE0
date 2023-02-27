package com.greedy.inGame.easy;

public class EasyScoreDTO {

	private int mm;
	private int ss;
	private int goldScore;
	private int totalScore;
	
	public EasyScoreDTO() {}

	public EasyScoreDTO(int mm, int ss, int goldScore, int totalScore) {
		super();
		this.mm = mm;
		this.ss = ss;
		this.goldScore = goldScore;
		this.totalScore = totalScore;
	}

	public int getMm() {
		return mm;
	}

	public int getSs() {
		return ss;
	}

	public int getGoldScore() {
		return goldScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public void setSs(int ss) {
		this.ss = ss;
	}

	public void setGoldScore(int goldScore) {
		this.goldScore = goldScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "EasyScoreDTO [mm=" + mm + ", ss=" + ss + ", goldScore=" + goldScore + ", totalScore=" + totalScore
				+ "]";
	}
	
	
	
}
