package com.amit.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageLocators {
	
	@FindBy(xpath = "//input[@id = 'gss-signup-first-name']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id = 'gss-signup-last-name']")
	public WebElement surName;
	
	@FindBy(xpath = "//input[@id = 'gss-signup-email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id = 'gss-signup-password']")
	public WebElement password;
	
	
	@FindBy(xpath = "//input[@id = 'gss-signup-join-program-check']")
	public WebElement joinCheckBox;
	
	@FindBy(xpath = "//button[@id = 'gss-signup-submit']")
	public WebElement signupBtn;
	
	

}
