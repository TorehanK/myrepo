package com.neotech.review02;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {

		int number = 5;
		
		switch(number) {
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
		case 7:
			System.out.println("7");
		}
	}

}
