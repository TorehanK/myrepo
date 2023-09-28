package com.neotech.lesson08;

public class Task1 {

	public static void main(String[] args) {

		int x = 50;
		while (x >= 1) {
			System.out.println(x + " " );
			x -= 2;	
		}
				
		//solution 2
		int y = 50;
		while (y>=1) {
			if (y % 2 == 0) {
				System.out.println(x+ " ");	
				--y;
			}
		
		}
		
	}

}
