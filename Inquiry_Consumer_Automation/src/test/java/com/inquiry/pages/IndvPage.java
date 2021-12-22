package com.inquiry.pages;

import java.text.SimpleDateFormat;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.inquiry.basePage.BasePage;
import com.inquiry.baseTest.BaseTest;
import com.inquiry.constant.Constants;

public class IndvPage extends BasePage {

	public IndvPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	XSSFSheet sheet = BaseTest.readCompanyData(Constants.FILEPATH, 3);

	// consumer xpath of text Box

	private By clickIndvProduct = By.xpath("//*[@id='menutd']/ul/li[5]/a");

	private By clickOnSingleRequestLink = By.xpath("//*[@id='menutd']/ul/li[5]/ul/li[1]");

	private By indvProduct = By.xpath("//*[@id='menutd']/ul/li[5]/ul/li[1]/ul/li");
	
	private By typeOfLoanDropdown = By.xpath(".//*[@id='creditType']");

	private By loanAmmounttTextBox = By.xpath("//*[@id='creditAmount']");

	private By firstNameTextBox = By.xpath(".//*[@id='firstName']");

	private By lastNameTextBox = By.xpath("//*[@id='lastName']");

	private By dateOfBirth_Day_DrpDwn = By.xpath("//span/select[@id='dobDay']");

	private By dateOfBirth_Month_DrpDwn = By.xpath("//span/select[@id='dobMonth']");

	private By dateOfBirth_Year_DrpDwn = By.xpath("//span/select[@id='dobYear']");

	private By ageTextBox = By.xpath("//*[@id='CrInquiry_age']");

	private By fatherNameTextBox = By.xpath(".//*[@id='fatherName']");

	private By spouseNameTextBox = By.xpath("//span/input[@id='spouseName']");

	private By panIdTextBox = By.xpath(".//*[@id='pan']");

	private By dLicenseTextBox = By.xpath("//span/input[@id='idType4Value']");

	private By passportTextBox = By.xpath("//span/input[@id='passport']");

	private By rationCardTextBox = By.xpath("//span/input[@id='idType3Value']");

	private By uidTextBox = By.xpath("//span/input[@id='idType1Value']");

	private By otherIdTextBox = By.xpath("//span/input[@id='idType5Value']");

	private By mobileNoTextBox = By.xpath("//span/input[@id='telephoneNumber1']");

	private By voterIdTextBox = By.xpath(".//*[@id='idType2Value']");

	private By addressTextBox = By.xpath(".//*[@id='addr1Line1']");

	private By localityTextBox = By.xpath(".//*[@id='villageLocality1']");

	private By pinCodeTextBox = By.xpath(".//*[@id='addr1Pin']");

	private By submitButton = By.xpath("//*[@id='btnSubNewInquiry']");

	// ------Validation Mandatory message
	private By resetButton = By.xpath("//input[@value='RESET']");
	private By validateConsumerMessage = By.xpath("//span[contains(text(),'Consumer Name is required.')]");
	private By validateFatherMessage = By.xpath("//span[contains(text(),'Either Father')]");
	private By validateLoanMessage = By.xpath("//span[contains(text(),'Loan Type is required.')]");
	private By validateCurrentAddressMessage = By
			.xpath("//span[contains(text(),'House/Building name for Current Address is required.')]");
	private By validateVillageMessage = By
			.xpath("//span[contains(text(),'Village/Locality for Current Address is required.')]");
	private By validatePinCodeMessage = By
			.xpath("//span[contains(text(),'Pin Code for Current Address is required.')]");
	private By validateDOBMessage = By.xpath("//span[contains(text(),'Date of Birth or Age is required.')]");
	private By validateLoanAmtMessage = By.xpath("//span[contains(text(),'Loan Amount is required.')]");

	public void actualConsumerMessage() {
		super.elementToHighlightGreen(driver, driver.findElement(validateConsumerMessage));
		driver.findElement(validateConsumerMessage).getText();

	}

