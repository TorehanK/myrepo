package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		System.out.println("Addition");
		cal.add(5, 7);
		cal.add(10, 15);
		cal.add(300, 125);
		
		System.out.println("Multiply");
		cal.multiply(5, 7);
		cal.multiply(6, 2);
		
		System.out.println("Division");
		cal.division(8, 3);
		cal.division(55.2, 13.5);
		cal.division(3.5, 0);
		
		
		
	}

}
