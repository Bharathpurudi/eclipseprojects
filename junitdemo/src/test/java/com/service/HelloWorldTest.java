package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSayHello() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Welcome Bharath", helloWorld.sayHello("Bharath"));
	}

}
