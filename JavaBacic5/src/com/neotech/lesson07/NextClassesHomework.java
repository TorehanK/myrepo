package com.neotech.lesson07;

import java.util.Scanner;

public class NextClassesHomework {

	public static void main(String[] args) {

		
		//Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		//C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program 
		//should print which grade was entered by the user with explanation.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a grade! (A,B,C,D) ");
		
		char grade = scan.next().charAt(0);
		
		
		
		if (grade == 'A'){
			System.out.println("A is Excellent! ");
		}
		else if(grade == 'B') {
			System.out.println("B is good! ");
		}
		else if(grade == 'C') {
			System.out.println("C is Average! ");
		}
		else if(grade == 'D') {
			System.out.println("D is bad! ");
		}
		else {
			System.out.println("Not acceptable! ");
		}
		
		
		switch (grade) {
		case 'A':
		System.out.println("A is Excellent! ");
		  break;
		case 'B':
			System.out.println("B is good! ");
			break;
		case 'C':
			System.out.println("C is Average! ");
			break;
		case 'D':
			System.out.println("D is Bad! ");
			break;
			default:
				System.out.println("Not acceptable! ");
			
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

} 
	
}
