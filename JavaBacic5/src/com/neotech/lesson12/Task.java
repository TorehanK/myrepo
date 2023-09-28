package com.neotech.lesson12;

public class Task {

	public static void main(String[] args) {

		//Find largest number in array
		
		int[] numbers = {23, 56, -75, 16, 80, 70, -40};
		
		int largest = numbers[0]; // assume first number is the largest
		
		//loop through all numbers to compare with my current largest number 
		for (int num : numbers)
		{
			//check if the current number is larger than my largest number
			if(num > largest)
			{
				largest = num;
			}
		}
		System.out.println(largest);
		
		
		
	}

}
