package com.neotech.review05;

public class MethodWithReturn {

	public static void main(String[] args) {


		String name = "Emilija";
		int numOfChars = name.length();
		
		System.out.println("The length of " + name + " is " + numOfChars);
		
		MethodWithReturn m = new MethodWithReturn();
		boolean res = m.isOdd(8);
		System.out.println("The number 8 is odd? --> " + res);
				
		boolean res2 = m.isOddAnotherWay(11);
		System.out.println("The number 11 is odd? --> " + res2);
		
		boolean res3 = m.isOddEnhanced(7);
		System.out.println("The number 7 is odd? --> " + res3);
	}

	boolean isOdd(int num) { //1st way
		boolean result;
		
		if(num%2 == 1) {
			result = true;
		}else {
			result = false;
		}
		return result;
		
	}
	
	boolean isOddAnotherWay (int num) { //2nd way
		if(num % 2 == 1) {
			return true;
		}else {
			return false;
		}
	}
	boolean isOddEnhanced(int num) { //3rd way If this is confusing, dont worry. 
		//divide number by 2, if the result is true-> return true, if false-> return false
		return num%2==1;
	}
	
	
	
}
