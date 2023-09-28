package com.neotech.lesson09;

public class Homework1 {

	public static void main(String[] args) {

		//Write a program using while loop that calculates the sum 
		// of the even numbers between 0 and 10.
		
		
		int i = 0;
		int sum = 0;
		while (i<=10) { 
			
			if(i % 2 == 0) { // if i is an even number
				sum = sum + i;
			}
			i++;
		}
		System.out.println("The sum is: " + sum);
	

	
	
	int m = 0;
	int sum2 = 0;
	while (m<= 10)
	{
		sum2 +=m;
		m +=2;
	}
	System.out.println(sum2);

		
		
		
		
	}
}
