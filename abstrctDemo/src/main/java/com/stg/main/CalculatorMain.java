package com.stg.main;

import com.stg.service.*;

public class CalculatorMain {
	public static void main(String[] args) {
		//interfaceName variableName = new ImplementaionName
		
		Calculator calculator = new CalculatorImpl();
		
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.sub(10, 20));
		System.out.println(calculator.mul(10, 20));
		System.out.println(calculator.div(10.0f, 20.0f));
		
		SciCalImpl sciCal = new SciCalImpl();
		
		System.out.println(sciCal.add(10, 20, 30));
	}
}
