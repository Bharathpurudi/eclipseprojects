package com.assignments.assignment3.model;

public class Bank3 extends BankAbstract{
	
	private float bank3Balance;
	
	

	public Bank3(float bank3Balance) {
		super();
		this.bank3Balance = bank3Balance;
	}



	@Override
	public float getBalance() {
		return bank3Balance;
	}

}
