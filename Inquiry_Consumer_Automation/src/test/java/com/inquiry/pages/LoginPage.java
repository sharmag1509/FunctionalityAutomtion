package com.inquiry.pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.inquiry.basePage.BasePage;
import com.inquiry.baseTest.BaseTest;
import com.inquiry.constant.Constants;

public class LoginPage extends BasePage {
	XSSFSheet sheet = BaseTest.readCompanyData(Constants.FILEPATH, 0);

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By userIdtextBox = By.name("username");

	private By psswordtextBox = By.name("password");

	private By clickOnSubmit_button = By.id("WebPortal_0");

	public void enterUserId() {
		super.waitForElementToBeVisible(userIdtextBox);
		super.elementToHighlightGreen(driver, driver.findElement(userIdtextBox));
		driver.findElement(userIdtextBox).sendKeys("inquiryqa@crif.com");//(sheet.getRow(1).getCell(0).getStringCellValue());
		log.info("User name is entered.");
	}

	public void enterPassword() {
		super.waitForElementToBeVisible(psswordtextBox);
		super.elementToHighlightGreen(driver, driver.findElement(psswordtextBox));
		log.info("Password Text box is visible");
		driver.findElement(psswordtextBox).sendKeys("Crif@2016");//(sheet.getRow(1).getCell(1).getStringCellValue());
		log.info("Password is entered.");
	}

	public void click_On_LoginButton() {
		super.waitForElementToBeVisible(clickOnSubmit_button);
		driver.findElement(clickOnSubmit_button).click();
		log.info("Login button clicked");
		
	}
}