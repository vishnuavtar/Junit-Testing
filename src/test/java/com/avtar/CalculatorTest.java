package com.avtar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

	@Mock
	private AddService  addService;
	
	
	@Mock
	private Substract subService;
	
	
	@InjectMocks
	Calculator c = new Calculator();
	
	
	
	
	@Test
	public void testAdd() {
		
		when(addService.add(2, 3)).thenReturn(5);
		int result = c.Add(2, 3);
		assertEquals(5, result);
	}
	
	
	@Test
	public void testSubstract() {
		
		when(subService.substract(5, 3)).thenReturn(2);
		int result = c.substract(5, 3);
		assertEquals(2, result);
	}
	
}
