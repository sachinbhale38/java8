package com.ingecno.strings;

public class Test {
	
	public static void main(String[] args) {
		
		Palindrom p=new Palindrom();
		Boolean result=p.checkPalindromString("sus");
		if (result) {
			System.out.println("entered string is palindrom...");
		}else {
			System.err.println("entered string is not palindrom...");
		}
		
//		try {
//			throw new Exception();
//			
//		} catch (Myexception e) {
//			System.out.println("in my exception");
//		}catch (Exception e) {
//			System.out.println(" exception");
//		}
		
	}

} 

