package com.stg.model;

public class StaticDemo {
	public int normalInt;
	public static int staticIntVariable;
	
	public void display() {
		System.out.println("This is a non static method");
	}

	/*
	 * This is a static method. Which does not require any instantiation in the main
	 * method for calling. We can invoke this method using the class name
	 */
	
	public static int print() { 
		return staticIntVariable;
	}
}
