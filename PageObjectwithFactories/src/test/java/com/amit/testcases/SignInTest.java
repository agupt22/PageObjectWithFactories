package com.amit.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amit.base.Page;
import com.amit.pages.actions.SigninPage;
import com.amit.utilities.Utilities;
import com.mysql.cj.jdbc.Driver;

public class SignInTest {

	
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void signInTest(Hashtable<String, String> data) {
		
		if (data.get("runmode").equalsIgnoreCase("N")) {
			
			throw new SkipException("Skipping the test as run mode is NO ");
		}
			
			Page.initConfiguration();
			SigninPage signin = Page.topNav.goToSignin();
			signin.doLogin(data.get("username"), data.get("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		if (Page.driver != null) {
			Page.quitBrowser();	
		}
		 
	}


}
