package com.stg.main;

public class Exception {
	public static void main(String[] args) {
		try {
			System.out.println(0 / 0);
		} catch (java.lang.ArithmeticException arthexe) {
			System.out.println("Zero divisible is infinite");
			System.out.println(arthexe.getMessage());
		}
	}
}
