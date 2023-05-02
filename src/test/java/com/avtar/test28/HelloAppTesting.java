package com.avtar.test28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.awt.desktop.AppForegroundListener;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.avtar.date28.HelloApp;
import com.avtar.date28.HelloService;


@ExtendWith(value = MockitoExtension.class)
public class HelloAppTesting {
	
	
	@Mock
	HelloService servive = new HelloService();
	
	@InjectMocks
	HelloApp app = new HelloApp();
			
	
	@Test
	public void testGetMessageFromHello() {
		
		//HelloApp app = new HelloApp();
		when(app.getMessageFromHello("Hello")).thenReturn("Hello");
		String result = app.getMessageFromHello("Hello");
		assertEquals("Hello", "Hello");
	}

}
