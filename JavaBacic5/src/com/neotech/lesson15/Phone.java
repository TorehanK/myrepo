package com.neotech.lesson15;

public class Phone {
	
	String model, color;
	int batteryLife;
	
	
	void charge(){
		System.out.println(model + " is the color " + color);
	}
	void batteryLife(){
		System.out.println(model + " is at " + batteryLife + " % of charge");
	}
	
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		phone1.batteryLife = 89;
		phone1.model = "Iphone";
		phone1.color = "Red";
		
		phone2.batteryLife = 11;
		phone2.model = "Android";
		phone2.color = "Blue";
		
		phone3.batteryLife = 55;
		phone3.model = "Nokia";
		phone3.color = "Green";
		
		
		phone1.charge();
		phone2.charge();
		phone3.charge();
		
		System.out.println("----------------");
		
		phone1.batteryLife();
		phone2.batteryLife();
		phone3.batteryLife();
		
		
		
		
		
		
		
	}

}
