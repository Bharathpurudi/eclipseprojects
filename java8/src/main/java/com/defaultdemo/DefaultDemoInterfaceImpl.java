package com.defaultdemo;

public class DefaultDemoInterfaceImpl implements DefaultDemoInterface,DefaultDemoInterface2 {

	@Override
	public void display() {
		System.out.println("Display in Run time polymorphism");

	}

	@Override
	public int add(int a, int b) {
		return DefaultDemoInterface.super.add(a, b);
	}
	
	

}
