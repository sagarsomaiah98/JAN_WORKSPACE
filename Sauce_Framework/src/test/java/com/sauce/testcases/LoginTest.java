package com.sauce.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends TestBase {
	
	
	@Test
	public void login() throws InterruptedException, IOException {
		intialize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		
	boolean actual=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
	
	assertEquals(actual, true);
	
	TestUtil.Screenshot();
		driver.quit();
		
	}

}
