package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {

		
		//give a number from 1-7, print the name of the day
		
		
		
		
		int day = 1;
		String dayName;
		
		
		
		if (day == 1) 
		{
			dayName = "Monday";  //short way
			//System.out.println("Monday");
		}
		else if (day == 2)
		{
		System.out.println("Tuesday");	
		}
		else if (day == 3) 
		{
			System.out.println("Wednesday");
		}
		else if (day == 4)
		{
			System.out.println("Thursday");
		}
		else if (day == 5)
		{
			System.out.println("Friday");
		}
		else if (day == 6)
		{
			System.out.println("Saturday");
		}
		else if (day == 7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		
		
		
		//using switch case:
		
		switch(day) //we write switch and use the variable that holds out value
		{
		case 1:
			System.out.println("Monday");
			break; //ends the execution - takes you out of the switch
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:  //same as else block on if else
			System.out.println("Invalid");
			break;
		}
		
		// switch can also be used in byte, short, char, int and String
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
