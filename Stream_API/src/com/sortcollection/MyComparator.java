package com.sortcollection;

import java.util.Comparator;

public class MyComparator implements Comparator<Material>{

	@Override
	public int compare(Material o1, Material o2) {
		String s1=o1.getName();
		String s2=o2.getName();
		return s1.compareTo(s2);
	}

}
