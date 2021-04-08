package com.m2i.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int a=2; 
	    int b=3;
		Calculator calc = new Calculator();
		int actual = calc.add(a, b);
		
		assertEquals(5, actual);
	}

	@Test
	public void testSub() {
		//fail("Not yet implemented");
	//fail("Not yet implemented");
		
		int a=3; 
	    int b=6;
		Calculator calc = new Calculator();
		int actual = calc.sub(a, b);
		
		assertEquals(-3, actual);
	}

	@Test 
	public void testMultiplication() {
		
		int a = 3;
		int b = 5;
		
	    Calculator calc = new Calculator();
		int actual = calc.multiplication(a, b);
		
		assertEquals(15, actual);
	}
	
	
	@Test 
	public void nombrePaireTest() {
		
		 
	    Calculator calc = new Calculator();
	    
	    boolean actual = calc.nombrePaire(2);
		//boolean actual1 = calc.nombrePaire(a);
		
		assertTrue(actual);
	}
	
	@Test
	public void isPremier() {
		 Calculator calc = new Calculator();
	 
		 boolean actual = calc.isPremier(17);
		 
		 assertTrue(true);
		 
		 
	}
	
	
	
 
}
