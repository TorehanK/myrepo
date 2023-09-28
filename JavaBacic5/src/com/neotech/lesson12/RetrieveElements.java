package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {

		
		char[] grades = {'A', 'B', 'C', 'D', 'E'};
		
		//how to get values from array
		
		//1st way, using indexed for loop
		
		for(int i= 0; i <= grades.length-1; i++)
		{
			System.out.print(grades[i] + ", ");
		}
		System.out.println();
		
		//enhanced for loop, advanced for loop, for-each loop
		
		for(char element : grades)
		{
			System.out.print(element + ", ");
		}
		System.out.println();
		
		String[] fruits = {"Apple", "Orange", "Tomato", "Cucumber", "Cherry"};
		for(int i = 0; i < fruits.length; i++)
		{
			if(fruits[i].equals("Orange"))
			{
				System.out.println(fruits[i] + " is my favourite fruit!");
			}
			else
			{
				System.out.println(fruits[i]);
			}
			System.out.println("---------------------");
			
			
			for(String fruit : fruits)
			{
				if(fruit.equals("Orange"))
				{
					System.out.println(fruit+ " is my favourite fruit!");
				}
				else
				{
					System.out.println(fruit);
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}

}
