package com.service;

import org.junit.After;
import org.junit.Before;

public class JunitLifeCycle {
	@Before
	public static void init() {
		System.out.println("Init Method -- setup");
	}
	
	@After
	public static void after() {
		System.out.println("After Method -- After setup");
	}
	

}
