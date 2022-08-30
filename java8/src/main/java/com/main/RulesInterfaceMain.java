package com.main;

import com.service.RulesInterface;
import com.service.RulesInterfaceImpl;

public class RulesInterfaceMain {

	public static void main(String[] args) {
		RulesInterface interface1 = new RulesInterfaceImpl();

		interface1.display();

		RulesInterface interface2 = new SecondRulesInterface();

		interface2.display();
		System.out.println(interface1.sayHello("Welcome to default"));
	}

}
