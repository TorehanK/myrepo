package com.neotech.lesson35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	public static void main(String[] args) {
		calculator();
		
		
		
		
		System.out.println("End of code!");
	}

	public static void calculator() 
	
	{
		try {
			division(9,3);
			division(10,2);
			division(5,0);
			division(4,2);
		} catch (ArithmeticException e) {
			System.out.println("Handled!");
		}
		
	}
	
	
	public static void division(int a, int b) throws ArithmeticException
	{
		//1st way to handle is: try and catch block
		//2nd way to handle is: throws ...Exception
		System.out.println(a/b);
	}
	public static void read(String filePath) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(filePath);
	}
}