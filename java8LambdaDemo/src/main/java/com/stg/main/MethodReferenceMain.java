package com.stg.main;

import java.util.function.Function;

import com.stg.methodreferance.MyClass;
import com.stg.methodreferance.MyInterface;

public class MethodReferenceMain {
	public static void main(String[] args) {
		MyClass class1 = new MyClass();

		MyInterface interface1 = class1::sayHello; //Method Referance

		String ans = interface1.sayHello("Bharath Jyothirmai");
		System.out.println(ans);

		MyInterface interface2 = (name) -> {  //Lambda expression
			return "WELCOME " + name;
		};

		System.out.println(interface2.sayHello("Bharath Jyothirmai"));

		Function<String, String> function = (name) -> {  //pre defined function
			return "Welcome " + name;
		};

		String preDefinedAns = function.apply("Jyothirmai");
		System.out.println(preDefinedAns);
	}

}
