package com.Runner;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import com.Mavenfirstoct30.Baseclass;
import com.pom.Purchase_details;
import com.pom.Signinpage;
import com.pom.Womendress;
import com.singleton_design_pattern.Page_object_manager;

public class Test_runner extends Baseclass {
	 public static WebDriver driver;// null driver
	//public static WebDriver driver = browser();

	public static void main(String[] args) throws IOException {
		driver = browser();
		Page_object_manager p = new Page_object_manager(driver);
//		Signinpage s = new Signinpage(driver);
//		Womendress w = new Womendress(driver);
//		Purchase_details p = new Purchase_details(driver);
		implicitywait();
//		driver.get("https://www.google.com/");
		get("https://www.google.com/");
	
//		driver.manage().window().maximize();
		maximize();
//		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		// WebElement mailid = driver.findElement(By.id("email"));
//		mailid.sendKeys("bodibalaji95@gmail.com");
		
	  String username = particular_data("C:\\Users\\Admin\\Desktop\\Test Case For BALAJI D S Mini Project.xlsx", 2,2 );
	  String password = particular_data("C:\\Users\\Admin\\Desktop\\Test Case For BALAJI D S Mini Project.xlsx", 8, 8);
		
		inputValue(p.getInstanceSigninpage().getMailid(), username);
//		
		// WebElement password = driver.findElement(By.id("passwd"));
////		password.sendKeys("7904547505");
		inputValue(p.getInstanceSigninpage().getPassword(), password);
//		
		// WebElement Submitbutton = driver.findElement(By.id("SubmitLogin"));
//		//Submitbutton.click();
		clickOnElement(p.getInstanceSigninpage().getSubmitbutton());
//	      
//         Actions ac =new Actions(driver);
		//WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	
//	    ac.moveToElement(women).build().perform();
		actions_movetoelment(p.getInstanceWomendress().getWomen());
		
		//WebElement insidetshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		// insidetshirt.click();
		clickOnElement(p.getInstanceWomendress().getInsidetshirt());

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700);");

		//WebElement dressimage = driver.findElement(By.xpath("//img[@width='250']"));
		actions_movetoelment(p.getInstanceWomendress().getDressimage());
//		ac.moveToElement(dressimage).build().perform();
		//WebElement Qucikviewaction = driver.findElement(By.xpath("//a[@class='quick-view']"));
		// Qucikviewaction.click();
		clickOnElement(p.getInstanceWomendress().getQucikviewaction());
//		 
		//WebElement frame = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
//        driver.switchTo().frame(frame);
		frame(p.getInstanceWomendress().getFrame());
		//WebElement addtocard = driver.findElement(By.name("Submit"));
////		addtocard.click();
		clickOnElement(p.getInstanceWomendress().getAddtocard());
//		
//		driver.switchTo().defaultContent();
		defaultcontent();
		//WebElement proceedtocheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
//		proceedtocheckout.click();
		clickOnElement(p.getInstanceWomendress().getProceedtocheckout());

		//WebElement scrollforproceedtocheckout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		javascriptexecutor(p.getInstanceWomendress().getScrollforproceedtocheckout());
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000);");
		
		//WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
//		proceed2.click();
		clickOnElement(p.getInstancePurchase_details().getProceed2());
//		
		//WebElement proceed3 = driver.findElement(By.name("processAddress"));
//		proceed3.click();
		clickOnElement(p.getInstancePurchase_details().getProceed3());
//		
		//WebElement agreebutton = driver.findElement(By.id("cgv"));
//		agreebutton.click();
		clickOnElement(p.getInstancePurchase_details().getAgreebutton());
	//	WebElement proceed4 = driver.findElement(By.name("processCarrier"));
//		proceed4.click();
		clickOnElement(p.getInstancePurchase_details().getProceed4());
	//WebElement paybycheck = driver.findElement(By.xpath("//a[@class='cheque']"));
//		paybycheck.click();
		clickOnElement(p.getInstancePurchase_details().getPaybycheck());
//		
		//WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		confirmorder.click();
		clickOnElement(p.getInstancePurchase_details().getConfirmorder());

		takescreenshot("C:\\Users\\Admin\\eclipse-workspace\\Mavenfirstoct30\\Screenshots.confirm.png");
		driver_close();
//		TakesScreenshot screen = (TakesScreenshot) driver;
//		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
//		File occur = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Screenshot\\orderfinished.png");
//		FileUtils.copyFile(screenshotAs, occur);
//	}

	}
}