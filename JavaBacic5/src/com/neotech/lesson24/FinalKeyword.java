package com.neotech.lesson24;

public class FinalKeyword {

	public static String str = "Hello";

	// Final variable = Constant! it can NOT BE RE-ASSIGNED
	public static final String str2 = "Bye";

	public final double PI = 3.1415926; // PI will always have this value

	public static void main(String[] args) {
		str = "Hi";
		// str2 = "Try me";//Compile error

		// local variables
		final String finalStr = "Java is easy";
		// finalStr = "Java is difficult";

		final int age = 28;
		// age = 29;
	}

	// final method can not be overridden
	public final void hello() {
		System.out.println("Hello, i am a final method");
	}

	// YES we can overload a final method
	public final void hello(String name) {
		System.out.println("Hello " + name);
	}
}

class SubClass extends FinalKeyword {
	// lets try to override the hello() method
//	@Override
//	public void hello() { // Compile error: final method can not be overridden
//		
//	}

	// Not overriding: Method signature is different, just another method
	public void hello(int num) {

	}
}
