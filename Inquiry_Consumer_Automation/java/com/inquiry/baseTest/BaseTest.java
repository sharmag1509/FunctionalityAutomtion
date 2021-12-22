package com.inquiry.baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.inquiry.logger.Log4J;

//This class is a super class for all the test class present in test package
public class BaseTest {


	protected static WebDriver driver;
	protected static Logger log = Log4J.initLog4j(BaseTest.class);
	protected void initDriver() {
		this.launchBrowser("Chrome");
	}
 
	private WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			log.info("Firfoox browser is selected to execute test cases");
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\geckodriver.exe");
			log.info("Firefox setProperty path is exected.");
			driver = new FirefoxDriver();
			log.info("Firfoox driver object is created");
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			log.info("Chrome browser is selected to execute test cases");
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
			log.info("Chrome setProperty path is exected.");
			driver = new ChromeDriver();
			log.info("Chrome driver object is created");
		}
		this.openApplication();
		return driver;
	}

	public  void openApplication() {
		driver.manage().window().maximize();
		driver.get("https:hub.crifhighmark.com/Inquiry/Inquiry/WebPortal.action");
//		driver.get("http://192.168.1.85/Inquiry/Inquiry/WebPortal.action");
		
	//	driver.get("http://10.10.10.66:9903/Inquiry/Inquiry/WebPortal.action");
	//	driver.get("http://192.168.1.85/Inquiry/Inquiry/WebPortal.action");
		log.info("Application is launched.");
	}

	public static XSSFSheet readCompanyData(String filePath, int sheetIndex) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(filePath);
			log.info("inputStream object is created");
		} catch (FileNotFoundException e) {
			log.error("TestData file not found");
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(inputStream);
			log.info("Workbook object is created");
		} catch (IOException e) {
			log.error("IO exception has occured");
		}
		XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(sheetIndex);
		log.info("Data sheet is found");
		return sheet;
	}
}
