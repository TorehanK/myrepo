package com.neotech.lesson09;

public class Homework2 {

	public static void main(String[] args) {

		
		//Print numbers from 1 to 100 in 1 line with space
		//Print numbers from 100 to 1
		//print even numbers from 20 to 1 
		//print odd numbers between 20 and 50
		
		
		for(int i = 1; i <= 100; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 100; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 20; i >= 1; i-=2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
		
		
		
		
		for(int i = 21; i <= 50; i+=2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		//2nd way
		for (int i =20; i < 50; i+=2 )
		{
			System.out.print((i+1) + " ");
		}
		
		
		
		
		
		
	}

}
