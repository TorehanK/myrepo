package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {

		//Data Type  identifier  operator value;
		//1st way
		int number1 = 15;  
		
		//2nd way
		//data type + identifier --> variable declaration
		int number2;
		//identifier + operator + value --> assigning a value
		number2 = 10;
		
		//3rd way
		/*
		 * same as: 
		 * char var1;
		 * char var2;
		 * char var3;
		 */
		char var1, var2, var3; //declaring multiple variables of the same type
		
		var1 = '@';
		var2 = '#';
		var3 = 'T';
		
		System.out.println(var1);
		
		//sabah
		
		System.out.println(number1);
		System.out.println(number1);
		
		//value reassignment
		//we are NOT creating a new variable
		number1 = 55;
		System.out.println(number1);
		System.out.println(number1);
		
		//we cannot do this since we told Java that the number1 is of type int.
		//number1 = "sabah";
	}

}
