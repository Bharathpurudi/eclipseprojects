package com.stg.main;

import java.util.Scanner;

import day1com.stg.service.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator;
		Scanner input = null;
		try {
			input = new Scanner(System.in);
			System.out.println("Enter the first digit");
			int firstNum = input.nextInt();
			System.out.println("Enter the second digit");
			int secondNum = input.nextInt();
			calculator = new Calculator();
			int result = calculator.add(firstNum, secondNum);
			System.out.println("Addition of " + firstNum + " and " + secondNum + " is " + result);
			int divResult = calculator.div(firstNum, secondNum);
			System.out.println("Division of " + firstNum + " and " + secondNum + " is " + divResult);
		} catch (ArithmeticException AreExe) {
			System.err.println("Number divisible by zero will be infinite");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally { //Weather exception is there or not, finally block will be get executed.
			System.out.println("Final Block Executed");
			calculator = null;
			input.close();
		}

	}

}
