package com.concurr;

import java.util.ArrayList;
import java.util.List;

public class Mythread extends Thread {
	
	
	
	@Override
	public void run() {
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
//		l.add("e");
	}

	static List<String> l=new ArrayList<String>();
	
	public static void main(String[] args) throws InterruptedException {
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");

		
		Mythread T=new Mythread();
		Mythread T2=new Mythread();
		T.start();
	
		
		for(String s:l) {
			System.out.println(s);
			Thread.sleep(3000);
		}
		
//		
//		l.forEach(value->System.out.println(value));
		
		
	}

}
