package com.ingecno.strings;

public class Reverse {
	public static void main(String[] args) {

		String str = "programming";
		char[] ch = str.toCharArray();
		StringBuffer sb=new StringBuffer();
		int length = ch.length;
		for (int i = length -1; i >=0; i--) {
			sb=sb.append(ch[i]);
		
		}
		System.out.println(sb);
	}

}
