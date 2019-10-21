package com.amit.rough;

import com.amit.base.Page;
import com.amit.pages.actions.SigninPage;

public class SignInTest {

	public static void main(String[] args) {


		Page.initConfiguration();
		
	SigninPage signin = Page.topNav.goToSignin();
	signin.doLogin("amitgupta90@gmail.com", "123456779");
	Page.quitBrowser();
		
		
		

	}

}
