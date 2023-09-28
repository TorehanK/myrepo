package com.neotech.lesson17;

public class Homework2 {

	public static void main(String[] args) {

//		Homework 2:
//	    Create a String that should be combination of letters, numbers and special characters. 
	//Find out how many alpha characters are there in the String. (alpha characters means letters)
		
		String str = "Hello12312424351/&+&^&/&()&)All21321564894";
		
		//[0-9] --> any numbers
		//[a-z]--> all lowercase letters
		//[A-Z]--> all uppercase letters
		//[a-zA-Z]--> al letters
		//[0-9a-zA-Z]--> all numbers and letters
		//[^0-9a-zA-Z]--> anything that is not a number and letter
		
		// "!" for strings is "^"
		//[abc] --> same as [a-c]
		//[^abc] --> anything accept abc
		
		// . --> any character
		// \d --> same as [0-9]
		// \s --> a white space character
		// \s+ --> one or more spaces
		
		String str2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str2);
		
		System.out.println("How many alpha characters are there? " + str2.length());
		
		//what if I want to find out how many numbers are there?
		System.out.println("How many numbers are there? " + str.replaceAll("[^0-9]", "").length());
		
		//What if I want to find out how many special characters I have?
		System.out.println(str.replaceAll("[0-9a-zA-Z]", "").length());
													   //UP--> with nothing
		//common issues
		String str3 = str.replaceAll("a-z", "-");  //not a regular expression
		String str4 = str.replaceAll("[az]", ""); // this only means a and z, not a to z
		
	}

}
