package com.assignments.assignment3.model;

public class Bank1 extends BankAbstract {

	private float bank1Balance;

	
	public Bank1(float bank1Balance) {
		super();
		this.bank1Balance = bank1Balance;
	}


	@Override
	public float getBalance() {
		return bank1Balance;
	}

}
