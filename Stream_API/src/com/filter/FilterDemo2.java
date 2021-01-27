package com.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("sachin","dwayne","sachin","john","sachin","pune");
	
	  List<String>	sorted=l.stream().filter(name->(name.length()>=4 && name.length()<7)).collect(Collectors.toList());
	System.err.println(sorted);
	
	//distict
	l.stream().distinct().forEach(val->System.err.println(val));
	
	//sorted
	List<String> ls=l.parallelStream().sorted().collect(Collectors.toList());
	System.err.println(ls);
	
	//distinct+sortted
	List<String> lsd=l.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(lsd);
	
	
	}

}
