package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {

		String str = "Hello";
		str.concat(" World!");
		System.out.println(str);
		
		str.toUpperCase();
		System.out.println(str);
		
		// we can do re assigning but not change a string
		
		//str --> was pointing at some String "Hello"
		str = str.concat(" World!");
		System.out.println(str);
		
		//str = str + "All"; ---> now str  is pointing at new String
		
		int a = 10;
		a = 5;
		//did I change 10?? just changed where a is pointing to
		
		String str2 = "Hello"; //actually pointing to the one created earlier
		
	
	
	
	
	}

}
