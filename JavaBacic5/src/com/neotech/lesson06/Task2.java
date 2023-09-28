package com.neotech.lesson06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Your first number: ");
		int num1 = scan.nextInt();
		
		
		System.out.println("Your second number: ");
		int num2 = scan.nextInt();
		
		System.out.println("Your numbers are " + num1 + " and " + num2);
		
	if (num1 > num2)
	{
		System.out.println(num1 + " Is bigger then " + num2);
	}
	else if (num1 < num2)
	{
		System.out.println(num2 + " Is bigger then " + num1);
	}
	else
	{
		System.out.println(num1 + " is equal to " + num2);
	}

		
	
	}

}
