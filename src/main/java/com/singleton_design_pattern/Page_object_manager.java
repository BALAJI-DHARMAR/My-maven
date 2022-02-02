package com.singleton_design_pattern;

import org.openqa.selenium.WebDriver;

import com.pom.Purchase_details;
import com.pom.Signinpage;
import com.pom.Womendress;

public class Page_object_manager {
    public static WebDriver driver;
	private Signinpage s;
	private Womendress w;
	private Purchase_details p;

	public Page_object_manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Signinpage getInstanceSigninpage() {
		s = new Signinpage(driver);
		return s;
	}

	public Womendress getInstanceWomendress() {
		 w = new Womendress(driver);
		 return w;
	}
	public Purchase_details getInstancePurchase_details () {
		p = new Purchase_details(driver);
		return p;
		
	}
	
	

}