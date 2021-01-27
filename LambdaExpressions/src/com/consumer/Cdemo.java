package com.consumer;

import java.util.function.Consumer;

public class Cdemo {
	public static void main(String[] args) {
		

	Consumer<String> c=(x)->{System.out.println(x);};
	
	c.accept("Welcome");
	
	}
	

}
