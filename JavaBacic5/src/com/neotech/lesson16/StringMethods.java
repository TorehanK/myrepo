package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {

		//1st way we declare strings
		
		String name = "Sabah"; //string literal
		
		//2nd way to declare strings
		
		String name2 = new String("Ali");
		
		int size = name.length();
		System.out.println("The length of the name is: " + size);
		
		
		
		String school = "Neotech";
		System.out.println("The length of the school name is: " + school.length());
		
		String school2 = "        Neotech           ";
		System.out.println("The length of the school name is: " + school2.length());
		
		
		//toLowerCase(), toUpperCase()
		String city = "New York";
		String lowerCaseCity = city.toLowerCase();
		
		
		System.out.println(lowerCaseCity);
		System.out.println(city.toUpperCase());
		
		//what is the value of city?
		System.out.println(city);
		
		//String objects are immutable!! ----> It does not change
		
		
		//created a new string and city now points at it
		city = "New York City"; //city is new String(" ");
		System.out.println(city);
		
		
		//concat()
		
		String sentence = "The size of " + school + " is " + school.length();
		
		String name3 = "Emre";
		String lastName = "Cinar";
		
		String fullName = name3 + lastName;
		
		String fullName2 = name3.concat(lastName);
		
		System.out.println(fullName2);
		
		//what if we want to add a space?
		
		String nameWithSpace = name3 + " " + lastName;
		
		String nameWithSpace1 = name3.concat(" ").concat(lastName); //method changing ---> to put space inbetween
		
		System.out.println(nameWithSpace1);
		
		//isEmpty()
		String str = " ";
		boolean isEmp = str.isEmpty(); //check is the string is empty
		System.out.println(isEmp);
		
		//trim()
		
		String str2 = "       I am   very     verry   hungry!       ";
		System.out.println(str2.trim());  //ONLY TRIMS THE SIDES
		
		System.out.println("Length of str2 is: " + str2.length());
		System.out.println("Length of the trimmed str2 is: " + str2.trim().length());
		
		
		System.out.println("-----------------");
		
		int[] num = {3,4,5,6};
		int sizeArray = num.length; //this is a property of arrays, not a method
		
		
		
		
		
		
		
		
		
	}

}
