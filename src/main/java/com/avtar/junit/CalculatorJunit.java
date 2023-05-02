package com.avtar.junit;

public class CalculatorJunit {
	
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sustract(int a, int b) {
		return a-b;
	}
	
	
	public int division(int a , int b) {
		
		int c = 0;
		try {
		c = a/b;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return c;
		
	}

}
