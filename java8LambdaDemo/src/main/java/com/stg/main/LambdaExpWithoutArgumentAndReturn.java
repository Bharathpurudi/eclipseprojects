package com.stg.main;

import com.stg.functionalinterface.MyInterface;

public class LambdaExpWithoutArgumentAndReturn {
	public static void main(String[] args) {
		MyInterface interface1 = ()-> {
			System.out.println("WELCOME TO LAMBDA EXPRESSION");
			System.out.println("WELCOME TO 2 LAMBDA EXPRESSION");
			
		};
		interface1.function();
	}

}
