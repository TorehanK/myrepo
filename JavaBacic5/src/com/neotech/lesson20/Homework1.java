package com.neotech.lesson20;

import java.util.Scanner;

public class Homework1 {
	/*
	 * Create a method that will accept a String as a parameter and return a new
	 * String that consist only of vowels. Method should be available only inside
	 * the class where it was declared and executed by calling it's name.
	 */

	// getVowels(String str)
	// input: String str
	// output: String result
	// access within the class only: private
	// access directly by name: static
	private static String getVowels(String str) {
		// implement the functionality
		String result = str.replaceAll("[^aeiouAEIOU]", "");
		return result;

		// or simply: return str.replaceAll("[^aeiouAEIOU]", "");
	}

	public static void main(String[] args) {
		// System.out.println(getVowels("Good evening everyone"));
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(getVowels(str));
	}

}
