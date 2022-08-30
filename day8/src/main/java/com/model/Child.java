package com.model;

public class Child extends Parent {
	
	

	public Child(int a) {
		super(a);
	}

	@Override
	public void sayHello() {
		super.sayHello();
		System.out.println("Child sayHello()");
	}
	

}
