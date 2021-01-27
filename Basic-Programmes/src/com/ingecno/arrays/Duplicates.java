package com.ingecno.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicates {
	public static void main(String[] args) {
		int[] x = { 5, 48, 34, 82, 9, 53, 34, 98, 63, 82, 25 };
		int temp = 0;
		List<Integer> l = new ArrayList<Integer>();

		for (int xx : x) {
			l.add(xx);

		}
		System.out.println(l);
		

		int length = x.length;
		Map<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		Set<Integer> s = new LinkedHashSet<Integer>();
		for (int i = 0; i < x.length; i++) {
			hm.put(x[i], i);
			s.add(x[i]);
		}
		System.out.println("Hashmap " + hm);
		System.out.println("Linked HASHSET :" + s);
		l.remove(2);
		l.remove(3);
		System.out.println("--------------------");
		System.err.println(l);
		l.stream().distinct().forEach(n->System.out.println(n));
		hm.forEach((k,v)->System.out.println("key:"+k+" value "+v));
	}

}
