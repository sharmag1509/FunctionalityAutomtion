package com.inquiry.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.inquiry.baseTest.BaseTest;
import com.inquiry.pages.LoginPage;

public class LoginTest extends BaseTest{

	LoginPage LoginPage;
	
	@BeforeTest()
	public void launchapplication() {
		super.initDriver();
	}
	
	@Test(priority=2)
	public void enterCredtional() {
		LoginPage = new LoginPage(BaseTest.driver);
		LoginPage.enterUserId();
		LoginPage.enterPassword();
		LoginPage.click_On_LoginButton();
	}
}
