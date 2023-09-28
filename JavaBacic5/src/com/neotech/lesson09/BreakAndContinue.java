package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		
		
		System.out.println("-----break------");
		
		for (int i = 1; i <= 10; i++)
		{
			if(i == 4)
			{ 
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-----CONTINUE-----");
		
		for (int i = 1; i <=10; i++)
		{
			if(i == 4)
			{
				continue; //skips 4
			}
			System.out.println(i);
		}
		
		
		
		
		
		
	}
}
