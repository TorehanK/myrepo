package com.neotech.lesson24;

public class WebDriverTest {
	
	//Runtime polymorphism
	//Method overriding
	//The driver will open the browser depending on the object that has been created
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.openBrowser();
		
		ChromeDriver cd = new ChromeDriver();
		cd.openBrowser();
		//Go to facebook
		//Enter username
		//Enter password
		//Click on the login button
		
	
	}

}
