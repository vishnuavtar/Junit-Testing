package com.avtar.test28;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.avtar.date28.MyTestClass;

public class MyTest {
	
	
	@Test
	public void testDoSomething() {
		
		MyTestClass c = new MyTestClass();
		
		int result = c.doSomething("20", 1);
		assertEquals(1, result);
		
	}

}
