package com.amit.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.amit.base.Page;
import com.amit.pages.actions.CreateAccountPage;
import com.amit.pages.actions.SigninPage;
import com.amit.utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {
		
		if (data.get("runmode").equalsIgnoreCase("N")) {
			
			throw new SkipException("Skipping the test as run mode is NO ");
		}
			
			Page.initConfiguration();
			CreateAccountPage createAccount = Page.topNav.goToCreateAccount();
			createAccount.createAccount(data.get("firstname"), data.get("surname"), data.get("email"), data.get("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		if (Page.driver != null) {
			Page.quitBrowser();	
		}
		 
	}

}
