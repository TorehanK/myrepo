package com.neotech.lesson11;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			for(int j= 1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<= 2*(num-i)+1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
