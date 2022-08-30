package com.stg.main;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Bharath"; // Created in String literal
		String str2= new String("Bharath"); // Created in the heap
		String str3 = "Bharath"; //Created in string literal
		String str4 = new String("bharath"); // Created in the heap
		
		
		if (str1.equalsIgnoreCase(str4)) {
			System.out.println("Strings are same");
			  
		} else {
			System.out.println("Not equal");
		}
	}

}
