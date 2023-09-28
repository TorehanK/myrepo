package com.neotech.lesson16;

import java.util.Scanner;

public class Homework1 {

	
	/*
	 * Create a method createEmail(). Based on provided users firstName, 
	 * lastName and emailType, your method should return 
	 * complete email address. 
	 * Example:
	 * firstName -> john 
	 * lastName -> snow 
	 * emailType -> gmail 
	 * return -> johnsnow@gmail.com
	 */
	
	//lets also ask for the year they were born 
	
	
	
//	return type methodName( all parameters )
//	{
		
//    ....code....
//    ....code....
	
//		return statement;
//	}
	
	/**
	 * 
	 * This method will get the following parameters and return a full 
	 * email as a String.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param emailType
	 * @param year
	 * @return
	 */
	String createEmail(String firstName, String lastName, String emailType, int year)
	{
		//firstNamelastNameYear@emailType.com
		String email = firstName + lastName + year + "@" + emailType + ".com";
				
		return email;
		
		
		//	return firstName + lastName + year + "@" + emailType + ".com";
	}
	
	
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
		
		
		
	}
	
	
	
	
	
	
	
}
