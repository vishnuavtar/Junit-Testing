package com.avtar.test28;

import org.junit.jupiter.api.Test;

import com.avtar.date28.BasicSalaryCalculator;

public class GroceryTesting {
	
	
	
	@Test
	public void testGetGrossSalary() {
		
		BasicSalaryCalculator c = new BasicSalaryCalculator();
	    int result = c.getGrossSalary(10);
	}
}
