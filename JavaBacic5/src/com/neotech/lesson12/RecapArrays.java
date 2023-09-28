package com.neotech.lesson12;

public class RecapArrays {

	public static void main(String[] args) {

		//Array, container for storing 
		
		//int grade1, grade2, grade3, grade150;
		//data type, identifier, initialization---------- un and down are same
		//int[] grades;
		int[] grades = new int[5]; //-------- with initialization
		System.out.println("The size of the array is --> " + grades.length);
		System.out.println("Grade with index 2 is --> " +grades[2]);
		
		
		//grades          0     1    2    3      4
		//                [0,   0,   0,   0,     0]  
		
		grades[3] = 85; //assigning value 85 to the 3rd or 4th element
		//grades          0     1    2    3      4
		//                [0,   0,   0,   85,     0]  
		System.out.println(grades[3]);
		
		grades[1] = 90;
		//grade 0  1  2  3  4
		//     [0, 90,0, 0, 0]
		
		grades[2] = 100; //run time error --- only 0,1,2,3,4 cause we said till 5
		//grades[2] = "three"; //compile-time error
		
		grades[4] = 98;
		
		
		grades[0] = 93;
		//grade 0   1    2     3    4
		//      93, 90,  100,  85,  98]
		
		grades[0] = 95; //re-assigning a value to the first element (element at index 0)
		
		System.out.println("The size of the array is --> " + grades.length);
		System.out.println("Grade with index 2 is --> " +grades[2]);
		
				
		System.out.println("--------------Find the average of the grades------------");
		
		
		//1st way
		int total = grades[0]+grades[1]+grades[2]+grades[3]+grades[4];
		System.out.println("The total is: " + total);
		
		int average = total/5;
		System.out.println("The average is: " + average);
		
		System.out.println("---------------");
		
		//2nd way---for loop
		
		int sum = 0;
		for(int i = 0; i < grades.length; i++)
		{
			sum+=grades[i]; //sum = sum + grades[i];
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + (sum/grades.length));
		
		System.out.println("----------------------------");
		
		
		String[] cities = {"Tirana", "Ankara", "Paris", "Rome" , "Berlin" , "Oslo"}; 
		//what is the size of the array?
		System.out.println("The length is: " + cities.length);
		
		//how can I pring last city
		int length = cities.length; // no need for this because of the code [cities.length-1] below
		System.out.println("The last city an the array is: " + cities[cities.length-1]);
		
		
		System.out.println("--------------------------------------------");
		//how to print all the cities
		
		for(int i = 0; i < length; i++)
		{
			System.out.println(cities[i]);
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Lets print the cities in the reverse order");
		
		for(int i = cities.length-1; i >= 0; i--)
		{
			System.out.println(cities[i]);
		}
		
		
		//cities[6] = "Berlin"; //cannot work even if size is fixed, need to write new code to change length
		
		
		
		
		
		
		
		
		
		
	}

}
