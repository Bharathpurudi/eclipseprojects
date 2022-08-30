package com.stg.main;

import java.util.Date;

public class DeprecatedDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getDate());
	}

}
