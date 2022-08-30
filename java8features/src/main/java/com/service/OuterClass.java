package com.service;

public class OuterClass {
	
	private int outerVar = 10;
	
	public class InnerClass{
		private int innerVar = 20;
		
		public void innerMethod() {
			System.out.println("Inner Variable " + innerVar );
			System.out.println("Outer Variable "+ outerVar);
		}
	}

}
