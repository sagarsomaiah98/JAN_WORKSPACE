import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Menu_Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/");
		
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//a[@class='no_border'][contains(text(),'Tester’s Hub')]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Sample Page Test']")).click();

	}

}
