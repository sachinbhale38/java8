package com.ingecno.numbers;

public class Largest {
	
	public static void main(String[] args) {
		
		int a=21;
		int b=15;
		int c=47;
		
		if (a>b && a>c) {
			System.out.println("a="+a+" is largest");
		}else if (b>c && b>a) {
			System.out.println("b="+b+" is largest");
			
		}else if (c>a && c>b) {
			System.out.println("c="+c+" is largest");
			
		}
	}

}
