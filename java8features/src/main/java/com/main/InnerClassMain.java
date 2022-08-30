package com.main;

import com.service.OuterClass;

public class InnerClassMain {
	
	public static void main(String[] args) {
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObj = outerObject.new InnerClass();
		
		innerObj.innerMethod();

	}
}
