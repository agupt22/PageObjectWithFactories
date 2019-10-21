package com.amit.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	//locators for flight tab click
	@FindBy(xpath = "//button[@data-section-id = '#section-flight-tab-hp']")
	public WebElement flightTab;
	
	
	
	
	//Locators for flight booking
	@FindBy(xpath = "//label[@id='flight-type-roundtrip-label-hp-flight']")
	public WebElement returnbtn;
	
	
	@FindBy(xpath = "//input[@id = 'flight-origin-hp-flight']")
	public WebElement from;
	
	@FindBy(xpath = "//input[@id = 'flight-destination-hp-flight']")
	public WebElement to;
	
	@FindBy(xpath = "//input[@id = 'flight-departing-hp-flight']")
	public WebElement departingdate;
	
	@FindBy(xpath = "//input[@id = 'flight-returning-hp-flight']")
	public WebElement returningdate;
	
//	@FindBy(xpath = "//li[@class='open']//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")
//	public WebElement travellers;
//	
//
//	@FindBy(xpath = "//body[@class='wrap cf aoa-enabled']/meso-native-marquee/section[@id='WizardHero']/div[@id='hero-banner']/div[@class='hero-banner-gradient native-marquee']/div[@class='cols-row hero-banner-inner']/section[@id='wizardSection']/div[@class='hero-banner-box siteId-27 cf hideClassicDcol']/div[@id='wizard-tabs']/div[@class='tabs-container col']/section[@id='section-flight-tab-hp']/form[@id='gcw-flights-form-hp-flight']/fieldset[@class='room-data']/div[@class='cols-nested']/div[@class='ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both']/div[@id='traveler-selector-hp-flight']/div[@class='menu-bar gcw-travel-selector-wrapper']/ul[@class='menu-bar-inner']/li[@class='open']/div[@class='menu sticky gcw-menu']/div[@class='menu-main']/div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']/div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']/div[@class='uitk-col all-col-shrink']/button[@class='uitk-step-input-button uitk-step-input-plus']/span[@class='uitk-icon']/*[1]")
//	public WebElement adults;
//	
//	
//	@FindBy(xpath = "//div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']//div[@class='children-wrapper']//button[@class='uitk-step-input-button uitk-step-input-plus']//*[@class='uitk-icon-svg uitk-step-input-icon']")
//	public WebElement childern;
//	
//	@FindBy(xpath = "//div[@class='cols-nested children-data gcw-toggles-fields available-for-flights']//select[@id='flight-age-select-1-hp-flight']")
//	public WebElement agebtn;
//	
//	@FindBy(xpath = "//li[@class='open']//button[@class='close btn-text']")
//	public WebElement closebtn;
	
	@FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	public WebElement searchbtn;
	
	
	
	@FindBy(xpath="//li[@role= 'presentation']")
	public List<WebElement> tabCount;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
