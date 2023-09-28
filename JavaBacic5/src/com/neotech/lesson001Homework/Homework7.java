package com.neotech.lesson001Homework;

import java.util.Scanner;

public class Homework7 {
	
	public static void main(String[] args) {
		
//		Homework 1
//
//		Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average,
//		D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade 
//		was entered by the user with explanation.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter grade");
		int grade = scan.nextInt();
		
		if(grade<=100 && grade>=90) {
			System.out.println("A-Excellent!");
		}else if(grade<90 && grade>=80) {
			System.out.println("B-Good!");
		}else if(grade<80 && grade>=70) {
			System.out.println("C-Average!");
		}else if(grade<70 && grade >0) {
			System.out.println("D-Bad");
		}else {
			System.out.println("Not Acceptable");
		}
		
		
	}

}
