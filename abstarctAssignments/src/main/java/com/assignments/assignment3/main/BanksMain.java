package com.assignments.assignment3.main;

import com.assignments.assignment3.model.Bank1;
import com.assignments.assignment3.model.Bank2;
import com.assignments.assignment3.model.Bank3;

public class BanksMain {

	public static void main(String[] args) {
		Bank1 bank1 = new Bank1(150f);
		Bank2 bank2 = new Bank2(200f);
		Bank3 bank3 = new Bank3(250f);
		
		System.out.println("Bank1 balance is "+ bank1.getBalance());
		System.out.println("Bank2 balance is "+ bank2.getBalance());
		System.out.println("Bank3 balance is "+ bank3.getBalance());
	}

}
