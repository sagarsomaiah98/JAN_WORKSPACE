package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		try 
		{
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Success");
		}
		catch(Exception e) 
		{
		
			//System.out.println("product element not found");
			
			System.out.println("Login Failed");
		}
		
		
		System.out.println("Test case completed");
		
		
		driver.quit();
		

	}

}
