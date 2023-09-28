package com.neotech.lesson09;

public class SkipNumbers {

	public static void main(String[] args) {

		//print numbers from 1 to 10, sikp 3,6,9
		
		for (int i = 10; i >= 1; i--)
		{
			if (i == 3 || i == 6 || i == 9)
			{
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//print numbers from 20 to 30
		//but skip from 23 to 28
		
		for (int i = 20; i <= 30; i++) {
			if(i>=23 && i <=28) 
			{
				continue;
			}
			System.out.print(i + " ");
	}
    
}
}
