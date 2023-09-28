package com.neotech.lesson16;

import java.util.Scanner;

public class Student {
//	Create a class Student that will have a method getGrade.
//	Your method should accept the score of a student and return a grade:
//		score > 90 - A
//		score > 80 - B
//		score > 70 - C
//		score > 50 - D
//		anything else - F
	
	//what is the return type?? -->char
	//what is the name of the method?? --> getGrade
	//what are the inputs?? --> int score
	
	char getGrade (int score)
	{
		char grade;
		
		if(score > 90) {
			grade = 'A';
		}else if(score > 80) {
			grade = 'B';
		}else if(score > 70) {
			grade = 'C';
		}else if(score > 50) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		
		return grade;
	}
	public static void main(String[] args) {
		
		
		Student st = new Student();
		
		char result = st.getGrade(75);
		System.out.println("Student 1 got " + result);
		
		//can we ask for a score?
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score: ");
		int s = scan.nextInt();
		char result2 = st.getGrade(s);
		System.out.println("Student 2 got " + result2);
		
		
		
		
		
		
		
		
		
		
	}
	
}
