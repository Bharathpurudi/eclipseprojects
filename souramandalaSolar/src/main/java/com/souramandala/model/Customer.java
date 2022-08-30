package com.souramandala.model;


public class Customer {
	private int userId;
	private String userName;
	private String password;
	private String location;
	private String mobileNum;
	private String mailId;
	

	public Customer() {
		super();
	}


	public Customer(int userId, String userName, String password, String location, String mobileNum,
			String mailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.location = location;
		this.mobileNum = mobileNum;
		this.mailId = mailId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getMobileNum() {
		return mobileNum;
	}


	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}


	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	

}
