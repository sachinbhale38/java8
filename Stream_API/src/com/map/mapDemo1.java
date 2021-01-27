package com.map;

import java.util.Arrays;
import java.util.List;

public class mapDemo1 {
	
	public static void main(String[] args) {
		List<String> l=Arrays.asList("sa chin","dwa yne","jofra","joh   n","ah med  abad","pu  ne");
	
		l.stream().map(name-> name.replaceAll("\\s", "")).forEach(value->System.err.println(value));
	
	}

}
