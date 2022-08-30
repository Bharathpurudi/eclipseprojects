package com.stg.main;

import java.util.ArrayList;
import java.util.List;

public class SupressWarningDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add("Hello");
	}
	

}
