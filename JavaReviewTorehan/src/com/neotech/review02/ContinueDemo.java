package com.neotech.review02;

public class ContinueDemo {

	public static void main(String[] args) {

		for (int age = 11; age <= 20; age++) {
			if (age == 13) {
				continue;
			}
				System.out.println("Happy Birthday! You are " + age + " years old!");
		}
	
		System.out.println("-------------------Same with while---------------------");
		
		
		int age2 = 10;
		
		while (age2 < 20) {
			age2++;
			if (age2 == 13) {
				
				continue;
			}
			System.out.println("Happy Birthday! You are " + age2 + " years old!");
			
		}

	}
}
