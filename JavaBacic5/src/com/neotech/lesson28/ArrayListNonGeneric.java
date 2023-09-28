package com.neotech.lesson28;

import java.util.ArrayList;
public class ArrayListNonGeneric {
	
	public static void main(String[] args) {
		
		// Generic
		ArrayList<Double> numbers = new ArrayList<>();
		
		numbers.add(4.5);
		numbers.add(3.2);
		numbers.add(8.6);
		numbers.add(7.1);
//		numbers.add("Billur"); //Compile Error, you can only store Double
//		numbers.add(5); //cannot say 5, only Double so 5.0 can be stored	

		System.out.println(numbers);
		
		//replacing items in ArrayList
		numbers.set(1, 6.7); //I want index 1 which is 3.2 into 6.7
		
		System.out.println(numbers);

//		numbers.set(5, 9.3); ----> index out of bounds, we dont have index 5, we have a total index 2(3 elements inside)
		
		// Remove items from ArrayList
		numbers.remove(0); //removing by index
		System.out.println(numbers);
//		numbers.remove(6.7); 
//		System.out.println(numbers);
		numbers.remove(6.6); //wont give an error but doesn't remove cause we dont have 6.6
		
		//get an element at index 2
//		int el = arr[2]; --> in arrays
		numbers.get(2);
		System.out.println(numbers.get(2));
		
		//for loop
		for(int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();
		
		//for-each loop / Advanced for loop
		// Auto-boxing and Auto-unboxing is done AUTOMATICALLY
		for(Double num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("------------------------------");
		
		//Non-Generic ArrayList
		ArrayList list2 = new ArrayList();
		list2.add(3); // storing an Integer object
		list2.add("Mesut"); // storing String object
		list2.add('$'); // storing a Character object
		list2.add(numbers); // storing an ArrayList object
		
		System.out.println(list2);
		
		System.out.println("------------------");
		//Retrieving all elements from Non-Generic ArrayList
		for(Object el:list2) {
			System.out.println(el);
			
			//We use generic, in interviews they ask nongeneric
		}
	}

}
