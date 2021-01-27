package com.functions;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f=(n)-> n*n;
		
		int square=f.apply(5);
		System.out.println("square:"+square);
		
		//string length
		Function<String, Integer> f1=(sf)->sf.length();
		
		System.out.println(f1.apply("sachinbhale"));
	}

}
