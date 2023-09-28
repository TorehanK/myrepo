package com.neotech.lesson09;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class abc extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.xpath("//*[@id=\"search-input\"]/input")).sendKeys("Salak Ergin");
		
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/yt-icon-shape/icon-shape/div")).click();
		
		Thread.sleep(10000);
		
		
		
		
		
		tearDown();
	}
	
}
