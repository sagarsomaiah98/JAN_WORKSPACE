package com.sauce.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

public class AddToCartTest extends TestBase {
	
	@Test
	public void addTocartTest() throws IOException, InterruptedException
	
	{
       intialize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		boolean actual =driver.findElement(By.xpath("//button[@id='checkout']")).isDisplayed();
		
		assertEquals(actual, true);
		
		TestUtil.Screenshot();
		driver.quit();
	}

}
