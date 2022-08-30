package com.stg.main;

import com.stg.functionalinterface.MyInterfaceWithParameter;

public class FunctionalInterfaceMain {
	
	public static void main(String[] args) {
		MyInterfaceWithParameter interfaceWithParameter = (name) -> {
			System.out.println("Welcome "+ name);
			System.out.println("Hai "+ name + "How are you");
		};
		
		interfaceWithParameter.display("Bharath");
	}

}
