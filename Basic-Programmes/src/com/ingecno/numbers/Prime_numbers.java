package com.ingecno.numbers;

public class Prime_numbers {
	
	public String isPrime(int n) {
	
		boolean isprime=true;
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0) {
				isprime=false;
				break;	
			}
			
		}
		if(isprime) {
			
			return "prime";
		}
		else {
			return "not prime";
		}
		
		
	}

}
