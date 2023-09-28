package com.neotech.review11;

public class ExceptionDemo {

	public static void main(String[] args) {
		division(8,2);
		division(5,0);
		division(20,6);
	}

	public static void division(int num1, int num2) {
		try {
		int result = num1 / num2;
		System.out.println("The result -> " + result);
		}catch(Exception ex){
			
			System.out.println("Problem when dividing -> " + num1 + " by " + num2);
//			System.out.println("Exception -> " + ex);
//			System.out.println("Exception Message -> " + ex.getMessage());
//			ex.printStackTrace();
		}finally {
			System.out.println("NeoTech is the best!");
		}
		
		//TRY-CATCH is like a continue button. The line 5,0 is not executed because divided by 0 is error
	}
}
