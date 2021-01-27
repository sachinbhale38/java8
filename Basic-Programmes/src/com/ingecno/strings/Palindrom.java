package com.ingecno.strings;

public class Palindrom {

	public boolean checkPalindromString(String s1) {

		StringBuffer sb = new StringBuffer();
		char[] ch = s1.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			sb = sb.append(ch[i]);

		}

		System.out.println(sb);

		if (s1.contentEquals(sb)) {
			return true;

		}
		return false;

	}

}
