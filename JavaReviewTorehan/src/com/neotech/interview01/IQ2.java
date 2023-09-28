package com.neotech.interview01;

public class IQ2 {
	public static void main(String[] args) {
		
//		Write a java program to check whether a given number is prime or not?

		int num = 7;
		boolean prime = true;
		
		if(num ==1) {
			prime = false;
		}else {
			for(int i = 2; i < num; i++) {
				if(num%i==0) {
					System.out.println(num + " is divisible by " + i);
					prime = false;
					break;
				}else {
					System.out.println(num + " is not divisible by " + i);
				}
			}
		}
		System.out.println("------------");
		System.out.println(num + " is prime? " + prime);
		
		
		
		
		
	}
}