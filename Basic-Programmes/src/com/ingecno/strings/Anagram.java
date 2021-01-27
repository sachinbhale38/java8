package com.ingecno.strings;

import java.util.Arrays;
import java.util.Comparator;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "adsa";
		String s2 = "asad";

		if (s1.length() != s2.length()) {
			System.out.println("not anagram");

		}

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

	}
}
