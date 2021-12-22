package com.inquiry.pages;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.inquiry.basePage.BasePage;
import com.inquiry.baseTest.BaseTest;
import com.inquiry.constant.Constants;

public class Report_Verify extends BasePage {

	public Report_Verify(WebDriver driver) {
		super(driver);
	}
	XSSFSheet sheet=BaseTest.readCompanyData(Constants.FILEPATH, 3);
	
	//Header
	private By requestDateField = By.xpath("//table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td[1]/div");
	
	private By issuesDateField = By.xpath("//table[2]/tbody/tr/td[3]/table/tbody/tr[2]/td[1]/div");
	
	private By creditForField = By.xpath("//table[2]/tbody/tr/td[3]/table/tbody/tr[3]/td[1]/div");
	
	private By cHMRefField = By.xpath("//table[2]/tbody/tr/td[3]/table/tbody/tr[4]/td[1]/div");	
	
	private By requestDateValue = By.xpath("//table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td[3]");
	
	private By issuesDateValue = By.xpath("//table[2]/tbody/tr/td[3]/table/tbody/tr[2]/td[3]");
	
	private By creditForValue = By.xpath("//table[2]/tbody/tr/td[3]/table/tbody/tr[3]/td[3]");
	
	private By reportidValue = By.xpath("//table[1]/tbody/tr[1]/td/table[2]/tbody/tr/td[3]/table/tbody/tr[4]/td[3]");

	private By inquiryInputinformationHeader=By.xpath("tr[2]/td/table/tbody/tr[2]/td/span");
	
	private By namefield=By.xpath("//tr/td[1]/table/tbody/tr[1]/td[1]/div");
	
	private By idsField=By.xpath("//tr/td[2]/table/tbody/tr[1]/td[1]/div");
	
	private By agefield=By.xpath("//td/table/tbody/tr/td[4]/table/tbody/tr[1]/td[1]/div");
	
	private By realtionshipfield=By.xpath("//td[1]/table/tbody/tr[4]/td[1]/div");
	
	private By currentAddressedField=By.xpath("//tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/div/span");
	
	private By nameValue=By.xpath("//tr[2]/td/table[2]/tbody/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td[3]/span");
	
	private By idsValue=By.xpath("//tbody/tr/td[2]/table/tbody/tr[1]/td[3]/span");
	
	private By idValue2=By.xpath("//tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]");
	
	private By ageValue=By.xpath("//tbody/tr[2]/td/table[2]/tbody/tr[3]/td/table/tbody/tr/td[4]/table/tbody/tr[1]/td[3]/span");
	
	private By realtionshipValue=By.xpath("//tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[4]/td[3]/span");
	
	private By currentAddressValue=By.xpath("//tr[2]/td/table[2]/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td[3]/span");
 
	private By reportSummary=By.xpath("//tr/td/table[1]/tbody/tr[2]/td/table[2]/tbody/tr[5]/td");
	
	private By association=By.xpath("//tbody/tr[6]/td/table/tbody/tr[1]/td[2]");
		
	private By accountSummary=By.xpath("//tr[6]/td/table/tbody/tr[1]/td[3]/div");
	
	private By totalDisbursedAmount =By.xpath("//tr[6]/td/table/tbody/tr[1]/td[4]/div");
	
	private By totalCurrentBalance=By.xpath("//tr[6]/td/table/tbody/tr[1]/td[5]/div");
	
	private By totalInstallmentAmount=By.xpath("//tr[6]/td/table/tbody/tr[1]/td[6]/div"); 
		
	private By primary=By.xpath("//tr[6]/td/table/tbody/tr[3]/td[1]");
	
	private By secondary=By.xpath("//tr[6]/td/table/tbody/tr[4]/td[1]");
	
	private By associationOwn=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[2]/div");
	
	private By associationOthers=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[3]/div");
	
	private By accountSummaryActive=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[4]/div");
	
	private By accountSummaryClosed=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[5]/div");
	
	private By accountSummaryDefaultt=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[6]/div");
	
