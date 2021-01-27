package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Sdemo {
	public static void main(String[] args) {
		
		Supplier<Date> s=()->new Date();
		
		System.err.println(s.get());
	}

}
