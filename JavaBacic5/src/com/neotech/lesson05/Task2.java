package com.neotech.lesson05;

public class Task2 {

	public static void main(String[] args) {

		int day = 5;
		/*
		 * 1. if day == 1 --> Today is monday and we are working 2. else if day == 2 -->
		 * Today is Tuesday and we are working 3. else if day == 3 --> Today is
		 * Wednesday and we are working
		 * 
		 */

		if (day == 1) {
			System.out.println("Today is monday and we are working ");
		} else if (day == 2) {
			System.out.println("Today is Tuesday and we are working ");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we are working");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we are working");
		} else if (day == 5) {
			System.out.println("Today is Friday and we are working");
		} else {
			System.out.println("We are on a break on weekend");
		}

		// lets modify task, lets print if its weekday or weekend
		// 1-5 weekday 5-7 weekend others, else--> wrong input

		if (day < 6) { // or we can write (day >= 1 && day <=5)
			System.out.println("It is a weekday and we are working");
		} else if (day < 8) { //or we can write (day == 6 || day == 7)
			System.out.println("It is a weekend and we are off");
		} else {
			System.out.println("Wrong Input");
		}

	}

}