	private By totalDisbursedAmountOwn=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[7]/div");
	
	private By totalDisbursedAmountOther=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[8]/div");
	
	private By totalCurrentBalanceOwn=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[9]/div");
	
	private By totalCurrentBalanceOther=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[10]/div");
	
	private By totalInstallmentAmountOwn=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[11]/div");
	
	private By totalInstallmentAmountOther=By.xpath("//tr[6]/td/table/tbody/tr[2]/td[12]/div");
	
	private By summaryActiveAccountCount=By.xpath("//tr[6]/td/table/tbody/tr[3]/td[4]/span");
	
	private By summaryClosedAccountCount=By.xpath("//tr[6]/td/table/tbody/tr[3]/td[5]/span");
	
	private By memberAccountInformation=By.xpath("//tr[9]/td/table/tbody/tr[2]/td/span");
	
	private By noOfCloseRecord=By.xpath("//span[contains(text(),'Account Closed')]");
	
	private By noOfActiveRecord=By.xpath("//td[2]/span[contains(text(),'Current')]");
	
	private By disclimarField=By.xpath("//body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[2]/td[1]");
	
	private By disclaimerMessage=By.xpath("//body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[2]/td[2]");
	
	private By memberAccountInformationMatchField=By.xpath("//td[contains(text(),'SUMMARY')]//ancestor::tr[3]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]/span"); 
	
//	private By memberAccountInformationNameField=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/span");
	
	private By memberAccountInformationRelationshipField=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/span");
	
	private By memberAccountInformationIDTField=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[5]/span");
	
	private By memberAccountInformationAddress1Field=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[6]/span");
	
	private By memberAccountInformationAddress2Field=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[3]/td[10]/span");
	
	private By memberAccountInformationDoBField=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[11]/span");
	
	private By memberAccountInformationPhone1Field=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[6]/td[6]/span");
	
	private By memberAccountInformationPhone2Field=By.xpath("//td/table/tbody/tr[3]/td/table/tbody/tr[6]/td[10]/span");
	
	private By inTradeLine_InformationAsOn_Field=By.xpath("//table//tbody/tr[3]/td/table/tbody/tr/td/span[contains(text(),'Information As On')]");
	
	private By inTradeLine_AccountType_Field=By.xpath("//td[1]/span[contains(text(),' Account Type')]");
	
	private By inTradeLine_Status_Field=By.xpath("//td[1]/span[contains(text(),'Status')]");
	
	private By inTradeLine_DisbursedDate_Field=By.xpath("//td[1]/span[contains(text(),'Disbursed    Date')]");
	
	private By inTradeLine_LoanClosedDate_Field=By.xpath("//td[1]/span[contains(text(),'Loan Close    Date')]");
	
	private By inTradeLine_DPD_Field=By.xpath("//td[1]/span[contains(text(),'DPD')]");
	
	private By inTradeLine_InstallmentFrequency_Field=By.xpath("//td[3]/span[contains(text(),'Installment Frequency')]");
	
	private By inTradeLine_DisbursedAmount_Field=By.xpath("//td[3]/span[contains(text(),'Disbursed Amount')]");
	
	private By inTradeLine_CurrentBalance_Field=By.xpath("//td[3]/span[contains(text(),'Current Balance')]");
	
	private By inTradeLine_InatallmentAmount_Field=By.xpath("//td[3]/span[contains(text(),'Installment Amount')]");
	
	private By inTradeLine_Overdue_AmountField=By.xpath("//td[3]/span[contains(text(),'Overdue Amount')]");
	
	private By inTradeLine_WriteOff_Amount_Field=By.xpath("//td[3]/span[contains(text(),'WriteOff Amount')]");
	
	private By inTradeLine_Recent_Delinq_Dt_Field=By.xpath("//td[5]/span[contains(text(),'Recent Delinq Dt')]");
	
	private By inTradeLine_Account_Number_Field=By.xpath("//td[5]/span[contains(text(),'Account Number')]");
	
