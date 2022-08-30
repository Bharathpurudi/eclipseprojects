package com.stg.main;

import com.stg.model.StaticDemo;

public class StaticDemoMain {

	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
		staticDemo.display();
		StaticDemo.staticIntVariable = 10;
		/*
		 * Invoking the static method using the class name. StaticDemo is the class name
		 * where the print() static method is defined.
		 */
		System.out.println(StaticDemo.print());  
	}

}
