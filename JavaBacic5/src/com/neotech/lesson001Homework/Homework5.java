package com.neotech.lesson001Homework;

public class Homework5 {
public static void main(String[] args) {
	

//	Homework 1: 
//
//		Write a java program to check if a patient has allergies.
//		    If the patient does not have allergies print "You’re healthy!".
//		    If the patient has allergies, check if it is a peanut allergy, lactose allergy, bee allergy or seafood allergy 
//		    and print a statement telling the patient 
//		    "Don’t eat ___". (fill the line with the food names – peanut, seafood etc.)
	
			boolean hasAlergies = true;
			int type = 2;
			
	
			String allergy1 = "Peanuts";
			String allergy2 = "Lactose";
			String allergy3 = "Bee";
			String allergy4 = "Seafood";
			
			if(type == 1) {
				System.out.println("Don't eat " + allergy1);
			}else if(type == 2) {
				System.out.println("Dont eat " + allergy2);
			}else if(type == 3) {
				System.out.println("Dont eat " + allergy3);
			}else {
				System.out.println("Dont eat " + allergy4);
			}
			
			
			
			


//		Homework 2:
//		Write a program to implement following logic using
//		if-else if-else statement:
//		    if hour is less than 12 noon, greet with Good Morning
//		    if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
//		    if hour is greater than or equal to 3 pm, greet with Good Evening
			
			
			int hour = 16;
			
			if(hour<12) {
				System.out.println("Good morning!");
			}else if(hour >= 12 && hour < 15) {
				System.out.println("Good afternoon!");
			}else {
				System.out.println("Good Evening");
			}
			
//			*Interview Question:
//			    Write a Java Program to check whether number is Even or Odd.
			
			
			int number = 16;
			int remainder = number % 2;
			
			if(remainder==0) {
				System.out.println("The number is even!");
			}else {
				System.out.println("Number is odd");
			}
			
		
			
			
}
}
