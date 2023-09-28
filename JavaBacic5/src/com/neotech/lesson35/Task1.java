package com.neotech.lesson35;

class CantDriveException extends RuntimeException
{
	public CantDriveException(String msg)
	{
		super(msg);
	}
}

public class Task1 {

	/*
	 * Create a method to check age eligibility that will throw a runtime 
	 * exception.
	 * Method should throw an exception if age is less than 16.
	 */
	
	public static void main(String[] args) {
		
		try {
		canIDrive(18);
		canIDrive(14);
		}
		catch(CantDriveException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println("End of code!");
	}
	
	public static void canIDrive(int age)
	{
		if (age < 16)
		{
			//I should throw an exception
			//throw new RuntimeException("You cannot drive!"); 
			throw new CantDriveException("You cannot drive!");
		}
		else
		{
			System.out.println("Drive Safe!");
		}
	}
	
}
