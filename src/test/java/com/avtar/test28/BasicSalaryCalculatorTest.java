package com.avtar.test28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.avtar.date28.BasicSalaryCalculator;

public class BasicSalaryCalculatorTest {
	
	double s;
	
	BasicSalaryCalculator c;
	
	@BeforeEach
	public void f1() {
		
		c =  new  BasicSalaryCalculator();
	}
	
	
	
	@Test
	public void testSetBasicSalary() {
		
		//BasicSalaryCalculator c = new BasicSalaryCalculator();
		 s = c.setBasicSalary(10);
		assertEquals(10, s);
		
	}
	
	
	@Test
	public void testGetSocialInsurance() {
		
		double d = c.getSocialInsurance();
		assertEquals(c.setBasicSalary(s), d);
	}
	
	
	
	@Test
	public void testGetAdditionalBonus() {
		
		double dd = c.getAdditionalBonus();
		
		assertEquals(c.setBasicSalary(s), dd);
	}
	
	
	
	@Test
	public void testGetGrossSalary() {
		 
		double ddd = c.getGrossSalary();
		assertEquals(null, null);
	}
	


}
