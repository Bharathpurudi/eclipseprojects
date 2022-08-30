package com.stg.model;

public abstract class Parent {
	
	private int parentAge;

	public Parent(int parentAge) {
		this.parentAge = parentAge;
		System.out.println("Parent age is " + parentAge);
	}
	
	public int parentMethod(int parentAge) {
		return parentAge;
	}
	

	/*
	 * public Parent() { System.out.println("Parent Constructor"); }
	 */
	

}
