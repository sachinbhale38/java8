package com.ingecno.arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SortArray {
	
	public static void main(String[] args) {
		
		int []x= {5,48,34,82,9,53,58,34,48,5,82};
		int temp=0;
		Set<Integer> hset=new HashSet<Integer>();
		List<Integer> ll=new LinkedList<Integer>();
		
		
		for (int i = 0; i < x.length; i++) {
			if (!hset.add(x[i])) {
				ll.add(x[i]);
		
			}
		
		}
		System.out.println(ll);
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
				
			}
		
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
			
		}
	}

}
