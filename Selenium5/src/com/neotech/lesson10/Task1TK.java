package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task1TK extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

//		1) Open chrome browser
//	2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//	3) Login to the application
//	4) Verify customer "Susan McLaren" is present in the table
//	5) Click on customer details
//	6) Update customers last name and credit card info
//	7) Verify updated customers name and credit card number is displayed in table
//	8) Close browser

		setUp();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");

		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");

		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

		Thread.sleep(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();

			if (rowText.contains("Susan McLaren")) {
				System.out.println("Susan Mclaren is in the text!");

			}

		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")).sendKeys("Susan Kahya");
		
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]")).sendKeys("6316126166454");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]")).click();
		
		Thread.sleep(2000);

		tearDown();
	}

}
