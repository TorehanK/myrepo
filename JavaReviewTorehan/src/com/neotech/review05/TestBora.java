package com.neotech.review05;

public class TestBora {

	public static void main(String[] args) {

		Bora b = new Bora();
		b.addTwoNumbers();
		b.addTwoNumbersThatIGive(7, 5);
		int res1 = b.addTwoNumbersAndGiveMeTheResult();
		
		int res2 = b.addTwoNumbersThatIGiveAndGiveMeTheResult(7, 5);
		
		if(res2 == 12) {
			System.out.println("Good job Bora!");
		}else {
			System.out.println("I still love you!");
		}
	}

}
