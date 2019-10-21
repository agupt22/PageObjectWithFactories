package com.amit.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.amit.base.Page;
import com.amit.pages.actions.HomePage;

public class FLightSearchTest {

	public static void main(String[] args) {
		
	  Page.initConfiguration();
	  HomePage homePage = new HomePage();
	  homePage.goToFilghts().bookAFlight("Delhi, India (DEL-Indira Gandhi Intl.)", "Jaipur, India (JAI-Sanganer)", "27/10/2019", "27/11/2019");
	  Page.quitBrowser();
	}

}
