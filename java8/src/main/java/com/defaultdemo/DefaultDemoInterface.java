package com.defaultdemo;

@FunctionalInterface
public interface DefaultDemoInterface {

	public static final int VAR = 20;

	public abstract void display();

	public default int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

}
