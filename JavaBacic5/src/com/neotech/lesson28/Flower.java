package com.neotech.lesson28;

public abstract class Flower {
	String type;
	
	public Flower(String type) {
		this.type = type;
	}

	public abstract void bloom();
}

class Rose extends Flower{

	public Rose(String type) { //cannot have 2 public classes in 1 file
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type + " blooms in Summer!");
	}  
	
}

class Tulip extends Flower {

	public Tulip(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bloom() {
		System.out.println(type + " blooms in Spring!");
		
	}
	
}
class Sunflower extends Flower {

	public Sunflower(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type + " blooms in Fall!");
		
	}
	
}