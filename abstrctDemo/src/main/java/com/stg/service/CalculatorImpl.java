package com.stg.service;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public float div(float num1, float num2) {
		return num1/num2;
	}

}
