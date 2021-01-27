package com.ingecno.numbers;

public class Palindrom {
	public static void main(String[] args) {
		
		int n=212;
		int r,sum=0;
		int temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (sum==temp) {
			System.out.println("number is palindrom...");
		}
else {
	System.out.println("number is not a palindrom...");
}
		

	}
}
