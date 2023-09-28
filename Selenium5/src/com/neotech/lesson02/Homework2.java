package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	
	public static void main(String[] args) throws InterruptedException {
		
//		HW2: Opening Page on Firefox Browser
//		Open Firefox browser
//		Navigate to “https://www.redfin.com/”
//		Verify that you have navigated to (https://www.redfin.com/)
//		End the Session (close the browser).

		System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");
		
		// Open the Firefox browser
		WebDriver driver = new FirefoxDriver();
		
		
		//driver.get("https://www.redfin.com/");
		String url = "https://www.redfin.com"; //--look at end-- we need final / at end of url to match!, thats why its saying fail
		
		// navigate to the url
		driver.get(url);
		
		Thread.sleep(1000); //one second
		
		//get the current url of the page
		String currentUrl = driver.getCurrentUrl();
		
		if(url.equals(currentUrl)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
			System.out.println("Current url: " + currentUrl);
			System.out.println("Expected url: " + url);
		}
		
		Thread.sleep(500);
		
		driver.quit();	
		
	}

}
