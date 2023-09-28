package com.neotech.lesson17;

public class Homework1 {

	public static void main(String[] args) {

		// Create a String that will hold a sentence. 
		// Write a program to get a new String without any spaces.

		String str = "So sorry that we did not cover replace methods!";
		
		String str2 = str.replace(" ", "");
		
		System.out.println(str2);
		
		System.out.println("old -> " + str + "; length: "+str.length());
		System.out.println("new -> " + str2 + "; length: "+str2.length());
		
	}

}
