package com.neotech.lesson06;

public class HomeworkRightWay {
	public static void main(String[] args) {

		boolean hasAllergy = false;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = false;
		boolean seafood = true;

		if (hasAllergy) {
			System.out.println("You have an allergy");

			if (peanut) {
				System.out.println("Don't eat peanuts!");
			}
			if (lactose) {
				System.out.println("Don't dring milk!");
			} else {
				System.out.println("You can drink milk!");
			}
			if (bee) {
				System.out.println("");
			}
			if (seafood) {
				System.out.println("Don't eat fish!");
			}
		}
		else
		{
			System.out.println("You are healthy!!!");
		}
		
		
		
		
		
	}

}

			