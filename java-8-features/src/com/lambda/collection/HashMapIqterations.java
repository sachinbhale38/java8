package com.lambda.collection;

import java.util.Collection;
import java.util.HashMap;


public class HashMapIqterations {
	public static void main(String[] args) {
		HashMap<String, String> c = new HashMap<String, String>();
		c.put("India", "Delhi");
		c.put("Japan", "Tokyo");
		c.put("USA", "New York");
		c.put("UK", "London");
		c.put("Russia", "Tokyo");
		c.put("France", "Tokyo");
		
	
		
		System.out.println("applying stream to hashmap values");
		Collection<String> l=c.values();
		l.stream().distinct().forEach(value->System.out.println(value));
		
		System.out.println(l.stream().count()); 
		
		// normal way
		

	
		for (String ckey : c.keySet()) {

			System.out.println("Country : " + ckey + "  , " + "Capital : " + c.get(ckey));
		}
		System.out.println("----------Using Java 8 for each--------------");

		c.forEach((k, v) -> System.out.println("Country : " + k + "   Capital :" + v));

		System.out.println("----------Using Java 8 for each--------------");
		
		
	}

}
