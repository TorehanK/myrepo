package com.neotech.review04;

public class Maxin2DArray {

	public static void main(String[] args) {

		int [][] b = {
				{ -2,3,5},
				{2,4,7},
				{8,1,-9},
				{3,5,1} };
		
		int biggest = b[0][0]; // We dont start with zero, numbers may be negative
		
		for (int row = 0; row < b.length; row++) {
			
			for(int col = 0; col < b[row].length; col++) {
				int element = b[row][col];
				
				if(element > biggest) {
					//I found a bigger element
					//I have the biggest
					biggest=element;
				}
			}
		}
		System.out.println("The biggest number is ---> " + biggest);
	
	
	int max = b[0][0];
	
	for(int[] row : b) {
		for(int element : row) {
			if(element>max) {
				//I found a bigger element
				//I have to update the max
				max=element;
			}
			//I found a bigger element
			//I have to update the max
			
		}
		
	}
	System.out.println("The biggest number is ---> " + max);
	System.out.println("-------------------------------------");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
