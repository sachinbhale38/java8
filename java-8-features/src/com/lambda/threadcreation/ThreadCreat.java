package com.lambda.threadcreation;

public class ThreadCreat {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("in main thread >>  " + i);
		}

		// Thread Example with lambda
		Runnable r2 = () -> {
			for (int i = 30; i < 40; i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(i);

			}
		};
		Thread t = new Thread(r2);
		

		
		t.start();
		t.join();
		
		
	
	
		
	
		for(int i=20;i<30;i++)
		{
			System.out.println("in main  thread >>>  "+i);
		}
	}
	

}
