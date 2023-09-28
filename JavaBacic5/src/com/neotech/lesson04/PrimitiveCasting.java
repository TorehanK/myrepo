package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {

		double d1 = 3.7; // no casting happened (3.7)
		System.out.println(d1);

		double d2 = 6; // casting happened (6.0)
		System.out.println(d2);

		// widening, implicit casting, automatic
		int num = 5;
		double d3 = num;

		System.out.println(d3);

		// compiler error
		// int num2 = 6.5;

		//narrowing, explicit casting, manually
		int num2 = (int) 6.5; // I tell java I want to store this here
		System.out.println(num2); // it will miss the .5 part
		
		byte b1 = (byte) 4560;
		System.out.println(b1);
		
		int i2 = 40;
		byte b2 = (byte) i2; //I might lose data
		System.out.println(i2);
		
		
		long l1 = 17;
		int number = (int) l1;  // I am not losing data
		
	    System.out.println(number);
	    
	    
	    long L2 = 54234234534L;
	    int number2 = (int) L2; //I am losing data
	    System.out.println(number2);
		
		//another example
	    int number3 = 250;
	    float f1 = (float) number3; //I can write it, but it is still widening
	    
	    float f2 = number3; //java handels it automatically
	    
	    System.out.println(f1);
	    System.out.println(f2);
	    
	    int number1 = 500;
	    byte nr1 = (byte) number2;
	    
	    System.out.println(number2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
