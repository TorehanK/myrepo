package com.neotech.lesson28;

import java.util.ArrayList;

public class Homework {
//	Create a ArrayList that will store 5 names into it.
//	▪ Find out whether the given ArrayList is empty or not?
//	▪ Check whether the specific name is present in an ArrayList or not?
//	▪ Find the size of your ArrayList and print all values from the ArrayList
	public static void main(String[] args) {

		// Declare the ArrayList
		ArrayList<String> names = new ArrayList<>(); // ctrl+shift+ o --> brings java.util.ArrayList, we import it

		// in arrays we use assign operator
		// arr[0] = "Can";

		// [Can,Julius,Helen,Smile,Caglar]
		names.add("Can");
		names.add("Helen");
		names.add("Smile");
		names.add(1, "Julius");
		names.add("Caglar");

		// is the arraylist empty?

		System.out.println("Is the arraylist empty? " + names.isEmpty());

		// does it contain Zeynep?
		System.out.println("Does it contain Zeynep? " + names.contains("Zeynep"));

		System.out.println("The size of arraylist is: " + names.size());

		for (String name : names) {
			System.out.print(name + " - ");

		}
	}

}
