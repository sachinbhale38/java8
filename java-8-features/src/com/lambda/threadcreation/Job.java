package com.lambda.threadcreation;

public class Job extends Thread {
	public void run() {
		for(int i=10;i<20;i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("in job1  >>  " +i);
			System.out.println();
		}

	}

}
