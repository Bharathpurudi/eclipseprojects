package com.stg.functionalinterface;

@FunctionalInterface
public interface MyInterface {
	
	public abstract void function();
	
	public default void defFunction() {
		System.out.println("Functional Interface Default method 1");
	}
	
	public default void defFunction2() {
		System.out.println("Functional Interface Default method 2");
	}
	
	public static void statFunction() {
		System.out.println("Functional Interface Static method 1 ");
	}
	
	public static void statFunction2() {
		System.out.println("Functional Interface Static method 2 ");
	}
	public static void statFunction3() {
		System.out.println("Functional Interface Static method 3");
	}
	

}
