package com.neotech.review08_Polymorphism;

public class Albanian extends Human {

	public Albanian() {
		// super(); ---> happens by default

	}

	public Albanian(String name) {
		super(name);

	}

	@Override // decorator - good practice
	public void talk() {
		System.out.println("Une flas shqip. Une quhem " + name);
	}

	public void albanianDance() {
		System.out.println("Dancing Valle Kosovare!");
	}
}
