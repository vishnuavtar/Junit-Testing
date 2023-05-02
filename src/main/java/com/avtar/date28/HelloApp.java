package com.avtar.date28;


public class HelloApp {

	private HelloService hello;
	
	public String getMessageFromHello(String msg) {
		return hello.getMessage(msg);
	}
	
}