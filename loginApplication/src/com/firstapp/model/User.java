package com.firstapp.model;

public class User {
	private String userName;
	private int userId;
	private String password;
	public User(String userName, int userId, String password) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.password = password;
	}
	public User() {
		super();
	}
	public User(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
