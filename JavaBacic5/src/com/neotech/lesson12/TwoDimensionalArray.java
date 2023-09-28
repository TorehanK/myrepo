package com.neotech.lesson12;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[] [] numbers = new int[2][4]; //first[column],second[row]
		
		numbers[0][0] = 10; //row0 element0 so, top left corner
		numbers[0][1] = 15;
		numbers[0][2] = 20;
		numbers[0][3] = 25;
		
		//2nd row, row with index 1
		numbers[1][0] = 33;
		numbers[1][1] = 36;
		numbers[1][2] = 39;
		numbers[1][3] = 42;
		
		System.out.println("How can I print 39?");
		System.out.println(numbers[1][2]);
		
		System.out.println("What about 25?");
		System.out.println(numbers[0][3]);
		
		int [][] nums =
			{
					{3,6,9,12},
					{5,10,15,20},   //one row is a 1 dimensional array 
					{18,19,27,36}
			};
		System.out.println("How can I print 36?");
		System.out.println(nums[2][3]);
		
		
		//no row with index3, error
		//System.out.println(nums[3][0]);
		
		
		//reassign
		nums[2][3] = 39;
		
	}

}
