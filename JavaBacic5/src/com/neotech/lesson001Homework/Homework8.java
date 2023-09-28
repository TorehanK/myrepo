package com.neotech.lesson001Homework;

public class Homework8 {
	
	public static void main(String[] args) {
		
//		1. Write a program using while loop that calculates the sum of the even numbers between 0 and 10.
		
		int x = 0;
		int sum = 0;
		
		while(x<=10) {
			if(x%2 == 0) {
				sum +=x;
			}
			x++;
		}
		System.out.println("The sum is -> " + sum);
		
		
		
		//Print numbers from 1 to 100 in 1 line with space
		//Print numbers from 100 to 1
		//print even numbers from 20 to 1 
		//print odd numbers between 20 and 50
		
		
		for(int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		for(int i = 20; i>=0; i--) {
			if(i%2==0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
		for(int i = 20; i <= 50; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
		
		
	}

}
