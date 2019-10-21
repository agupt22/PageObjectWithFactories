package com.amit.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amit.base.Page;
import com.amit.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	
	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver) {
		 
		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
	}
	
	public SigninPage goToSignin() {
		
		Page.click(topNavigation.accountbtn);
		Page.click(topNavigation.signinbtn);
		
		return new SigninPage();
		
		
	}
	
	public void goToCreateAccount() {
		
		
	}
	
	
	public void goToList() {
		
	}
	
	
	public void goToSupport() {
		
	}
	
	public void goToHome() {
		
	}
	
	public void goToFilghts() {
		
	}

}
