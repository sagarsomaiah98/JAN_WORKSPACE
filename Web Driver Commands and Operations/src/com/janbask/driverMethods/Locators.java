package com.janbask.driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
      // driver.findElement(By.id("user-name")).sendKeys("standard_user");
       driver.findElement(By.cssSelector("#user-name")).sendKeys("Standarduser");
       
       Thread.sleep(2000);
       
       driver.findElement(By.cssSelector("#user-name")).clear();
	}

}
