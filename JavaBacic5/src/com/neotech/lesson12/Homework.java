package com.neotech.lesson12;

public class Homework {

	public static void main(String[] args) {

		/*
		 * 1. Create a 2D array where you will store the following values:
- Mr, Mrs, Ms, Miss
-Smith, Jordan, Jackson, Obama.

After storing values print the following:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

* Be careful because they are mixed.


2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
Then you program should print name of the students that has A and B grade
		 * 
		 * 
		 */
		
		String[][] name = {
			{"Mr", "Mrs", "Ms", "Miss"},
			{"Obama", "Smith", "Jackson", "Jordan"} };
		
		for(int i = 0; i <= name.length; i++);
		{
			System.out.println(name[0][1] + ". " + name[1][1] +" "+ name[0][0] + " " + name[1][0] + " " + name[0][2] + ". " + name[1][2] +" "+ name[0][3] + ". " + name[1][3]);
		}
		System.out.println("---------------------------------------");
		
		
		//2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
		//Then you program should print name of the students that has A and B grade
		
		
		String[][] grade = {
				{"Torehan", "Ergin", "Mehmet", "Ahmet"},
				{"A", "B", "C", "D"} };
		
		for(int i = 0; i <= grade.length; i++);
		{
			System.out.println(grade[0][0] + " " + grade[1][0] + " " + grade[0][1] + " " + grade[1][1] + " " + grade[0][2] + " " + grade[1][2] + " " + grade[0][3] + " " + grade[1][3]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
