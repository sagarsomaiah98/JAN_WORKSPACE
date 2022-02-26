import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test
	public void login() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		String actual=null;
		actual=driver.findElement(By.xpath("//b[normalize-space()='Leave']")).getText();
		
		System.out.println(actual);
		
		assertEquals(actual, "Leave");
		
		System.out.println("end of the test");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
