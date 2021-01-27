package com.ingecno.numbers;

public class Armstrong {
	
	
public void checkArmstrong(int n) {
		
		
		int sum = 0,r=0;
		int temp=n;
		
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("not");
		}
		
	}

}
