package com.defaultdemo;

public interface DefaultDemoInterface2 {
	
	public default int add(int a, int b) {
		return a+b;
	}
}
