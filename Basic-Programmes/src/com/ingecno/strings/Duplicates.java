package com.ingecno.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {

		String str = "programming";
		char[] ch = str.toCharArray();
		
//		str.chars().distinct();
		StringBuffer sb = new StringBuffer();
		int length = ch.length;
		
		//aproach-1
		Set<Character> st=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			st.add(str.charAt(i));
			
		}
		st.forEach(c->sb.append(c));
		System.out.println(sb);
		
		
		//aproach-2
		for (int i = 0; i < ch.length; i++) {
			boolean f = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					f = true;
					break;
				}
			}
				if (!f) {
					sb.append(ch[i]);
				}

			}
			//System.out.println(sb);

		}
	}

