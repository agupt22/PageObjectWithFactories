package com.amit.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocator {
	
	@FindBy(xpath = "//input[@id='gss-signin-email']")
	public WebElement userName;


	@FindBy(xpath = "//input[@id='gss-signin-password']")
	public WebElement password;
	

	@FindBy(xpath = "//input[@id='gss-keep-signin-check']")
	public WebElement keepmesignedincheckbox;
	

	@FindBy(xpath = "//button[@id='gss-signin-submit']")
	public WebElement signinbtn;
}