	private By inTradeLine_MFI_Name_Field=By.xpath("//td[5]/span[contains(text(),'MFI Name')]");
	
	private By inTradeLine_Branch_Field=By.xpath("//td[5]/span[contains(text(),'Branch')]");
	
	private By inTradeLine_Kendra_Center_Field=By.xpath("//td[5]/span[contains(text(),'Kendra/Center')]");
	
	public String chmRefrReportIdValue() {
		super.waitForElementToBeVisible(reportidValue);
		return driver.findElement(reportidValue).getText();
	}

	public String requestDateField() {
		super.waitForElementToBeVisible(requestDateField);
		return driver.findElement(requestDateField).getText();
	}
	
	public String requestDateValue() {
		super.waitForElementToBeVisible(requestDateValue);
		return driver.findElement(requestDateValue).getText();
	}
	
	public String issueDateField() {
		super.waitForElementToBeVisible(issuesDateField);
		return driver.findElement(issuesDateField).getText();
	}
	
	public String issueDateValue() {
		super.waitForElementToBeVisible(issuesDateValue);
		return driver.findElement(issuesDateValue).getText();
	}
	
	public String createdForField() {
		super.waitForElementToBeVisible(creditForField);	
		return driver.findElement(creditForField).getText();
	}

	public String createdForValue() {
		super.waitForElementToBeVisible(creditForValue);	
		return driver.findElement(creditForValue).getText();
	}
	
	public String chmRefField() {
		super.waitForElementToBeVisible(cHMRefField);
		return driver.findElement(cHMRefField).getText();
	}
	
	public String inquiryInputinformationHeader() {
		super.waitForElementToBeVisible(inquiryInputinformationHeader);
		return driver.findElement(inquiryInputinformationHeader).getText();
	}
	
	public String nameField() {
		super.waitForElementToBeVisible(namefield);
		return driver.findElement(namefield).getText();
	}
	
	public String reportIdsField() {
		super.waitForElementToBeVisible(idsField);
		return driver.findElement(idsField).getText();
	}

	public String ageField() {
		super.waitForElementToBeVisible(agefield);
		return driver.findElement(agefield).getText();
	}
	
	public String reportRealtionshipField() {
		super.waitForElementToBeVisible(realtionshipfield);
		return driver.findElement(realtionshipfield).getText();
	}
	
	public String reportCurrentAddressedField() {
		super.waitForElementToBeVisible(currentAddressedField);
		return driver.findElement(currentAddressedField).getText();
	}
	
	public String reportNameValue() {
		super.waitForElementToBeVisible(nameValue);
		return driver.findElement(nameValue).getText();
	}
	
	public String reportIdsValue() {
		super.waitForElementToBeVisible(idsValue);
		String voter=driver.findElement(idsValue).getText();
		String actual=voter.substring(0, 14);
		return actual;
	}
	
	public String reportAgeValue() {
		super.waitForElementToBeVisible(ageValue);
		String age=driver.findElement(ageValue).getText();
		String actual=age.substring(0,2);
		return actual;
	}
	
	public String reportRealtionshipValue() {
		super.waitForElementToBeVisible(realtionshipValue);
		String realtionship=driver.findElement(realtionshipValue).getText();
		String actual=realtionship.split("\\(")[0].trim();
		return actual;
	}
	
	public String reportCurrentAddressValue() {
		super.waitForElementToBeVisible(currentAddressValue);
		return driver.findElement(currentAddressValue).getText();
	}
	
	public String reportSummary() {
		super.waitForElementToBeVisible(reportSummary);
		return driver.findElement(reportSummary).getText();
	}
	
	public String associationField(){
		super.waitForElementToBeVisible(association);
		return driver.findElement(association).getText();
	}
	
	public String accountSummaryField(){
		super.waitForElementToBeVisible(accountSummary);
		return driver.findElement(accountSummary).getText();
	}
	
	public String totalDisbursedAmountField(){
		super.waitForElementToBeVisible(totalDisbursedAmount);
		return driver.findElement(totalDisbursedAmount).getText();
	}
	
