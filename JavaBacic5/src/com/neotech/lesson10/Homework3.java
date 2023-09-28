package com.neotech.lesson10;

public class Homework3 {

	public static void main(String[] args) {

		/* 3. Print numbers from 1 to 50 except those 
		 * that are divisible by 3. */
		
		
		//using while loop
		int i = 1;
		while(i <= 50)
		{
			
			if (i%3 == 0)
			{
				
				i++;
				//do not print
				continue;
			}
			else
			{
				System.out.print( i + " ");
			}
			
			
			i++;
		}
		System.out.println();
		
		//do while
		
		int j = 1;
		do {
			
			if(j%3==0)
			{
				j++;
				continue;
			}
			System.out.print(j + " ");
			
			
			j++;
		}while(j<=50);
		System.out.println();
		
		
		//using for loop
		for (int k = 1; k <= 50; k++)
		{
			if(k%3==0)
			{
				continue;
			}
			System.out.print(k + " ");
		}
		System.out.println();
	}

}
