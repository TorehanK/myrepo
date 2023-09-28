package com.neotech.lesson001Homework;

public class Homework4 {
	public static void main(String[] args) {
		
//		1. Create a Java program and name it Double Comparison.
//		Declare 2 double values and if value of first variable is higher then the second,
//		print “Double value __ is larger than __ .”
//		Otherwise print...
		
		
		double a = 15;
		double b = 20;
		
		if(a>b) {
			System.out.println("Double value a is larger than b");
		}else {
			System.out.println("Double value b is larger than a");
		}
		System.out.println("--------------------");
		
//		2. Create a Java program and name it Temperature Check.
//		Create variable to store temperature.
//		Your program should check if temperature is below 32
//		If temperature is below
//		    then it should print “Water will freeze with temperature __”,
//		    otherwise “Water will NOT freeze with temperature __”.

		int temp = 32;
		
		if(temp<32) {
			System.out.println("Water will freeze with temperature " + temp);
		}else {
			System.out.println("Water will not freeze with temperature " + temp);
		}
		
		
	}

}
