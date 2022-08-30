package com.main;

import com.service.MyInterface;

public class InterfaceInstantiated {

	public static void main(String[] args) {
		MyInterface instantiatedInterface = new MyInterface() {
			
			@Override
			public String sayHello(String name) {
				return "WELCOME TO " + name;
			}
		};
		
		System.out.println(instantiatedInterface.sayHello("Bharath"));
		

	}

}
