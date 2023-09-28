package com.neotech.lesson06;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your first name: ");
		String fName = scan.next();
		
		System.out.println("Please enter your last name: ");
		String lName = scan.next();
		
		System.out.println("Your full name is ---> " + fName + " " + lName);
	}

}
