package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Mavenfirstoct30.Baseclass;

public class Adactin_runner_for_register extends Baseclass {
public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=browser();
		maximize();
		get("https://www.google.com/");
		get("https://adactinhotelapp.com/");
		WebElement new_User_RegisterHere  = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		clickOnElement(new_User_RegisterHere);
		
		WebElement username = driver.findElement(By.id("username"));
		inputValue(username, "BALAJI");
		
		WebElement password = driver.findElement(By.id("password"));
		inputValue(password, "7904547505");
		
		
		WebElement ReEnter_password = driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
		inputValue(ReEnter_password, "7904547505");
		
		WebElement Fullname = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		inputValue(Fullname, "BALAJI D S");
		
		WebElement Emailaddress= driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		inputValue(Emailaddress, "balajigowri95@gmail.com");
		
		
	}
}
