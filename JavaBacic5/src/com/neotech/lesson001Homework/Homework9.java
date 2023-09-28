package com.neotech.lesson001Homework;

import java.util.Scanner;

public class Homework9 {
	public static void main(String[] args) {
		
//			1. Print 5 times this statement: "I love Neotech"

			for(int i = 0; i < 5; i++) {
				System.out.println("I love Neotech!");
			}
		
		
//			2. Write a program that asks user to enter his/her username and password until user enters them correctly.
//			Scanner scan = new Scanner(System.in);
//			
//			// our credentials
//			String un = "torehan";
//			String pass = "kahya";
//			
//			
//			//user input
//			String user;
//			String password;
//			
//			boolean flag = true;
//			
//			do 
//			{
//				System.out.println("Enter the username and password:");
//				user = scan.next();
//				password = scan.next();
//				
//				//check if the username and password are correct:
//				if (user.equals(un) && password.equals(pass)) //check if the info is correct
//				{
//					System.out.println("Successfully logged in!");
//					
//				//	break;//get out of the loop, can be used with while(true);
//					
//					//another way:
//					flag = false;
//				}
				
//				
//				//while(true) --> keep the loop always running
//			}while(flag);
	
		
		
		
//			3. Print numbers from 1 to 50 except those that are divisible by 3.
			for(int i = 0; i <=50; i++) {
				if(i%3==0) {
				}else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		
		
//			4. Create a program that will be asking user to apply for a credit card 10 times.
//			As soon you get an "yes" from a user program should stop asking.
			Scanner scan = new Scanner(System.in);
			
			String input;
			
			for(int i = 0; i<=10; i++) {
				System.out.println("Would you like a credit card?");
				input = scan.next();
				
			if(input.equalsIgnoreCase("Yes")) {
				System.out.println("Great, lets continue the application process!");
				break;
			}
		}
			
			
			
			
	}

}
