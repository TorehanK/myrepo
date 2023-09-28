package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {

//		HW1: Amazon Page Title Verification: 
//			Open chrome browser
//			Go to “https://www.amazon.com/”
//			Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//			End the Session (close the browser).
		
		//locate the Chrome driver
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed";
		String actualTitle = driver.getTitle();
		
		System.out.println("Actual title -->" + actualTitle);
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
