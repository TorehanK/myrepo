package com.neotech.lesson06;

public class LogicalOperations {

	public static void main(String[] args) {
		
		
		// && --> and  || --> or ! --> not
		
		// declare number
		// if the number is between 1--10 --> number is small
		//if the number is between 11--100--> number is medium
		//if the number is between 101-1000--> number is large
		
		int num = 101;
		//if number is >=1 AND <= 10
		
		if(num>= 1 && num <= 10) //true && false ---> false
		{
			System.out.println((num) + " is small!");
		}
		else if (num >= 11 && num <= 100)
		{
			System.out.println(num + " is medium!");
		}
		else if (num >= 101 && num <= 1000)
		{
			System.out.println(num + " is large!");
		}
		else 
		{
			System.out.println("Number is out of range!");
		}
	}

}
