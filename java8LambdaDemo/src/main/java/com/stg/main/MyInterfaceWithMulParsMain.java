package com.stg.main;

import java.util.function.BiFunction;

import com.stg.functionalinterface.MyInterfaceWithMulParameters;


public class MyInterfaceWithMulParsMain {

	public static void main(String[] args) {
		//Used the Functional Interface 
		MyInterfaceWithMulParameters interfaceWithMulParameters = (name1 , name2)->{
			return ("Hello "+ name1 +", "+name2  );
		};
		
		System.out.println(interfaceWithMulParameters.conveyMessage("Bharath", "Chinna"));
		
		//Used the Builtin function called BiFunction from java.util.function.package.*;
		BiFunction<String, String, String> biFunction = (name1 , name2)->{
			return ("Hello "+ name1 +", "+name2  );
		};
		
		System.out.println(biFunction.apply("Bharath", "Bittu"));
		
		
	}

}
