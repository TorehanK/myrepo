package com.neotech.review05;

public class Methods {

	void sayWelcome() { // No parameters
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayWelcomeWithNumber(int n) { // Int parameter-number
		for (int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}

	void sayGreeting(String greeting) { // String parameter
		for (int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();

	}

	void sayGreetingWithNumber(String greeting, int x) { // Both String and Int-Number Parameter
		for (int i = 1; i <= x; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}

	void methodWithFourParameters(String name, int age, String lastName, String nationality) {
		System.out.println("My name is " + name + " " + lastName);
		System.out.println("My age is " + age);
		System.out.println("My nationality is " + nationality);

	}

	public static void main(String[] args) {
		Methods m = new Methods();
		m.sayWelcome();
		System.out.println("-------------------------");
		m.sayWelcomeWithNumber(3);
		System.out.println("-------------------------");
		m.sayWelcomeWithNumber(8);
		System.out.println("-------------------------");
		m.sayGreeting("Hola");
		System.out.println("-------------------------");
		m.sayGreeting("Salut");
		System.out.println("-------------------------");
		m.sayGreetingWithNumber("Merhaba", 5);

		System.out.println("-------------------------");
		m.methodWithFourParameters("Huseyin", 25, "Bird", "American");

	}

}
