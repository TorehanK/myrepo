package com.neotech.interview01;

public class IQ3 {
	public static void main(String[] args) {

		// Write a Java Program to print first 10 numbers of Fibonacci series.
		// 1,1,2,3,5,8,13,21,34,55

		int a = 1;
		int b = 1;

		int ret = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			ret = a + b;
			a = b;
			b = ret;
		}

	}
}
