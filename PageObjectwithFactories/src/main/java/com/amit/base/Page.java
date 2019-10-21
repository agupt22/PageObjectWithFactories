package com.amit.base;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amit.pages.actions.TopNavigation;
import com.amit.utilities.ExcelReader;
import com.amit.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Page {
	
	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\TestData.xlsx");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	public static TopNavigation topNav;
	
	
	public static void initConfiguration() {
		if (Constants.browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			
			log.debug("Chrome browser is launching !!");
			
		}else if (Constants.browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new FirefoxDriver();
			log.debug("FireFx browser is launched !!");
			
		}else if (Constants.browser.equals("ie")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\Firefordriver.exe");
			driver = new InternetExplorerDriver();
			log.debug("IE browser is launched !!");
			
		}
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implictwait, TimeUnit.SECONDS);
		
		topNav = new TopNavigation(driver);
		
	}
	
	//Common Keywords
		public static void click(WebElement element) {

			element.click();
			log.debug("Clicking on Element : " +element);
			test.log(LogStatus.INFO, "Clicking on : " +element);
		}

		public static  void type(WebElement element, String value) {

			element.sendKeys(value);
			log.debug("Clicking on Element : " +element+ "entered value in as : " +value);
			test.log(LogStatus.INFO, "Typing in : " +element+ "entered value in as : " +value);
		}
	
	//Quit Browser
	public static void quitBrowser() { 
		driver.quit();
	}
	
}
