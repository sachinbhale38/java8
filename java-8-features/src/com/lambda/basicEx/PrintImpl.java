package com.lambda.basicEx;

import java.util.Comparator;

public class PrintImpl {

	public static void main(String[] args) {
		// without lambda expression
		Printable p = new Printable() {

			@Override
			public String print() {
				System.out.println("without lambda expression----no argument example....");
				return "Return something ..";
			}
		};
		p.print();

		// with lambda expression
		Printable withLambda = () -> {
			System.out.println("no argument example....");
			return "Return something ..";
		};
		withLambda.print();
		
		
	}

}
