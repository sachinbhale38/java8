package com.lambda.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListIterations {

	public static void main(String... args) {

		List<String> courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

		for (String c : courses) {
			System.out.println(c);
		}
		System.out.println("---------------------------");

		courses.forEach(c -> System.out.println(c));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		List l = new ArrayList();
		l.add(null);
		l.add(12);
		l.add(85);
		l.add(null);
		l.add(6);
		System.out.println("ArrayList " + l);
		
		List l1 = new Vector();
		l1.add(null);
		l1.add(12);
		l1.add(85);
		l1.add(null);
		l1.add(6);
		System.out.println("Vector " + l1);
		
		List l11 = new LinkedList();
		l11.add(null);
		l11.add(12);
		l11.add(85);
		l11.add(null);
		l11.add(6);
		
		System.out.println("LinkedList " + l11);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

		Set<Integer> st = new HashSet<Integer>();
		st.add(null);
		st.add(12);
		st.add(85);
		st.add(null);
		st.add(6);
		System.out.println("Hashset " + st);

		Set<Integer> st1 = new TreeSet<Integer>();

		st1.add(12);
		st1.add(85);
		st1.add(81);
		st1.add(6);
		System.out.println("treeset " + st1);

		Set<Integer> st11 = new LinkedHashSet<Integer>();
		st11.add(null);
		st11.add(12);
		st11.add(85);
		st11.add(null);
		st11.add(6);
		System.out.println("LinkedHashset" + st11);

	}

}
