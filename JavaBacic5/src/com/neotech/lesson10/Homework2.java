package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	/*
	 * 2. Write a program that asks user to enter his/her username and password
	 * until user enters them correctly.
	 */
	
	public static void main(String[] args) {
		
		//how do we decide which loop?
		// for vs while vs do while
		// 	- for is suitable when we are dealing with a countable number of loops
		//	- in this case, we do not know, so we will not use it
		
		// while vs do while
		//	- do while get executed at least once
		//	- in this case, do while is more suitable
		
		
		Scanner scan = new Scanner(System.in);
		
		// our credentials
		String un = "user";
		String pass = "password";
		
		
		//user input
		String user;
		String password;
		
		boolean flag = true;
		
		do 
		{
			System.out.println("Enter the username and password:");
			user = scan.next();
			password = scan.next();
			
			//check if the username and password are correct:
			if (user.equals(un) && password.equals(pass)) //check if the info is correct
			{
				System.out.println("Successfully logged in!");
				
			//	break;//get out of the loop, can be used with while(true);
				
				//another way:
				flag = false;
			}
			
			
			//while(true) --> keep the loop always running
		}while(flag);
		
		
		
		
		
		
		
		
		
	}
	
}
