




import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_class {
	public static WebDriver driver; // null driver
	 public static void browser() {

		 System.setProperty("webdriver.chrome.driver", System.getProperty("User.dir"+"\\Driver2\\chromedriver.exe"));
			
		  driver = new ChromeDriver();
		//return driver;
		 
	}
	
// 2.	window Maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
//	3.Driver method get
	public static void get(String Url) {
	driver.get(Url);
	}
	
// 4.	sendkeys
	public static void inputValue(WebElement element, String value) {
       element.sendKeys(value);
	}
	
//	5.click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

//	public static void actions(WebElement element) {
//		Actions ac =new Actions(driver);
//		ac.moveToElement(element).build().perform();
//		
//	}

}
