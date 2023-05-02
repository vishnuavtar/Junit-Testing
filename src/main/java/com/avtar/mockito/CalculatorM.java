package com.avtar.mockito;

public class CalculatorM {
	
	private AddService service;
	
	public int Add(int a, int b) {
		
		return service.add(a,b);
	}

}
