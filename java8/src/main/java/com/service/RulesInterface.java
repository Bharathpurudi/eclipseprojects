package com.service;

public interface RulesInterface {
	
	public static final int var=20;
	
	public abstract void display();
	
	public default String sayHello(String str) {
		return str;
	}

}
