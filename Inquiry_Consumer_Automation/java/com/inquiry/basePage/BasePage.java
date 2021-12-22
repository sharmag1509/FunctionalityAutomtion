package com.inquiry.basePage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inquiry.logger.Log4J;

/* This class is superclass for all the page and test class.It contains all the common method which can be called as per requirement*/

public class BasePage {

	public WebDriver driver;
	WebDriverWait wait;
	protected static Logger log;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		log = Log4J.initLog4j(BasePage.class);
	}

	public void waitForElementToBeVisible(By ele) {
		wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	}

	public void waitForElementToBeClickable(By ele) {
		wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void waitForTextToBePrresent(By ele, String text) {
		wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.textToBe(ele, text));
	}

	public String returnCurrentPageTitle() {
		return driver.getTitle();
	}

	public boolean returnElementDisplayed(By ele) {
		return driver.findElement(ele).isDisplayed();
	}

	public static void pause() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			log.info("InterruptedException has occured.");
		}	
	}

	public void elementToHighlightRed(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 3.5px solid Red;');", element);
	}
	
	public void elementToHighlightGreen(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 2.5px solid Green;');", element);
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("window.scrollBy(0,500)");
	}
	
	public void scrolluP() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("window.scrollBy(500,0)");
	}
		
}

