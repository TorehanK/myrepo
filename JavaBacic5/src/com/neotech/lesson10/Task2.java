package com.neotech.lesson10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int size = scan.nextInt();
		
		for(int row = 1; row <= size; row++)
		{
			for ( int col = 0; col < row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		for(int row = size-1; row >= 1; row--)
		{
			for ( int col = 0; col < row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	
	}
}
