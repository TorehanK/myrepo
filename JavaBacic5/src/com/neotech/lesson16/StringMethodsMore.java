package com.neotech.lesson16;

import java.util.Scanner;

public class StringMethodsMore {

	public static void main(String[] args) {

		//charAT()
		
//		Scanner scan = new Scanner(System.in);
//		char letter = scan.next().charAt(0);
//		System.out.println(letter);
		
		
		String name = "Dogukan";
		char letter = name.charAt(3); //give the character index
		System.out.println("letter: " + letter);
		
		
		//indexOf()       get the index of this character/Opposite of what we did above
		int index = name.indexOf('u');
		System.out.println(index);
		
		
		
		String name1 = "Yahya";
		System.out.println("Index of a is: " + name1.indexOf('a'));
		System.out.println("Index of hy is: " + name1.indexOf("hy"));
		
		
		//subString()   ---> part of a String
		
		String message = "Today is a very good day";
		
		//1 parameter, beginning index
		String substr = message.substring(9);
		//get a substring of the original string starting at index 9
		System.out.println(substr);
		
		//2 parameters, beginning and ending index
		String substr2 = message.substring(6, 8);
		System.out.println(substr2); //only print indexes from 6 to 8 which is 'is' in this case
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
