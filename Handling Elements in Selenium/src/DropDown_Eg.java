import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Eg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\JAN_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
	     Select sel = new Select(driver.findElement(By.xpath("//select[@name='dropdown']")));
	     
	     Thread.sleep(2000);
	     
	     sel.selectByIndex(3);
	     Thread.sleep(2000);
	     sel.selectByValue("ddqtp");
	     Thread.sleep(2000);
	     
	     sel.selectByVisibleText("Automation Testing");
	}

}
