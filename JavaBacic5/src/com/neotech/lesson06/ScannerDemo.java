package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {


		//data type identifier operator value;
		
		//how to import:
		//1.Import specifically the class
		//2.Windows: ctrl + shift + O
		
		//input is the identifier/name that we gave to this new thing we declared 
		
		Scanner input = new Scanner(System.in);
		
		
		String name = input.next();
		System.out.println("Your name is " + name);
		
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);
		
		System.out.println("Please enter your salery: ");
		double salery = input.nextDouble();
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
