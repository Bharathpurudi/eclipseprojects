package com.stg.collectionAssignment2.model;

public class Bank {
	
	private int accountNum;
	private String accountHolderName;
	private int accountBalance;
	public Bank() {
		super();
	}
	public Bank(int accountNum, String accountHolderName, int accountBalance) {
		super();
		this.accountNum = accountNum;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
