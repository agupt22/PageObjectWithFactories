package com.amit.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.amit.base.Page;
import com.amit.pages.locators.CreateAccountPageLocators;
import com.amit.pages.locators.SigninPageLocator;

public class CreateAccountPage extends Page {

	CreateAccountPageLocators createAccount;

	public CreateAccountPage() {

		this.createAccount = new CreateAccountPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.createAccount);

	}

	public void createAccount(String firstname, String surname, String email, String password) {

		type(createAccount.firstName, firstname);
		type(createAccount.surName, surname);
		type(createAccount.email, email);
		type(createAccount.password, password);
		click(createAccount.joinCheckBox);
		click(createAccount.signupBtn);

	}

}
