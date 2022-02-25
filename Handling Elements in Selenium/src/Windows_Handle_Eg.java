import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handle_Eg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(" //span[normalize-space()='Learn more']")).click();
		
		
Set<String> win=driver.getWindowHandles();

System.out.println(win.size());

Iterator<String> it = win.iterator();


String window1=it.next();
String window2=it.next();

System.out.println(window1);

System.out.println(window2);


driver.switchTo().window(window2);

driver.findElement(By.xpath(" //span[normalize-space()='Learn more']")).click();


	}

}
