package com.sortcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortMaterialWithPrice {
	public static void main(String[] args) {
		Material m1 = new Material("Tv", "Lg", 45000);
		Material m2 = new Material("mobile", "samsung", 78000);
		Material m3 = new Material("fridge", "Lg", 85000);
		Material m4 = new Material("Table", "onida", 2000);
		Material m5 = new Material("mixer", "lifelong", 1200);
		Material m6 = new Material("trimmer", "syska", 1785);
		Material m7 = new Material("shoes", "adidas", 952);
		Material m8 = new Material("Cooler", "indo", 5000);

		TreeSet<Material> set = new TreeSet<Material>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		set.add(m6);
		set.add(m7);
		set.add(m8);

		ArrayList<Material> al = new ArrayList<Material>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		al.add(m6);
		al.add(m7);
		al.add(m8);

		// Collections.sort(al,new MyComparator());
		System.out.println(al);
		// al.stream().sorted(new MyComparator()).forEach(m->System.out.println(m));
		al.stream().sorted().forEach(m -> System.out.println(m));
		System.out.println(al);

		System.out.println("=================================");
		System.out.println(set);
		System.out.println("=================================");

		TreeSet<Material> setComparator = new TreeSet<Material>(new MyComparator());
		setComparator.add(m1);
		setComparator.add(m2);
		setComparator.add(m3);
		setComparator.add(m4);
		setComparator.add(m5);
		setComparator.add(m6);
		setComparator.add(m7);
		setComparator.add(m8);

		System.out.println(setComparator);

		ArrayList<Material> br = new ArrayList<Material>();
		int count = 0;
		for (Material m : setComparator) {
			if (m.getBrand().contentEquals("Lg")) {
				br.add(m);
				count++;

			}
		}
		System.out.println(br);
		System.out.println(count);

		List<Employee> le = new ArrayList<Employee>();
		le.add(new Employee("sachin", 55000, 4));
		le.add(new Employee("sachin", 35000, 2));
		le.add(new Employee("sachin", 75000, 5));
		le.add(new Employee("sachin", 25000, 1));
		le.add(new Employee("sachin", 10000, 8));
		
		long n=le.stream().count();
		le.stream().filter(e->{
			if (e.salary>2500) {
				return true;
				
			}
			return false;
			
		}).forEach(e->System.err.println(e));
		System.out.println(n);
	


	}

}
