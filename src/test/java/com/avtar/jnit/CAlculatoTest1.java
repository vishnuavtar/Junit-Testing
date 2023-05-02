package com.avtar.jnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.avtar.junit.CalculatorJunit;

public class CAlculatoTest1 {

	private CalculatorJunit c;

	@BeforeEach
	public void testCre() {

		c = new CalculatorJunit();

	}

	@Test
	public void testAdd() {

		// CalculatorJunit c = new CalculatorJunit();
		int result = c.add(5, 5);
		assertEquals(10, result);
	}

	@Test
	public void testSubstract() {

		// CalculatorJunit c = new CalculatorJunit();
		int result = c.sustract(10, 5);
		assertEquals(5, result);
	}

	@Test
	public void testDivision() {
		// CalculatorJunit c = new CalculatorJunit();
		int result = c.division(10, 10);
		assertEquals(1, result);
	}

}
