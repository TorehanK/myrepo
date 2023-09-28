package com.neotech.lesson001Homework;

import java.util.Scanner;

public class Homework10 {
	
	public static void main(String[] args) {
		
		
//		Homework 1:
//
//			Ask the user to enter an integer and build the following pattern:
//			Hint: Use scanner, if user entered number 5, there should be 5 rows.
//			In the first row, 0 spaces, (2 * 5) - 1 stars
//			In the second row, 1 spaces, (2 * 4) - 1 stars
//			In the third row, 2 spaces, (2 * 3) - 1 stars
//			In the fourth row, 3 spaces, (2 * 2) - 1 stars
//			In the fifth row, 4 spaces, (2 * 1) - 1 stars
//
//			*********
//			 *******
//			  *****
//			   ***
//			    *


//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number!");
//		int num = scan.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			
//			for(int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//		for(int k = 1; k <= 2*(num-i)+1; k++){
//			System.out.print("*");
//		
//		}
//		System.out.println();
//		
//		}
//		
//		
		
//			Homework 2:
//
//			Ask the user to enter an integer and build the following pattern:
//			Hint: Use scanner, if user entered number 5, there should be two parts
//			The first part, 1 to 5
//			The second part, 4 to 1
//
//			1 
//			1 2 
//			1 2 3 
//			1 2 3 4 
//			1 2 3 4 5 
//			1 2 3 4 
//			1 2 3 
//			1 2 
//			1
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		for(int i = num - 1; i >= 1; i--) {
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
	}

}
