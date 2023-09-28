package com.neotech.lesson13;

public class Task {

	public static void main(String[] args) {
		
//		Create a 2D array of integer type with 3 rows and 4 columns and 
//		print all values of the whole array.
		
		
		int[][] numbers = {
				{5,10,15,20},
				{1,2,3,4,},
				{3,6,9,12},
				{7,14,21,28}
		};
		
		for(int[] row : numbers) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		for(int row = 0; row < numbers.length; row++) {
			for(int col = 0; col < numbers[row].length; col++)
				System.out.print(numbers[row][col] + " ");
		}
		System.out.println();
		
		System.out.println("---------------------------------");
//		Create a 2D array of integer type where you will 
//		store odd and even numbers in 3 rows and 4 columns. 
//		Develop a program which will identify/print the even numbers only
		
		int[][] num = {
				{1,2,3,4},
				{11,12,13,14},
				{20,21,22,23}
		};
		for(int row = 0; row < num.length; row++) {
			for(int col = 0; col < num[row].length; col++) {
				if(num[row][col] % 2 == 0) { 
					System.out.println(num[row][col] + " ");}
				}
		}
		System.out.println();
		
		
		
		
		
		
	}

}
