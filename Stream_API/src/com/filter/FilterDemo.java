package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,15,13,17,44,69,67,91,78);
		
		//filter even numbers from the list
	List<Integer> evenList=	l.stream().filter(n->(n%2==0)).collect(Collectors.toList());
	System.out.println(evenList);
	
	l.stream().filter(n->(n%2==0)).forEach(value->System.out.println(value));
	}

}
