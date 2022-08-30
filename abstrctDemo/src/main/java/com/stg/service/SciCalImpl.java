package com.stg.service;

public class SciCalImpl implements Calculator1,Calculator {

	@Override
	public float mod(int num1, int num2) {
		return num1%num2;
	}

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

	@Override
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}

}
