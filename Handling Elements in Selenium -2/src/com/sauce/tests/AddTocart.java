package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocart {
	
	
	public void addTocart() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath(" //a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
	boolean flag=	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed();
	
	if(flag)
		System.out.println("Landed on cart page");
	else
		System.out.println("Failed to land on cart page");
	
	driver.quit();
		
		
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AddTocart a = new AddTocart();
		a.addTocart();
	}

}