	public String totalCurrentBalanceField(){
		super.waitForElementToBeVisible(totalCurrentBalance);
		return driver.findElement(totalCurrentBalance).getText();
	}
	
	public String totalInstallmentAmountField(){
		super.waitForElementToBeVisible(totalInstallmentAmount);
		return driver.findElement(totalInstallmentAmount).getText();
	}
	
	public String primaryField(){
		super.waitForElementToBeVisible(primary);
		return driver.findElement(primary).getText();
	}
	
	public String secondaryField(){
		super.waitForElementToBeVisible(secondary);
		return driver.findElement(secondary).getText();
	}
	
	public String associationOwnField(){
		super.waitForElementToBeVisible(associationOwn);
		return driver.findElement(associationOwn).getText();
	}
	public String associationOtherField(){
		super.waitForElementToBeVisible(associationOthers);
		return driver.findElement(associationOthers).getText();
	}
	
	public String accountSummaryActiveField(){
		super.waitForElementToBeVisible(accountSummaryActive);
		return driver.findElement(accountSummaryActive).getText();
	}
	
	public String accountSummaryClosedField(){
		super.waitForElementToBeVisible(accountSummaryClosed);
		return driver.findElement(accountSummaryClosed).getText();
	}
	
	public String accountSummaryDefaultField(){
		super.waitForElementToBeVisible(accountSummaryDefaultt);
		return driver.findElement(accountSummaryDefaultt).getText();
	}
	
	public String totalDisbursedAmountOwn(){
		super.waitForElementToBeVisible(totalDisbursedAmountOwn);
		return driver.findElement(totalDisbursedAmountOwn).getText();
	}
	
	public String totalDisbursedAmountOther(){
		super.waitForElementToBeVisible(totalDisbursedAmountOther);
		return driver.findElement(totalDisbursedAmountOther).getText();
	}
	
	public String totalcurrentBalanceOwn(){
		super.waitForElementToBeVisible(totalCurrentBalanceOwn);
		return driver.findElement(totalCurrentBalanceOwn).getText();
	}
	
	public String totalcurrentBalanceOther(){
		super.waitForElementToBeVisible(totalCurrentBalanceOther);
		return driver.findElement(totalCurrentBalanceOther).getText();
	}
	
	public String totalInstallmentAmountOwn(){
		super.waitForElementToBeVisible(totalInstallmentAmountOwn);
		return driver.findElement(totalInstallmentAmountOwn).getText();
	}
	
	public String totalInstallmentAmountOther(){
		super.waitForElementToBeVisible(totalInstallmentAmountOther);
		return driver.findElement(totalInstallmentAmountOther).getText();
	}

	//member start
	
	public  Integer getTotal_Number_Of_Record(){
		String activerecord= driver.findElement(summaryActiveAccountCount).getText();
		String closedrecord=driver.findElement(summaryClosedAccountCount).getText();
		int activeRecord=Integer.parseInt(activerecord);
		int closedRecord=Integer.parseInt(closedrecord);
		int allActiveRecord=activeRecord+closedRecord;
		return (allActiveRecord);
	}
	
	public List<WebElement> memberAccountInformation_match_Field(){
		super.waitForElementToBeVisible(memberAccountInformationMatchField);
		List<WebElement> matchField =driver.findElements(memberAccountInformationMatchField);
		return matchField;
	}
	
	public List<WebElement> memberAccountInformation_Realtionship_Field(){
	super.waitForElementToBeVisible(memberAccountInformationRelationshipField);
	List<WebElement> realtionshipField =driver.findElements(memberAccountInformationRelationshipField);
	return realtionshipField;
	}

	public List<WebElement> memberAccountInformation_Adress1_Field(){
	super.waitForElementToBeVisible(memberAccountInformationAddress1Field);
	List<WebElement> adress1Field =driver.findElements(memberAccountInformationAddress1Field);	
	return adress1Field;
	}

