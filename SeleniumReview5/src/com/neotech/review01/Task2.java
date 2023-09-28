package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Torehan");
		driver.findElement(By.id("userEmail")).sendKeys("torehankahya@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("603 herzel");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
	}
}
