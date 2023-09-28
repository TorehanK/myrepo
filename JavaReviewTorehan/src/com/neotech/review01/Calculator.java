package com.neotech.review01;

import java.util.Scanner;

public class Calculator {
	/*
	 * Ask the user to enter 2 numbers Ask the user for the operator (+,-,/,*) solve
	 * it using if-else
	 */

	public static void main(String[] args) {

		Scanner torehan = new Scanner(System.in);

		System.out.println("Please enter the first number: ");
		double d1 = torehan.nextDouble();

		System.out.println("Please enter the second number: ");
		double d2 = torehan.nextDouble();

		// System.out.println(d1 + " " + d2);

		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = torehan.next();

		if (operator.equals("+")) {
			double result = d1 + d2;
			System.out.println("The result is " + (d1 + d2));

		} else if (operator.equals("-")) {
			double result = d1 - d2;
			System.out.println("The result is " + (d1 - d2));

		} else if (operator.equals("*")) {
			System.out.println("The result is " + (d1 * d2));

		} else if (operator.equals("/")) {
			System.out.println("The result is " + (d1 / d2));
		} else {
			System.out.println("Invalid operator ");
		}
		if (operator.equals("+") ||  operator.equals("-") || operator.equals("*") || operator.equals("/"))
			System.out.println("The result is " + result);
	
	}

}
