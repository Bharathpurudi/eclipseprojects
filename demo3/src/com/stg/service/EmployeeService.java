package com.stg.service;

public class EmployeeService {
	public int sumOfArray(int[] myArray){
		int temp=0;
		for (int i : myArray) {
			 temp += i;
		}
		return temp;	
	}
	
	public String[] stringReturning(String[] demoString) {
		int lengthOfArray = demoString.length;
		String[] printString= new String[lengthOfArray];
		for (int i=0; i < lengthOfArray; i++) {
			printString[i]=demoString[i];
		}
		return printString;
	}
	public void printArray(String[] demoString) {
		int lengthOfArray = demoString.length;
		for (int i=0; i < lengthOfArray; i++) {
			System.out.println(demoString[i]);
		}
		
	}
}
