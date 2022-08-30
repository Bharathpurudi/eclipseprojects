package com.main;

import com.model.*;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		CalculatorImpl calculator = new CalculatorImpl();
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.sub(10, 20));
		System.out.println(calculator.mul(10, 20));
		System.out.println(calculator.add(10, 20, 30, 40, 50));
		
		Parent child1 = new Parent(20);
		child1.sayHello();
		Child child  = new Child(25);
		child.sayHello();
		
		
	}

}
