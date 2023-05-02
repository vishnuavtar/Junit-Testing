package com.avtar;

public class Calculator {
	
	private AddService addService;
	
	private Substract subService;
	
	public int Add(int a, int b) {
		return addService.add(a,b);
	}
	
	
	public int substract(int a, int b) {
		return subService.substract(a,b);
	}
}
