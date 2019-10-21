package com.amit.testcases;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amit.base.Page;
import com.amit.errorcollectors.ErrorCollector;
import com.amit.pages.actions.HomePage;
import com.amit.utilities.Utilities;

public class FLightSearchTest {

	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void flightSearchTest(Hashtable<String, String> data) {

		if (data.get("runmode").equalsIgnoreCase("N")) {

			throw new SkipException("Skipping the test as run mode is NO ");
		}

		Page.initConfiguration();
		HomePage homePage = new HomePage();
		ErrorCollector.verifyEquals(homePage.findTabCount(), 5);
		
		homePage.goToFilghts().bookAFlight(data.get("fromcity"), data.get("tocity"),data.get("departing"), data.get("returning"));

	}

	@AfterMethod
	public void tearDown() {
		if (Page.driver != null) {
			Page.quitBrowser();
		}

	}

}
