package com.assignments.main;

import com.assignments.model.*;

public class AbstractMain {
	public static void main(String[] args) {
		SubClass class1 = new SubClass();
		
		System.out.println(class1.hasMethod()); 
		System.out.println(class1.nonAbstractMethod());
		
	}
}
