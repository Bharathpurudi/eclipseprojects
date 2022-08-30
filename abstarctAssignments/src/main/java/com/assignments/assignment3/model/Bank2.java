package com.assignments.assignment3.model;

public class Bank2 extends BankAbstract {
	
	private float bank2Balance;
	
	

	public Bank2(float bank2Balance) {
		super();
		this.bank2Balance = bank2Balance;
	}



	@Override
	public float getBalance() {
		return bank2Balance;
	}

}
