package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {
	public static void main(String[] args) {
		
		
		//Data Type - Identifier - Assignment Operator - Value;
		//Class Name - Identifier - Assignment Operator - New + Classname
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		String text1, text2, text3;
		int age, year;
		double salary;
		boolean isRaining; 
		char gender;
		
		
		//text1 = scanner.next();
		
		//difference between next() and nextLine();
		
//		text2 = scanner.next();
//		System.out.println(text2);
//		text3 = scanner.nextLine();
//		System.out.println(text3);
//		
		
//		System.out.println("Enter your age: ");
//		
//		age = scanner.nextInt();
//		System.out.println("Enter the current year: ");
//		year = scanner.nextInt();
//		
//		
//		/* Comment on multiple lines like:
//		 * select code CTRL + Shift + /
//		 * 
//		 * 
//		 * 
//		 */
//		
//		System.out.println("What is your salery: ");
//		salary = scanner.nextDouble();
//		
//		System.out.println("Is it raining today?: ");
//		isRaining = scanner.nextBoolean();
//		
//		System.out.println("Salary is " + salary + " and isRaining is " + isRaining);
//		
		
		
//				
//		System.out.println("Enter your gender (M or F): ");
//		gender = scanner.next().charAt(0); // method chaining 
//		System.out.println(gender);
//		
		// long way
		//String str = scanner.next();
		//get only the first char
		//gender = str.charAt(0);
		
		
		
		System.out.println("Enter your name, age, salary and gender:");
		text1 = scanner.next();
		age = scanner.nextInt();
		salary = scanner.nextDouble();
		gender = scanner.next().charAt(0);
		
		System.out.println("Your info is: " + text1 + " " + age + " " + salary + " " + gender + "!");
		
		
		
		
		
		
		
		
		
		
	}
	

}
