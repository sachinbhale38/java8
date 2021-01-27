package com.ingecno.arrays;

public class Largest {
	public static void main(String[] args) {

		int[] x = { 5, 48, 34, 82, 9, 53 };
		int temp = 0;
		int length = x.length;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}

			}

		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");

		}

		System.err.println("largest number : " + x[0]);
		System.err.println("second largest number : " + x[1]);
		System.out.println("smallest number : " + x[length - 1]);

	}

}
