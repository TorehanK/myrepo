package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Torehan");
		driver.findElement(By.name("lastName")).sendKeys("Kahya");
		driver.findElement(By.name("phone")).sendKeys("6316123166");
		driver.findElement(By.name("userName")).sendKeys("torehankahya@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}
	
}
