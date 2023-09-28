package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {

		//funny way
		
		int a = 4;
		int b = 2;
		int c = 3;
		int d = 5;
		
		int sum = a+b+c+d;
		System.out.println("The sum is --> " + sum);
		
		//1st serious way
		
		int[] array = new int[4]; //cannot change the number of array, 4 elements(0,1,2,3)
		array[2] = 3;
		array[1] = 2;
		array[0] = 4;
		array[3] = 5;
		
		int sumArray = 0;
		for(int i = 0; i < array.length; i++) {
			sumArray = sumArray + array[i];  //sumArray+=array[i];   same
		}
		System.out.println("The sum of the array is --> " + sumArray);
		
		//2nd way
		
		//for(element:array){}   -----> all in array formula
		
		int[] array2 = {4,2,3,5};
		int sumArray2 = 0;
		
		for(int num : array2) {
			sumArray2 += num;
			
			}
		System.out.println("The sum of the array is --> " + sumArray2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
