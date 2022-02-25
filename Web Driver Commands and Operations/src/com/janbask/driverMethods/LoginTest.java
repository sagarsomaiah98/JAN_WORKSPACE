package com.janbask.driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	String title=	driver.findElement(By.xpath("//span[@class='title'] ")).getText();
	
	
	System.out.println(title);
		
		driver.close();

	}

}
