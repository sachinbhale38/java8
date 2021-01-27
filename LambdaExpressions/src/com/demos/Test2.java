package com.demos;

import java.util.function.Function;
import java.util.function.Predicate;

interface Cab1{
public String bookCab(String Source,String Destination)	;
}


public class Test2 {
	public static void main(String[] args) {
		
		Cab1 c1=(s,d)->{
			System.out.println("Ola cab is booked from "+s+" to "+d);
			return ("price 5000rs");
		};
		String p=c1.bookCab("pune", "delhi");
		System.out.println(p);
		
	}

}
