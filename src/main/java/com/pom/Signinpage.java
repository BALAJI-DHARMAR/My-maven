package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
	// mail id

	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement mailid;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement Submitbutton;

	

	public Signinpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitbutton() {
		return Submitbutton;
	}
}
