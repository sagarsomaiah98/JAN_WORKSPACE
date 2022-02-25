package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	
	public void login(String uname, String pwd) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("https://saucedemo.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		LoginTest l= new LoginTest();
		l.login("standard_user","secret_sauce");
		l.login("locked_out_user", "secret_sauce");
		l.login("performance_glitch_user", "secret_sauce");

	}

}
