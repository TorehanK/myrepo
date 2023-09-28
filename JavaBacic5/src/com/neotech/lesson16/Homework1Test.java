package com.neotech.lesson16;

import java.util.Scanner;

public class Homework1Test {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String fName = scan.next();
		
		System.out.println("Please enter your last name: ");
		String lName = scan.next();
		
		System.out.println("Please enter the year you were born: ");
		int y = scan.nextInt();
		
		System.out.println("Please enter your email type: ");
		String eType = scan.next();
		
		//create an object of the Homework1 class
		Homework1 hw = new Homework1();
		String fullEmail = hw.createEmail(fName, lName, eType, y);
		System.out.println("The full email is: " + fullEmail);
		
		
		//the method itself, does NOT have anything to do with Scanner
		//I can call the method this way:
		
		hw.createEmail("sabah", "bushaj", "gmail", 1990);
		
		
		
		
	}

}
