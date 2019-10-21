package com.amit.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amit.base.Page;
import com.amit.pages.locators.SigninPageLocator;

public class SigninPage extends Page{
	
	SigninPageLocator signinPage;
	
	public SigninPage() {
		
		this.signinPage = new SigninPageLocator();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signinPage);
	
	}
	
	
	public void doLogin(String username, String password) {
		
		type(signinPage.userName,username);
		type(signinPage.password,password);
		//signinPage.keepmesignedincheckbox
		click(signinPage.signinbtn);
		
	}

}
