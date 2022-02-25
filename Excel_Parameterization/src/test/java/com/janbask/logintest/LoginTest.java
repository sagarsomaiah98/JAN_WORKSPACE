package com.janbask.logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.janbask.excelParam.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public void login() throws InterruptedException 
	{
		
		
		 Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\JAN_WORKSPACE\\Excel_Parameterization\\EXCEL_DATA\\SAUCE_LOGIN.xlsx");
         int row_count=  xls.getRowCount("SAUCE");
         
       //  System.out.println(row_count);
         
         for(int i=2;i<=row_count;i++) {
         
       String uname=  xls.getCellData("SAUCE", "USERNAME", i);
       
       String pwd=  xls.getCellData("SAUCE", "PASSWORD", i);
       
       
       
              WebDriverManager.chromedriver().setup(); WebDriver driver = new
 			  ChromeDriver(); driver.manage().window().maximize();
 			  driver.get("https://www.saucedemo.com/");
 			  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
 			  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
 			  Thread.sleep(1000);
 			  driver.findElement(By.xpath("//input[@id='login-button']")).click();
 			  
 			  driver.quit();
       
       
       
       
       System.out.println(uname+" - "+pwd);
         }  
		
	
			
			 
			 
		
	}
	

	public static void main(String[] args) throws InterruptedException {
	LoginTest l = new LoginTest();
	l.login();
	}

}
