package com.amit.pages.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amit.base.Page;
import com.amit.pages.locators.HomePageLocators;

import bsh.This;

public class HomePage extends Page {
	
	HomePageLocators home ;
	
	public HomePage() {
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
		
	}
	
	public HomePage  goToFilghts() {
		
		click(home.flightTab);
		
		return this;
		
	}

	
	public void goToHotels() {
		
		
	}
	
	public void goToFilghtAndHotels() {
		
	}
	
	public void bookAFlight(String fromcity , String tocity, String departing , String returning) {
		
		click(home.returnbtn);
		type(home.from, fromcity);
		type(home.to,tocity);
		type(home.departingdate,departing);
		type(home.returningdate,returning);
		//home.travellers.click();
		//home.adults.sendKeys(noOfAudlts);
		//home.childern.sendKeys(noOfChildern);
		//home.agebtn.sendKeys(ageofchild);
		//home.closebtn.click();
		click(home.searchbtn);
		
		
	}
	
	
	
public int findTabCount(){
		
		return home.tabCount.size();
	}
	
}