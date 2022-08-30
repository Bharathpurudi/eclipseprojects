package com.stg.collectionAssignments.assignment4.model;

public class Cricketer {
	private String playerName;
	private int playerAge;
	private int noOfMatchesPlayed;
	private float avarageRunsScored;
	public Cricketer() {
		super();
	}
	public Cricketer(String playerName, int playerAge, int noOfMatchesPlayed, float avarageRunsScored) {
		super();
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.noOfMatchesPlayed = noOfMatchesPlayed;
		this.avarageRunsScored = avarageRunsScored;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public int getNoOfMatchesPlayed() {
		return noOfMatchesPlayed;
	}
	public void setNoOfMatchesPlayed(int noOfMatchesPlayed) {
		this.noOfMatchesPlayed = noOfMatchesPlayed;
	}
	public float getAvarageRunsScored() {
		return avarageRunsScored;
	}
	public void setAvarageRunsScored(int avarageRunsScored) {
		this.avarageRunsScored = avarageRunsScored;
	}
	
	

}
