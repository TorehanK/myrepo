package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Para {
	
	public static String url = "https://www.tomorrowland.com/en/festival/tickets";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.className("goto-button")).click();
		
		
		
		
		
		
		
	}

}
