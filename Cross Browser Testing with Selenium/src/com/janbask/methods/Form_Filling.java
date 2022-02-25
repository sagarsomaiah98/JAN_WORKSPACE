package com.janbask.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling {
	
	static WebDriver driver;
	
	
	public static String Random_Value()
	{
		 String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
	 		
			int num;
			
			String value = "";
			for( int i=0;i<5;i++) {
			num= (int) (Math.random()*10);
			//System.out.println(num);
			value=alp[num]+value;
			}
			
			return value;
		
	}
	
	
	public static void type(String xpath, String value) 
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);	
		
	}
	
	
	public  void Register() 
	{
      System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		Form_Filling.type("//input[@id='customer.firstName']", "James");
		Form_Filling.type("//input[@id='customer.lastName']", "Ken");
		Form_Filling.type("//input[@id='customer.address.street'] ", "21 baker street ");
		Form_Filling.type("//input[@id='customer.address.city'] ", " New york");
		Form_Filling.type("//input[@id='customer.address.state'] ", "US ");
		Form_Filling.type(" //input[@id='customer.address.zipCode']", "5126 ");
		Form_Filling.type(" //input[@id='customer.phoneNumber']", "041265469 ");
		Form_Filling.type(" //input[@id='customer.ssn']", "56899 ");
		Form_Filling.type(" //input[@id='customer.username']", Random_Value());
		Form_Filling.type("//input[@id='customer.password']", "James12345");
		Form_Filling.type(" //input[@id='repeatedPassword']", "James12345");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	String uname=	driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println(uname);
		
		driver.close();
		
	}
	

	public static void main(String[] args) {
		Form_Filling f= new Form_Filling();
		
		f.Register();

		
		
	}

}
