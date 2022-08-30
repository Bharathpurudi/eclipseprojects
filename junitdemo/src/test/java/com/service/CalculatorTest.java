package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator;
	@Before
	public  void setUp() throws Exception {
		System.out.println("Before class");
		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After class");
	}

	@Test
	public void test() {
		assertEquals(5, calculator.add(2, 3));
	}

}
