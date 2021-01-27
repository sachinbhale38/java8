package com.lambda.threadcreation;

public class JobTrigger {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("in main >>  " + i);
		}
		Job jb=new Job();
		jb.start();
		String s=Thread.currentThread().getName();
		System.out.println(s);
		for(int i=20;i<30;i++)
		{
			System.out.println("in main  >>>  "+i);
		}
	}

}
