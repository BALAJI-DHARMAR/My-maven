package com.pom; // driver.findelements

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase_details {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed2;

	@FindBy(name = "processAddress")
	private WebElement proceed3;

	@FindBy(id = "cgv")
	private WebElement agreebutton;

	@FindBy(name = "processCarrier")
	private WebElement proceed4;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement paybycheck;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirmorder;

	public Purchase_details(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getAgreebutton() {
		return agreebutton;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getPaybycheck() {
		return paybycheck;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

}
