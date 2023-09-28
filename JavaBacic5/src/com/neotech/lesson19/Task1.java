package com.neotech.lesson19;


public class Task1 {
	
	
	protected int sum (int[] x)
	{
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Task1 z = new Task1();
		 
		int[] x = {55,22,11};
		int sum = z.sum(x);
		System.out.println(sum);
	}
	

	
	
	
	
}
