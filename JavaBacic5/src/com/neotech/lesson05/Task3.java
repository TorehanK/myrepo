package com.neotech.lesson05;

public class Task3 {
	public static void main(String[] args) {

		boolean isFriday = true;
		int date = 13;
		
		//a nested if ( if ... if-else ... else)
		
		if (isFriday) {
		   System.out.println("It's Friday. I am going to watch a movie.");
		   if (date == 13) {
			   System.out.println("I will watch a scary movie.");
		   } else {
			   System.out.println("I will watch a comedy.");
		   }
		} else { //it is not friday
			System.out.println("It is not Friday, I am going to study JAVA");
		}

		//what if the date is 15th: I will be watching a thriller
		
		
		if (isFriday) {
			   System.out.println("It's Friday. I am going to watch a movie.");
			   if (date == 13) {
				   System.out.println("I will watch a scary movie."); 
			   } else if (date == 15) {
					   System.out.println("I will watch a thriller movie");
			   } else {
				   System.out.println("I will watch a comedy.");
			   }
			} else { //it is not friday
				System.out.println("It is not Friday, I am going to study JAVA");
			}
}
	}

