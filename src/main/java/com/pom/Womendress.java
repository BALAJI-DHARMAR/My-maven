package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womendress {
	
public static WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement insidetshirt;

	@FindBy(xpath = "//img[@width='250']")
	private WebElement dressimage;

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement Qucikviewaction;

	@FindBy(xpath = "//iframe[@frameborder='0']")
	private WebElement frame;

	@FindBy(name = "Submit")
	private WebElement addtocard;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement scrollforproceedtocheckout;

	public WebElement getScrollforproceedtocheckout() {
		return scrollforproceedtocheckout;
	}

	public Womendress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getInsidetshirt() {
		return insidetshirt;
	}

	public WebElement getDressimage() {
		return dressimage;
	}

	public WebElement getQucikviewaction() {
		return Qucikviewaction;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	
}
