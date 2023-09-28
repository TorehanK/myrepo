package com.neotech.lesson16;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a String and if the String is not empty perform the following: 
		 * - if the String has an odd number of characters and has 3 or more 
		 * characters, print the character in the middle of the String.
		 */
		
		String str = "korab";
		
		//isEmpty()
		if(!str.isEmpty()) // ! --> not   so if str is not empty in this case
		{
			int length = str.length();
			
			if(length % 2 == 1 && length >= 3) 
				//if the string has odd number of characters
				//if the string has 3 or more characters
			{
				System.out.println(str.charAt(length/2));
			}
		else {
			System.out.println("The string is empty!");
		}
	}
	}
}
