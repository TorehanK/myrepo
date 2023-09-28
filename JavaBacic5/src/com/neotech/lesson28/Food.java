package com.neotech.lesson28;

public class Food {
	
	String foodType;
	String ingredients;
	int calories;
	
	
	Food(String foodType, String ingredients, int calories){
		this.foodType = foodType;
		this.ingredients = ingredients;
		this.calories = calories;
	}
//	void displayInfo() { I did this(TOREHAN)
//		
//		
//		System.out.println("The foods name is: " + foodType + " and the ingredient " + ingredients);
//	}

}
class MexicanFood extends Food{

	MexicanFood(String foodType, String ingredients, int calories) {
		super(foodType, ingredients, calories);
	}	
}
class RussianFood extends Food{

	RussianFood(String foodType, String ingredients, int calories) {
		super(foodType, ingredients, calories);
	}
	
}