	public List<WebElement> memberAccountInformation_Adress2_Field(){
	super.waitForElementToBeVisible(memberAccountInformationAddress2Field);
	List<WebElement> adress2Field =driver.findElements(memberAccountInformationAddress2Field);
	return adress2Field;
	}
	
	public List<WebElement> memberAccountInformation_IDt_Field(){
	super.waitForElementToBeVisible(memberAccountInformationIDTField);
	List<WebElement> iDt=driver.findElements(memberAccountInformationIDTField);
	return iDt;
	}
	
	public List<WebElement> memberAccountInformation_DOB_Field(){
	super.waitForElementToBeVisible(memberAccountInformationDoBField);
	List<WebElement> dobField=driver.findElements(memberAccountInformationDoBField);
	return dobField;
	}


	public List<WebElement> memberAccountInformation_Phone1_Field(){
	super.waitForElementToBeVisible(memberAccountInformationPhone1Field);
	List<WebElement> Phone1_Field=driver.findElements(memberAccountInformationPhone1Field);
	return Phone1_Field;
	}

	public List<WebElement> memberAccountInformation_Phone2_Field(){
		super.waitForElementToBeVisible(memberAccountInformationPhone2Field);
		List<WebElement> Phone2_Field=driver.findElements(memberAccountInformationPhone2Field);
		return Phone2_Field;
		}
	
	public List<WebElement> InformationAsOn_Field(){
		super.waitForElementToBeVisible(inTradeLine_InformationAsOn_Field);
		List<WebElement> infomationAsOnField=driver.findElements(inTradeLine_InformationAsOn_Field);
		return infomationAsOnField;
		}

	public List<WebElement> AccountType_Field(){
		super.waitForElementToBeVisible(inTradeLine_AccountType_Field);
		List<WebElement> accountType=driver.findElements(inTradeLine_AccountType_Field);
		return accountType;
		}
	
	public List<WebElement> Status_Field(){
		super.waitForElementToBeVisible(inTradeLine_Status_Field);
		List<WebElement> statusField=driver.findElements(inTradeLine_Status_Field);
		return statusField;
		}
	
		public List<WebElement> DisbursedDate_Field(){
		super.waitForElementToBeVisible(inTradeLine_DisbursedDate_Field);
		List<WebElement> disbursedate=driver.findElements(inTradeLine_DisbursedDate_Field);
		return disbursedate;
		}
	
		public List<WebElement> LoanClosedDate_Field(){
		super.waitForElementToBeVisible(inTradeLine_LoanClosedDate_Field);
		List<WebElement> loanClosedDateField=driver.findElements(inTradeLine_LoanClosedDate_Field);
		return loanClosedDateField;
		}
	
		public List<WebElement> DPD_Field(){
		super.waitForElementToBeVisible(inTradeLine_DPD_Field);
		List<WebElement> dpdField=driver.findElements(inTradeLine_DPD_Field);
		return dpdField ;
		}
		
		public  List<WebElement> InstallmentFrequency_Field(){
		super.waitForElementToBeVisible(inTradeLine_InstallmentFrequency_Field);
		List<WebElement> InstallmentFrequency_Field=driver.findElements(inTradeLine_InstallmentFrequency_Field);
		return InstallmentFrequency_Field;
		}
	
		public List<WebElement> DisbursedAmount_Field(){
		super.waitForElementToBeVisible(inTradeLine_DisbursedAmount_Field);
		List<WebElement> DisbursedAmount_Field=driver.findElements(inTradeLine_DisbursedAmount_Field);
		return DisbursedAmount_Field;
		}
	
		public  List<WebElement> CurrentBalance_Field(){
		super.waitForElementToBeVisible(inTradeLine_CurrentBalance_Field);
		List<WebElement> CurrentBalance_Field=driver.findElements(inTradeLine_CurrentBalance_Field);
		return CurrentBalance_Field;
		}
	
