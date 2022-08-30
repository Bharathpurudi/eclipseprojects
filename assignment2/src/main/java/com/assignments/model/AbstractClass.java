package com.assignments.model;

public abstract class AbstractClass {
	public AbstractClass() {
		System.out.println("This is a constructor of abstract class");
	}
	
	public abstract String hasMethod( );
	
	public String nonAbstractMethod() {
		return "This is a normal method of abstract class";
	}

}
