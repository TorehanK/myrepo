package com.neotech.lesson15;

public class Methods {

	void bigNum (int a, int b) {
		if(a>b) {
			System.out.println(a);
			}
		else if(b>a) {
			System.out.println(b);
		}else {
			System.out.println("Numbers are equal");
		}
			
	}
	void evenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num + " is even!");
		}else {
			System.out.println(num + " is odd!");
		}
	}
	
	void sayHello(String country) {
		switch(country) {
		case "US","United States":
			System.out.println("Hello!");
			break;
		case "Turkiye":
			System.out.println("Merhaba!");
			break;
		case "Albania":
			System.out.println("Pershendetje!");
			break;
		case "Mexico":
			System.out.println("Ola!");
			break;
			
			default:
				System.out.println("I don't know how to say hello in " + country);
			
			
		}
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		Methods met1 = new Methods();
		met1.bigNum(223, 222);
		
		met1.sayHello("Turkiye");
		met1.sayHello("US");
		met1.sayHello("Mexico");
		met1.sayHello("Albania");
		met1.sayHello("Chinese");
		met1.sayHello("United States");
	}
	
	
	
	
	
	
	
	
	
}
