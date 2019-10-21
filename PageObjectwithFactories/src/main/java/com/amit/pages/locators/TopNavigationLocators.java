package com.amit.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(xpath = "//button[@id='header-account-menu']")
	public WebElement accountbtn;
	
	
	@FindBy(xpath = "//a[@id='account-signin']")
	public WebElement signinbtn;
	

	@FindBy(xpath = "//a[@id='account-register']")
	public WebElement createaccountbtn;
	
}
