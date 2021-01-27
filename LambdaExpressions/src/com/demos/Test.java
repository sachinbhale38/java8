package com.demos;


@FunctionalInterface
interface Cab{
	public void bookCab();
		
}

public class Test {
	public static void main(String[] args) {
		Cab c=()->System.out.println("Ola Cab is booked");
		c.bookCab();
		
	}

}
