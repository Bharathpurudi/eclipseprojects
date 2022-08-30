package com.stg.main;

import com.stg.functionalinterface.MyClassFiImpl;
import com.stg.functionalinterface.MyInterface;

public class WithoutFunInterface {

	public static void main(String[] args) {
		
		MyInterface interface1 = new MyClassFiImpl();
		interface1.defFunction();
		interface1.defFunction2();
		MyInterface.statFunction();
		MyInterface.statFunction2();
		MyInterface.statFunction3();

	}

}
