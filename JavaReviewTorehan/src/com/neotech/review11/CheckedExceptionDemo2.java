package com.neotech.review11;

public class CheckedExceptionDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Hi Java");
		
		try {
			Thread.sleep(2000);//2000 miliseconds(ms) = 2 seconds
		} catch (InterruptedException e) {
			System.out.println("Something went wrong while waiting!");
		} 
		
		System.out.println("Bye Java");
		
		
	}

}
