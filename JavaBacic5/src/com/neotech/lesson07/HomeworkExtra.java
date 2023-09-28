package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String city;
		double f, c;
		
		
		System.out.println("Please enter the city and the temperature: ");
		city = scan.next();
		f = scan.nextDouble();
		
		c= (f-32)*5/9;
		System.out.println("The temperature in " + city + " is " + c + " degrees celcius! ");
		
		
		
		
		
		
		
		
	}
}
