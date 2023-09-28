package com.neotech.lesson001Homework;

import java.util.Scanner;

public class Homework6 {
public static void main(String[] args) {
	
//	1. Ask the user to enter the height in inches. Person should be classified as one of the following:
//		• short (under 60 inch)
//		• medium (between 60 -72 inch)
//		• tall (over 72 inch)
		
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter hight in inches!");
		int height = scan.nextInt();
		
		if(height<60) {
			System.out.println("You are short!");
		}if(height>=60 && height<72) {
			System.out.println("You are medium height!");
		}if(height>=72) {
			System.out.println("You are tall!");
		}
		
		
//		2. Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
//		If any day from 1-5 → output "It is a weekday"
//		Any day from 6-7 → output "It is a weekend",
//		Any other day → output "Invalid day"
		
		
		System.out.println("Please enter the day form 1 to 7");
		int day = scan.nextInt();
		
		if(day > 1 && day < 5) {
			System.out.println("Its a weekday!");
		}if(day == 6 || day == 7) {
			System.out.println("Its a weekend!");
		}else {
			System.out.println("Invalid entry!");
		}
	
	
	
	
	
	
	
	
	
	
}
}
