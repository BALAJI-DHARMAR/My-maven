package com.Mavenfirstoct30;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver; // null driver
public static String stringCellValue;
	public static WebDriver browser() {
// 1. Browser launch
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver2\\chromedriver.exe");
		
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("incognito");
		 driver = new ChromeDriver(cop);
		return driver;

	}

	//2. Close 
	public static void driver_close() {
    driver.close();
	}
	
	//3. Quit
	public static void driver_quit() {
     driver.quit();
	}
	//4.Navigate to
	public static void navigateto(String link) {
       driver.navigate().to(link);
	}
	//5 Navigateback
	public static void navigateback() {
     driver.navigate().back();
	}
	//6.Navigate forward
		public static void navigateforward() {
			driver.navigate().forward();
		}
		//7.Navigatge Refresh 
		public static void driverrefresh() {
			driver.navigate().refresh();
		}
		
		//8. get
		public static void get(String url) {
         driver.get(url);
		}
		//9. Alert
		public static void alert_accept() {
			driver.switchTo().alert().accept();

		}
		// 9.1.AlertDismiss
		public static void alert_dismiss() {
			driver.switchTo().alert().dismiss();
			
		}
		
		//9.2
		public static void alert_sendkeys(String sendkey) {
			driver.switchTo().alert().sendKeys(sendkey);

		}
		//10. Actions
		public static void actions_movetoelment(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();

		}

		//10.1 Actions_click
		public static void actions_click(WebElement element) {
			element.click();

		}
		//10.2 Actions_contextclick
		public static void actions_contextclick(WebElement element) {
			Actions act = new Actions (driver);
			act.contextClick(element).build().perform();
		}
		//10.3 Actions_draganddrop
		public static void actions_draganddrop(WebElement element1, WebElement element2) {
			Actions act = new Actions (driver);
				act.dragAndDrop(element1, element2);
		}
		
		//11.  Frame
		public static void frame(WebElement element) {
			driver.switchTo().frame(element);
		}
		//12. Robot
		public static void robot() throws AWTException {
			
			Robot r = new Robot(); 
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		//13.window handles
		public static void windowhandles() {
			Set<String> windowHandles = driver.getWindowHandles();
			

		}
		
		//14.Dropdown
		
		public static void dropdown(WebElement element, String type, String value) {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("by text")) {
				
				s.selectByVisibleText(value);
				
			}
			else if (type.equalsIgnoreCase("by value")) {
				s.selectByValue(value);
				
			}
			else if (type.equalsIgnoreCase("by index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}
		}
		
		//15.
		public static void checkbox(WebElement element) {
			element.click();

		}
		
		
		
		// 16.Is enable
		public static void isenable(WebElement element) {
			Select s = new Select(element);
	
			 element.isEnabled();
			
		}
		//17. Is Displayed
		public static void isdispalyed(WebElement element) {
			element.isDisplayed();
	}
		
		//18. Is Selected
		public static void isselected(WebElement element) {
			element.isSelected();
			
		}
		
		//19.getoptions
		
		public static void getoptions(WebElement element) {
			Select s = new Select (element);
				List<WebElement> options = s.getOptions();
				System.out.println("Getoptions is"+ options);
				
		}
		
		//20.Get title
		public static void gettitle() {
					driver.getTitle();
					
				
			
				}
		//21.Get currenturl
		public static void getcurrenturl() {
			driver.getCurrentUrl();
			
		}
		//22. Get text
		public static void gettext(WebElement element) {
			element.getText();
			

		}
		// 23.Get attribute
		public static void getattribute(WebElement element, String url ) {
			element.getAttribute(url);
		}
		
		//24.Wait
		public static void implicitywait() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		
		//25. Take screenshot
				public static void takescreenshot(String url) throws IOException {
					TakesScreenshot tk = (TakesScreenshot) driver;
					File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
					File occur = new File(url);
					FileUtils.copyFile(screenshotAs, occur);
				}
				
	 //26.
		public static void javascriptexecutor(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,1000);");
			js.executeScript("arguments[0].scrollintoview;",element);
		}
		//27. sendkeys
		public static void inputValue(WebElement element, String value) {
			element.sendKeys(value);
		}
		//28.
		public static void getfirstselectedoptions(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption);
			
		}
		//29.getallselectedoptions
		public static void getallselectedoptions() {
			Select s = new Select(null);
			s.getAllSelectedOptions();
		}
		//32.
		public static void ismultipule() {
			Select s = new Select(null);
			s.isMultiple();
			
		}
		
		//31.click
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	//32.Radio Button
	public static void radiobuttons(WebElement element) {
		element.click();
	}
	
	// 33. window Maximize
	public static void maximize() {
		driver.manage().window().maximize();
		
	}


//34.
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}


	//35.
	public static void driverclose() {
      driver.close();
	}
		
	//36. 
	public static void driverquite() {
		driver.quit();
		}
	
	
	
	//37.
	public static void navigatebackward() {
		driver.navigate().back();
		
	}
//38.
	public static void alertsendkeys(String send) {
		driver.switchTo().alert().sendKeys(send);
	}
	
	//39.
	public static String particular_data(String path,int row_index,int cell_index) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\Desktop\\datadriven.xlsx");
		FileInputStream i = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(i);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
		 stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		
		
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int a = (int) numericCellValue;
		    stringCellValue = String.valueOf(a);
			System.out.println(a);
		
		
	}
		return stringCellValue;

	
}
}


