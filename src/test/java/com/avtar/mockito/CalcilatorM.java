package com.avtar.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(value = MockitoExtension.class)
public class CalcilatorM {
	
	@Mock
	private AddService service;
	
	@InjectMocks
	CalculatorM c = new CalculatorM();
	
	@Test
	public void testAdd() {
		
		when(service.add(5, 5)).thenReturn(10);
		int result = c.Add(5, 5);
		assertEquals(10, result);
		
	}

}
