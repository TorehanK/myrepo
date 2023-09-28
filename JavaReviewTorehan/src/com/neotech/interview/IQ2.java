package com.neotech.interview;

public class IQ2 {
	
	public static void main(String[] args) {
		
//		Write a java program to check whether a given number is prime or not? prime--> divisible by 1 and itself(like 7)
		//number 1 is NOT prime
		//Prime number is divisible only by 1 and itself(Like 7)  (Prime=asal sayi)
		
		//If we add numbers and it is dividable, than its not prime
		
		
		int number = 35; //Not prime, divisible by 1, 5, 7, 35
		boolean prime = true;
		
		if(number == 1) {
			prime = false;
		}else {
			for(int i = 2; i < number; i++) {
				if(number%i == 0) {
					System.out.println(number + " is divisible by " + i);
					prime = false;
					break;
				}else {
					System.out.println(number + " is NOT devisible by " + i);
				}
			}
		}
		System.out.println("-------------------------");
		System.out.println(number + " is prime? " + prime);
		
		
		
		
		
		
	}

}
