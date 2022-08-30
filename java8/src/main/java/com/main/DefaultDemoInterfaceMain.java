package com.main;

import com.defaultdemo.DefaultDemoInterface;
import com.defaultdemo.DefaultDemoInterfaceImpl;

public class DefaultDemoInterfaceMain {
	
	public static void main(String[] args) {
		DefaultDemoInterface defaultDemoInterface = new DefaultDemoInterfaceImpl();
		
		defaultDemoInterface.display();
		System.out.println("The sum of two numbers: "+ defaultDemoInterface.add(5, 10));
		System.out.println("The static variable is: "+ DefaultDemoInterface.VAR);
		
		System.out.println("The value of sub: "+DefaultDemoInterface.sub(10, 5));
	}

}
