package com.neotech.review11;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int[] numbers = new int[3];

		try {
			numbers[0] = 10;
			numbers[1] = 20;
			numbers[2] = 30;
			numbers[3] = 40;
			numbers[4] = 50;
			System.out.println("Will this line be executed?"); //No
		} catch (Exception ex) {
			
//			System.out.println(ex);
//			System.out.println(ex.getMessage()); //the message inside the exception
//			ex.printStackTrace(); // tells you where it happened, line12
			
			//Printing a meaningfull message
			System.out.println("Error: You are storing an element outside of the array!");
			
		} 
		System.out.println("Continue code execution...");

	}

}
