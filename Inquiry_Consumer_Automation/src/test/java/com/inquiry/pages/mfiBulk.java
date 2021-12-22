package com.inquiry.pages;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.inquiry.basePage.BasePage;

public class mfiBulk extends BasePage{

	public mfiBulk(WebDriver driver) {
		super(driver);

	}

	private By choseFileToOepn=By.xpath("");

			
		public void choseFileToOepn() {
			super.waitForElementToBeClickable(choseFileToOepn);
			driver.findElement(choseFileToOepn).click();
		}

}

