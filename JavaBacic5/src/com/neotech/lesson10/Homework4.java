package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		String input;
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("Do you want to apply for a credit card?");
			input = scan.next();
			
			if(input.equalsIgnoreCase("Yes"))
			{
				System.out.println("Great, lets continue the application process!");
				break;
			}
			
		}
		
		
	}

}