	public String actualConsumerNameMessage() {
		String actualConsumerMessage = driver.findElement(validateConsumerMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validateConsumerMessage));
		log.info(actualConsumerMessage);
		return actualConsumerMessage;
	}

	public String actualFatherMessage() {
		String actualFatherMessage = driver.findElement(validateFatherMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validateFatherMessage));
		log.info(actualFatherMessage);
		return actualFatherMessage;
	}

	public String actualLoanMessage() {
		String actualLoanMessage = driver.findElement(validateLoanMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validateLoanMessage));
		log.info(actualLoanMessage);
		return actualLoanMessage;
	}

	public String actualCurrentAddressMessage() {
		String actualCurrentAddressMessage = driver.findElement(validateCurrentAddressMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validateCurrentAddressMessage));
		log.info(actualCurrentAddressMessage);
		return actualCurrentAddressMessage;
	}

	public String actualVillageMessage() {
		String actualVillageMessage = driver.findElement(validateVillageMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validateVillageMessage));
		log.info(actualVillageMessage);
		return actualVillageMessage;
	}

	public String actualPinCodeMessage() {
		String actualPinCodeMessage = driver.findElement(validatePinCodeMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validatePinCodeMessage));
		log.info(actualPinCodeMessage);
		return actualPinCodeMessage;
	}

	public String actualDOBMessage() {
		String actualDOBMessage = driver.findElement(validateDOBMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validateDOBMessage));
		log.info(actualDOBMessage);
		return actualDOBMessage;
	}

	public String actualLoanAmtMessage() {
		String actualLoanAmtMessage = driver.findElement(validateLoanAmtMessage).getText();
		super.elementToHighlightGreen(driver, driver.findElement(validateLoanAmtMessage));
		log.info(actualLoanAmtMessage);
		return actualLoanAmtMessage;
	}

	public void clickIndvProduct() {
		super.waitForElementToBeClickable(clickIndvProduct);
		super.elementToHighlightGreen(driver, driver.findElement(clickIndvProduct));
		driver.findElement(clickIndvProduct).click();
		log.info("click On Indv Product");
	}

	public void clickOnSingleRequestLink() {
		super.waitForElementToBeClickable(clickOnSingleRequestLink);
		super.elementToHighlightGreen(driver, driver.findElement(clickOnSingleRequestLink));
		driver.findElement(clickOnSingleRequestLink).click();
	}

	public void indvProduct() {
		super.waitForElementToBeClickable(indvProduct);
		super.elementToHighlightGreen(driver, driver.findElement(indvProduct));
		driver.findElement(indvProduct).click();
	}

	public void clickOnResetButton() {
		super.waitForElementToBeClickable(resetButton);
		super.elementToHighlightGreen(driver, driver.findElement(resetButton));
		driver.findElement(resetButton).click();
	}

	public void enterTypeOfLoan() {
		super.waitForElementToBeClickable(typeOfLoanDropdown);
		driver.findElement(typeOfLoanDropdown).sendKeys(sheet.getRow(3).getCell(0).getStringCellValue());
	}

	public void enterLoanAmount() {
		super.waitForElementToBeClickable(loanAmmounttTextBox);
		int enterLoanAmount = (int) sheet.getRow(3).getCell(1).getNumericCellValue();
		String enterLoanAmount1 = String.valueOf(enterLoanAmount);
		driver.findElement(loanAmmounttTextBox).sendKeys(enterLoanAmount1);
	}

	public void enterfirstName() {
		super.waitForElementToBeClickable(firstNameTextBox);

		driver.findElement(firstNameTextBox).sendKeys(sheet.getRow(3).getCell(2).getStringCellValue());
	}

	public void enterLastName() {
		super.waitForElementToBeClickable(lastNameTextBox);
		driver.findElement(lastNameTextBox).sendKeys(sheet.getRow(3).getCell(4).getStringCellValue());
	}

	public void enterAge() {
		super.waitForElementToBeClickable(ageTextBox);
		int consumerAge = (int) sheet.getRow(3).getCell(5).getNumericCellValue();
		String consumerageTextBox = String.valueOf(consumerAge);
		driver.findElement(ageTextBox).sendKeys(consumerageTextBox);
	}
	public void selectDateOfBirth_OR_EnterAge() {
		if (sheet.getRow(3).getCell(25) != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
			System.out.println("********************" + dateFormat);
			String dob = dateFormat.format(sheet.getRow(3).getCell(22).getDateCellValue());
			System.out.println("(((((((((((" + dob);
			String dob1 = String.valueOf(dob);
			String[] splitDate = dob1.split("-");
			System.out.println("{{{{{{{{{{{{{{{{{" + splitDate);
			super.waitForElementToBeVisible(dateOfBirth_Day_DrpDwn);
			Select day = new Select(driver.findElement(dateOfBirth_Day_DrpDwn));
			day.selectByVisibleText(splitDate[0].trim());
			super.waitForElementToBeVisible(dateOfBirth_Month_DrpDwn);
			Select month = new Select(driver.findElement(dateOfBirth_Month_DrpDwn));
			month.selectByVisibleText(splitDate[1].substring(0, 3).trim());
			super.waitForElementToBeVisible(dateOfBirth_Year_DrpDwn);
			Select year = new Select(driver.findElement(dateOfBirth_Year_DrpDwn));
			year.selectByVisibleText(splitDate[2].trim());
		} else {
			super.waitForElementToBeVisible(ageTextBox);
			int customerAge = (int) sheet.getRow(3).getCell(5).getNumericCellValue();
			String age = String.valueOf(customerAge);
			driver.findElement(ageTextBox).sendKeys(age);
		}
	}

	public void enterIdValidationDetail() {
		if (sheet.getRow(3).getCell(6) != null) {
			super.waitForElementToBeVisible(fatherNameTextBox);
			String fatherName = sheet.getRow(3).getCell(6).getStringCellValue();
			driver.findElement(fatherNameTextBox).sendKeys(fatherName);
			log.info("Father Name is entered");
		}
		if (sheet.getRow(3).getCell(7) != null) {
			super.waitForElementToBeVisible(spouseNameTextBox);
			String spouseName = sheet.getRow(3).getCell(7).getStringCellValue();
			driver.findElement(spouseNameTextBox).sendKeys(spouseName);
			log.info("SpouseName is entered");
		}
		if (sheet.getRow(3).getCell(9) != null) {
			super.waitForElementToBeVisible(panIdTextBox);
			String panName = sheet.getRow(3).getCell(9).getStringCellValue();
			driver.findElement(panIdTextBox).sendKeys(panName);
			log.info("PAN is entered");
		}
		if (sheet.getRow(3).getCell(10) != null) {
			super.waitForElementToBeVisible(dLicenseTextBox);
			String dlName = sheet.getRow(3).getCell(10).getStringCellValue();
			driver.findElement(dLicenseTextBox).sendKeys(dlName);
			log.info("Driving Licence is entered");
		}

		if (sheet.getRow(3).getCell(11) != null) {
			super.waitForElementToBeVisible(voterIdTextBox);
			String voterID = sheet.getRow(3).getCell(11).getStringCellValue();
			driver.findElement(voterIdTextBox).sendKeys(voterID);
			log.info("VoterId is entered");
		}

		if (sheet.getRow(3).getCell(12) != null) {
			super.waitForElementToBeVisible(passportTextBox);
			String passPort = sheet.getRow(3).getCell(12).getStringCellValue();
			driver.findElement(passportTextBox).sendKeys(passPort);
			log.info("Passport No is entered");
		}

		if (sheet.getRow(3).getCell(13) != null) {
			super.waitForElementToBeVisible(rationCardTextBox);
			String rationNo = sheet.getRow(3).getCell(13).getStringCellValue();
			driver.findElement(rationCardTextBox).sendKeys(rationNo);
			log.info("Ration Card Value is entered");
		}

		if (sheet.getRow(3).getCell(14) != null) {
			super.waitForElementToBeVisible(uidTextBox);
			String uiNo = sheet.getRow(3).getCell(14).getStringCellValue();
			driver.findElement(uidTextBox).sendKeys(uiNo);
			log.info("UID is entered");
		}

		if (sheet.getRow(3).getCell(15) != null) {
			super.waitForElementToBeVisible(otherIdTextBox);
			String otherID = sheet.getRow(1).getCell(15).getStringCellValue();
			driver.findElement(otherIdTextBox).sendKeys(otherID);
			log.info("OtherId is entered");
		}

		if (sheet.getRow(3).getCell(16) != null) {
			super.waitForElementToBeVisible(mobileNoTextBox);
			int mobNO = (int) sheet.getRow(3).getCell(16).getNumericCellValue();
			String mobNumber = String.valueOf(mobNO);
			driver.findElement(mobileNoTextBox).sendKeys(mobNumber);
			log.info("Mobile No is entered");
		}
	}

	public void enterCurrentAddress() {
		super.waitForElementToBeClickable(addressTextBox);
		driver.findElement(addressTextBox).sendKeys(sheet.getRow(3).getCell(17).getStringCellValue());
	}

	public void enterLocality() {
		super.waitForElementToBeClickable(localityTextBox);
		driver.findElement(localityTextBox).sendKeys(sheet.getRow(3).getCell(18).getStringCellValue());
	}

	public void enterPinCode() throws Exception {
		super.waitForElementToBeClickable(pinCodeTextBox);
		int consumerPinCode1 = (int) sheet.getRow(3).getCell(19).getNumericCellValue();
		String ConsumerPin = String.valueOf(consumerPinCode1);
		driver.findElement(pinCodeTextBox).sendKeys(ConsumerPin);
		Thread.sleep(1000);
	}

	public void clickOnSubmitButton() {
		super.waitForElementToBeClickable(submitButton);
		driver.findElement(submitButton).click();
	}

}



