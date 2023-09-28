package com.neotech.lesson09;

public class ForLoopExtra {

	public static void main(String[] args) {

		System.out.println("Print numbers from 21 to 30");
		
		
		for (int i = 21; i <= 30; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("Print numbers from 20 to 1");
		
		for(int i = 20; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("Print odd numbers from 1 to 10");
		for(int i = 1; i <= 10; i+=2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		//2nd way
		for (int i = 1; i <= 10; i++)
			if (i % 2 == 1)	{
			System.out.print(i + " ");
			}
		System.out.println();
		
		//3rd way
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		System.out.println("Calculate the sum of the odd numbers form 1 to 10");
		
		int total = 0;
		for (int i = 1; i <= 10; i+=2)
		{
			total += i;
		}
		System.out.println("The total is: " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