	public List<WebElement> InatallmentAmount_Field(){
		super.waitForElementToBeVisible(inTradeLine_InatallmentAmount_Field);
		List<WebElement> DisbursedAmount_Field=driver.findElements(inTradeLine_InatallmentAmount_Field);
		return DisbursedAmount_Field;
		}
	
	public List<WebElement> Overdue_AmountField(){
		super.waitForElementToBeVisible(inTradeLine_Overdue_AmountField);
		List<WebElement> Overdue_AmountField=driver.findElements(inTradeLine_Overdue_AmountField);
		return Overdue_AmountField;
		}
	
	public List<WebElement> WriteOff_Amount_Field(){
		super.waitForElementToBeVisible(inTradeLine_WriteOff_Amount_Field);
		List<WebElement> WriteOff_Amount_Field=driver.findElements(inTradeLine_WriteOff_Amount_Field);
		return WriteOff_Amount_Field;
		}
	
	public List<WebElement> Recent_Delinq_Dt_Field(){
		super.waitForElementToBeVisible(inTradeLine_Recent_Delinq_Dt_Field);
		List<WebElement> Recent_Delinq_Dt_Field=driver.findElements(inTradeLine_Recent_Delinq_Dt_Field);
		return Recent_Delinq_Dt_Field;
		}
	
	public List<WebElement> Account_Number_Field(){
		super.waitForElementToBeVisible(inTradeLine_Account_Number_Field);
		List<WebElement> Account_Number_Field=driver.findElements(inTradeLine_Account_Number_Field);
		return Account_Number_Field;
		}
	
	public List<WebElement> MFI_Name_Field(){
		super.waitForElementToBeVisible(inTradeLine_MFI_Name_Field);
		List<WebElement> MFI_Name_Field=driver.findElements(inTradeLine_MFI_Name_Field);
		return MFI_Name_Field;
		}
	
	public List<WebElement> Branch_Field(){
		super.waitForElementToBeVisible(inTradeLine_Branch_Field);
		List<WebElement> Branch_Field=driver.findElements(inTradeLine_Branch_Field);
		return Branch_Field;
		}
	
	public List<WebElement> Kendra_Center_Field(){
		super.waitForElementToBeVisible(inTradeLine_Kendra_Center_Field);
		List<WebElement> Kendra_Center_Field=driver.findElements(inTradeLine_Kendra_Center_Field);
		return Kendra_Center_Field;
		}
	public int actualActiveCount(){
		List<WebElement> count = driver.findElements(noOfActiveRecord);
		return count.size();
	}
	
	public int noOfActiveRecord(){
		super.waitForElementToBeVisible(summaryActiveAccountCount);
		String count = driver.findElement(summaryActiveAccountCount).getText();
		return Integer.parseInt(count);
	}
	
	public int actualClosedCount(){
		List<WebElement> count = driver.findElements(noOfCloseRecord);
		return count.size();
	}
	
	public int noOfClosedRecord(){
		super.waitForElementToBeVisible(summaryClosedAccountCount);
		String count = driver.findElement(summaryClosedAccountCount).getText();
		return Integer.parseInt(count);
	}
	
	public String memberAccountInformation() {
		super.waitForElementToBeVisible(memberAccountInformation);
		return driver.findElement(memberAccountInformation).getText();
	}
	
	public String reportDisclimarField() {
		super.waitForElementToBeVisible(disclimarField);
		return driver.findElement(disclimarField).getText();
	}
	public String reportDisclaimerValue() {
		super.waitForElementToBeVisible(disclaimerMessage);
		return driver.findElement(disclaimerMessage).getText();
	}
	public ArrayList<String> getIDs_Value(){
        ArrayList<String> idlist = new ArrayList<String>();
        if(driver.findElement(idsValue).getText().length()>0){
        	String id1 = driver.findElement(idsValue).getText().split("\\(")[0].trim();
        	idlist.add(id1);        	
        }
        if(driver.findElement(idValue2).getText().length()>0){
        	String id2 = driver.findElement(idValue2).getText().split("\\(")[0].trim();
        	idlist.add(id2);        	
        }
       return idlist;        
  }
}