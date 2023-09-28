package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {

		// Declare a variable
		String firstName;
		
		//assign a value(initialize)
		firstName = "Torehan";
		System.out.println("My first name is " + firstName);
				
		//declare a variable and assign a value
		String lastName = "Kahya";
		
		int age = 24;
		
		System.out.println(firstName + " " + lastName + " " + age);
		System.out.println(firstName + " " + lastName + " " + (age + 5));
		
		//After 10 years
		// re-assign a new value to the container
		
		age += 10; // same age = age + 10;
		lastName = "Pitt";
		
		System.out.println("After getting married");
		System.out.println(firstName + " " + lastName + " " + age);
		


	}

}
