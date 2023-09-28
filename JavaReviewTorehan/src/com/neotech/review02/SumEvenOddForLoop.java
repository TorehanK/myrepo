package com.neotech.review02;

public class SumEvenOddForLoop {

	public static void main(String[] args) {

		//Add Even numbers
		//Also Add Odd numbers
		//Also add All numbers
		//Between 1 and 20
		//using for loop
		
		int sumEven = 0;
		int sumOdd = 0;
		int total = 0;
		
		for(int i = 1; i <= 20; i++) {
			
			if(i%2==0) { //even number
				sumEven += i;
			}else {//odd
				sumOdd += i;
			}
			total +=i;
			
		}
		System.out.println("The sum of even numbers = " + sumEven);
		System.out.println("The sum of odd numbers = " + sumOdd);
		System.out.println("The sum of all numbers = " + total);
		
		
		
	}

}
