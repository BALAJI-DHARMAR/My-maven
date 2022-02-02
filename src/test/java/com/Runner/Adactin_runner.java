package com.Runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Mavenfirstoct30.Baseclass;

public class Adactin_runner extends Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browser();

		maximize();
		get("https://www.google.com/");
		get("https://adactinhotelapp.com/");

		WebElement Username = driver.findElement(By.id("username"));
		inputValue(Username, "BALAJIDS");

		WebElement Password = driver.findElement(By.id("password"));
		inputValue(Password, "9866R7");

		WebElement Login = driver.findElement(By.id("login"));
		clickOnElement(Login);

		WebElement Location = driver.findElement(By.id("location"));
		Select s = new Select(Location);
		s.selectByVisibleText("Sydney");

		WebElement Hotels = driver.findElement(By.name("hotels"));
		Select s1 = new Select(Hotels);
		s1.selectByValue("Hotel Creek");

		WebElement Roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(Roomtype);
		s2.selectByVisibleText("Standard");

		WebElement Number_of_Rooms = driver.findElement(By.id("room_nos"));
		Select s5 = new Select(Number_of_Rooms);
		s5.selectByValue("1");

		WebElement Check_In_Date = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));

		inputValue(Check_In_Date, "05/01/2022");

		WebElement Check_out_Date = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		inputValue(Check_In_Date, "06/01/2022");

		WebElement Adults_per_Room = driver.findElement(By.id("adult_room"));
		Select s3 = new Select(Adults_per_Room);
		s3.selectByValue("1");

		WebElement Children_per_Room = driver.findElement(By.id("child_room"));
		Select s4 = new Select(Children_per_Room);
		s4.selectByValue("0");

		WebElement Search = driver.findElement(By.id("Submit"));
		clickOnElement(Search);

		WebElement Check_box = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
		clickOnElement(Check_box);

		WebElement Continue = driver.findElement(By.id("continue"));
		clickOnElement(Continue);

		WebElement FirstName2 = driver.findElement(By.xpath("(//input[@type=\"text\"])[11]"));
		inputValue(FirstName2, "BALAJI");

		WebElement Lastname = driver.findElement(By.xpath("(//input[@type=\"text\"])[12]"));
		inputValue(Lastname, "D S ");
		
		WebElement Billing_Address = driver.findElement(By.id("address"));
		inputValue(Billing_Address, "ABCDEFGH");
		
		
		WebElement Credit_Card_No = driver.findElement(By.xpath("(//input[@type=\"text\"])[13]"));
		inputValue(Credit_Card_No, "1234567891234567");
		
		
		WebElement Credit_card_type = driver.findElement(By.id("cc_type"));
		Select s6=  new Select(Credit_card_type);
		s6.selectByVisibleText("American Express");
		
		
		WebElement Expiry_Date_Month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(Expiry_Date_Month);
		s7.selectByVisibleText("January");
		
		WebElement Expiry_Date_Year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(Expiry_Date_Year);
		s8.selectByVisibleText("2022");
		
		WebElement CVV_Number = driver.findElement(By.xpath("(//input[@type=\"text\"])[14]"));
		inputValue(CVV_Number, "008");
		
		WebElement BookNowButton = driver.findElement(By.xpath("(//input[@type=\"button\"])[1]"));
		clickOnElement(BookNowButton);
		Thread.sleep(5000);
		takescreenshot("C:\\Users\\Admin\\eclipse-workspace\\Mavenfirstoct30\\Screenshots\\adactin_booking.png");
		
		
		WebElement Logout = driver.findElement(By.id("logout"));
		clickOnElement(Logout);
	}
}
