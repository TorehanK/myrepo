package com.neotech.interview01;

import java.util.Arrays;

public class IQ7 {

	public static void main(String[] args) {
		
//		Write a java program to find the second largest number in the array? 
//		Maximum and minimum number in the array?
		
		
		int array[] = {200, 22, 1,999,80,155,169,2};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println(array[array.length-2]);
		
		
		
		
		
		
	}
}
