package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class JSExecutorDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		https://hrm.neotechacademy.com
		setUp();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		wait(2);
		
		
		//Create a JavascriptExecutor object
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.backgroundColor='blue';"
				+"arguments[1].style.backgroundColor='red';", username, password);
		
		wait(5);
		
		js.executeScript("arguments[0].click()",
				driver.findElement(By.xpath("button[@type='submit']")));
		
		
		
		
		
		tearDown();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
