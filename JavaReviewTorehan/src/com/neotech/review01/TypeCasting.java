package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		
		// byte < short(2bytes) < int(4bytes) < long(8bytes) < float < double
		//float and double --> desibel points

		
		int intNumber = 34;
		
		// widening/implicit casting
		double doubleNumber = intNumber;
		
		System.out.println("intNumber " + intNumber);
		System.out.println("doubleNumber " + doubleNumber);
		
		// narrowing / explicit casting / manually
		byte byteNumber = (byte) intNumber; // It is risky, you MAY lose info
		
		System.out.println("byteNumber " + byteNumber);
		
		//re-assign
		intNumber = 590;
		
		byte b2 = (byte) intNumber;
		
		System.out.println("b2 " + b2); //data is lost in this case
		
		
		byte b3 = 85;
		int i3 = (int)b3; //in widening, we dont need to write (int) at the end
		
		
		
		
		
		
		
	}

}
