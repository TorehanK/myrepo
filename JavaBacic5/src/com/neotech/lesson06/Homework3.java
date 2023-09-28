package com.neotech.lesson06;

public class Homework3 {

	public static void main(String[] args) {
		//Write a java code program to check whether number is even or odd
		
		int number = 34532;
		int remainder = number % 2;
		
		//1st way
		if (remainder == 0)
		{
			System.out.println("The number is even!");
		}
		else
		{
			System.out.println("The number is odd!");
		}
		
		//2nd way
		
		if(remainder == 1)
		{
			System.out.println("The number is odd!");
		}
		else
		{
			System.out.println("The number is even!");
		}
		
		//3rd way
		
		if (number %2 == 1)
		{
			System.out.println("The number is odd!");
		}
		else
		{
			System.out.println("The number is even!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
