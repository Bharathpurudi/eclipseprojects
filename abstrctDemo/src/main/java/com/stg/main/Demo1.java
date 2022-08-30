package com.stg.main;

import com.stg.model.Child;
import com.stg.model.Parent;

public class Demo1 {
	
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.parentMethod(25));
	}

}
