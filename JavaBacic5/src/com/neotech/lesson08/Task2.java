package com.neotech.lesson08;

public class Task2 {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;
		
		while (workDay) {
			if(day<6) {
				System.out.println("I need a day off! ");
		
			}else {
				System.out.println("I do not need a day off anymore! ");
				workDay = false;
			}
			day++;
			
		}
		int day2 = 1;
		while (day2 < 6) {
			System.out.println("I need a day off!");
			day2++;
		}
		System.out.println("I do not need a day off anymore!");
		
	}

}
