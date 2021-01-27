package com.predicates;

import java.util.function.Predicate;

public class Demo1 {
	public static void main(String[] args) {
		
		//if we have conditional checks in programme go for predicate
		//ex1
		Predicate<Integer> p=(i)->(i>10);
	
		System.out.println(p.test(220));
		System.out.println(p.test(5));
		
		//ex2-check the length of string greter than 4
		

		Predicate<String> pr= (s)->(s.length()>4);
		System.out.println(pr.test("sachin"));
		
		//ex3:print array elements whose length greater than 4
		String [] names= {"david","scott","smith","john","mary"};
		for(int i=0;i<(names.length);i++) {
			if(names[i].length()>4) {
				System.out.println(names[i]);	
			}
		}
		System.out.println("----------------------------");
		for(String n:names) {
			if(pr.test(n)) {
				System.out.println(n);
			}
			
		}
		
		

	}
}
