/*
package com.inquiry.tests;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.inquiry.baseTest.BaseTest;
import com.inquiry.constant.Constants;
import com.inquiry.pages.Report_Verify;
import com.inquiry.tests.TrackRequestTest;

public class Report_VerifyTest<webelemenst> extends BaseTest
{
	public static String finalReportID ="";
	String expectedReportID;
	TrackRequestTest requestTest;
	Report_Verify report_verifytest;
	
	XSSFSheet sheet=BaseTest.readCompanyData(Constants.FILEPATH, 3);
	
	@Test(priority=7)
	public void headerInformation_FieldTest(){	
		
		//Date Field
		SoftAssert softAssert = new SoftAssert();
		report_verifytest = new Report_Verify(BaseTest.driver);
		String actual_dateField = report_verifytest.requestDateField();
		String excepted_dateField ="Request Date";
		softAssert.assertEquals(actual_dateField, excepted_dateField,"RequestDate Field are not Matching");	
		
		//issues Date field 
		String actual_issueDateField=report_verifytest.issueDateField();
		String excepted_issuedDateField="Issue Date";
		softAssert.assertEquals(actual_issueDateField, excepted_issuedDateField,"issueDateField are not matched");
		
		//Credit for field value
		String actual_creditForField=report_verifytest.createdForField();
		String excepted_creditForField="Created For";
		softAssert.assertEquals(actual_creditForField, excepted_creditForField,"creditforField not matched");
		
		//CHM Ref field 
		String actual_chmRefField=report_verifytest.chmRefField();
		String excepted_chmRefField="CHM Ref #";
		softAssert.assertEquals(actual_chmRefField, excepted_chmRefField,"chmRefField not matched");
		softAssert.assertAll();
	}
	
	@Test(priority=8,dependsOnMethods={"headerInformation_FieldTest"})		
	public void headerInformation_Field_ValueTest(){
		//issues Date value
		SoftAssert softAssert = new SoftAssert();
		report_verifytest = new Report_Verify(BaseTest.driver);
		Date currentDate =new Date();
		SimpleDateFormat DateValue=new SimpleDateFormat("dd-MM-yyyy");
		String acutal_DateValue=report_verifytest.issueDateValue();
		String excepted__DateValue=DateValue.format(currentDate);
		softAssert.assertEquals(acutal_DateValue, excepted__DateValue,"issue date are not matched");
				
		//request date value
		String acutal_request_DateValue=report_verifytest.requestDateValue();
		String excepted_request_currentDate1=DateValue.format(currentDate);
		softAssert.assertEquals(acutal_request_DateValue, excepted_request_currentDate1,"request date not matched");
				
		//Credit for field value
		String actual_CreditForValue=report_verifytest.createdForValue();
		requestTest= new TrackRequestTest();
		String excepted_CreditForValue=requestTest.customerIdValidationMessage();
		softAssert.assertEquals(actual_CreditForValue, excepted_CreditForValue,"creditforFieldvalue not matched");

		//CHM Ref value
		requestTest=new TrackRequestTest();
		String exceptedreport_Id_value = requestTest.reportIdValidate();
		String chmRefrReportIdValue=report_verifytest.chmRefrReportIdValue();
		softAssert.assertEquals(chmRefrReportIdValue, exceptedreport_Id_value,"report id not matched");
		softAssert.assertAll();

	}	
	@Test(priority=9,dependsOnMethods={"headerInformation_Field_ValueTest"})
	public void inquiryInputInfromationfield () {
		
		SoftAssert softAssert = new SoftAssert();
		report_verifytest = new Report_Verify(BaseTest.driver);
		String actual_Name = report_verifytest.nameField();
		String expected_Name = "Name";
		softAssert.assertEquals(actual_Name, expected_Name,"name field  are not Matching");
		log.info("name field matched");
		
		String actual_voterIdFieldValue = report_verifytest.reportIdsField();
		String expected_voterIdFieldValue =  "IDs";
		softAssert.assertEquals(actual_voterIdFieldValue, expected_voterIdFieldValue,"voter field are not Matching");	
		log.info("voterIdField Value are match");
		
        String actual_agefield = report_verifytest.ageField();
		String expected_agefield = "Age";
		softAssert.assertEquals(actual_agefield, expected_agefield,"agefield  are not Matching");
		log.info("AGE FIELD matched");
		
		String actual_realtionshipField = report_verifytest.reportRealtionshipField();
		String expected_realtionshipField = "Relationship #1";
		softAssert.assertEquals(actual_realtionshipField, expected_realtionshipField,"realtionshipField are not Matching");
		log.info("realtionshipField matched");
		
		String actual_addressfield = report_verifytest.reportCurrentAddressedField();
		String expected_addressfield = "Address # 1";
		softAssert.assertEquals(actual_addressfield, expected_addressfield,"addressfield are not Matching");
		log.info("addressfield  matched");
		softAssert.assertAll();
	}
	
	@Test(priority=10)
	public void inquiryInputInfromationValue(){

		SoftAssert softAssert = new SoftAssert();
		report_verifytest = new Report_Verify(BaseTest.driver);
		String actual_namefieldvalue = report_verifytest.reportNameValue();
		String expected_fieldName =  sheet.getRow(1).getCell(2).getStringCellValue()+" "+sheet.getRow(1).getCell(4).getStringCellValue();
		softAssert.assertEquals(actual_namefieldvalue, expected_fieldName,"NameField Values are not Matching");	
		log.info("name Value are match");
			
		ArrayList<String> actual_IDs_value = report_verifytest.getIDs_Value();
        String[] expected_IDs_value = new String[7];
        for(int i=0; i<=6;i++){
              XSSFCell value = sheet.getRow(1).getCell(9+i);
              if(value!=null){
                    expected_IDs_value[i] = sheet.getRow(1).getCell(9+i).getStringCellValue();
                    
              }
        }     
        ArrayList<String> list1 = new ArrayList<String> ();
        for(String s : actual_IDs_value){
              if(s!=null && s.length() > 0){
                    list1.add(s);
              }
        }           
        ArrayList<String> list2 = new ArrayList<String> ();
        for(String s : expected_IDs_value){
              if(s!=null && s.length() > 0){
                    list2.add(s);
              }
        }
        softAssert.assertTrue(list1.containsAll(list2), "ID is not matching.");

		String actual_AgeFieldValue = report_verifytest.reportAgeValue();
		int expected_AgeFieldValue =  (int)sheet.getRow(1).getCell(5).getNumericCellValue();
		String age=String.valueOf(expected_AgeFieldValue);
		softAssert.assertEquals(actual_AgeFieldValue, age,"Age Values are not Matching");	
		log.info("Age Value are match");
					
		String actual_RealtionshipFieldValue = report_verifytest.reportRealtionshipValue();
		String expected_RealtionshipFieldValue = sheet.getRow(1).getCell(6).getStringCellValue();
		softAssert.assertEquals(actual_RealtionshipFieldValue, expected_RealtionshipFieldValue,"Realtionship Values are not Matching");	
		log.info("Realtionship Value are match");
		
		String actual_Address1fieldValue = report_verifytest.reportCurrentAddressValue();
		int pinCode=(int)sheet.getRow(1).getCell(19).getNumericCellValue();
		String pinCode1=String.valueOf(pinCode);
		String expected_CurrentAddress_value = sheet.getRow(1).getCell(17).getStringCellValue()+" "+sheet.getRow(2).getCell(18).getStringCellValue()+" "+pinCode1+" "+sheet.getRow(1).getCell(22).getStringCellValue().trim(); 
		softAssert.assertEquals(actual_Address1fieldValue, expected_CurrentAddress_value,"Address Values are not Matching");	
		log.info("Address Value are match");
		softAssert.assertAll();
	}
		
	@Test(priority=11)
	public void testSummary_Section(){
		
		SoftAssert softAssert = new SoftAssert();
		report_verifytest = new Report_Verify(BaseTest.driver);
		String actual_summary=report_verifytest.reportSummary();
		String excepted_summary="   SUMMARY";
		softAssert.assertEquals(actual_summary, excepted_summary,"summary not matched");
			
		int actualActiveCount=report_verifytest.actualActiveCount();
		int noOfActiveRecord= report_verifytest.noOfActiveRecord();
		softAssert.assertEquals(actualActiveCount, noOfActiveRecord,"Active account number not matced");
		
		int actualClosedeCount=report_verifytest.actualClosedCount();
		int noOfClosedRecord= report_verifytest.noOfClosedRecord();
		softAssert.assertEquals(actualClosedeCount, noOfClosedRecord,"Closed account number not matced");
		
		String actual_associationField=report_verifytest.associationField();
		String excepted_associationField="Association";
		softAssert.assertEquals(excepted_associationField, actual_associationField,"AssociationField not matched");
		
		String actual_accountsummary=report_verifytest.accountSummaryField();
		String excepted_accountsummary="Account Summary";
		softAssert.assertEquals(actual_accountsummary, excepted_accountsummary,"account summary not matched");
		
		String actual_totalDisbursedAmount=report_verifytest.totalDisbursedAmountField();
		String excepted_totalDisbursedAmount="Total Disbursed Amount";
		softAssert.assertEquals(actual_totalDisbursedAmount, excepted_totalDisbursedAmount,"Total Disbursed Amount field not matched");
		
		String actual_totalCurrentBalance=report_verifytest.totalCurrentBalanceField();
		String excepted_totalCurrentBalance="Total Current Balance";
		softAssert.assertEquals(actual_totalCurrentBalance, excepted_totalCurrentBalance,"Total Current Balance not matched");
		
		String actual_TotalInstallmentAmount=report_verifytest.totalInstallmentAmountField();
		String excepted_TotalInstallmentAmount="Total Installment Amount";
		softAssert.assertEquals(actual_TotalInstallmentAmount, excepted_TotalInstallmentAmount,"InstallmentAmountField not matched");
		
		String actual_primaryField=report_verifytest.primaryField();
		String excepted_primaryField="Primary";
		softAssert.assertEquals(actual_primaryField, excepted_primaryField,"Primary not matched");
		
		String actual_secondaryField=report_verifytest.secondaryField();
		String excepted_secondaryField="Secondary";
		softAssert.assertEquals(actual_secondaryField, excepted_secondaryField,"secondaryField not matched");
		
		String actual_associationOwn=report_verifytest.associationOwnField();
		String excepted_associationOwn="Own";
		softAssert.assertEquals(actual_associationOwn, excepted_associationOwn,"assoication OWN Field not matched");
		
		String actual_associationOtherField=report_verifytest.associationOtherField();
		String excepted_associationOtherfield="Other";
		softAssert.assertEquals(actual_associationOtherField, excepted_associationOtherfield,"assoication Other Field not matched");
		
		String actual_accountSummaryActiveFiled=report_verifytest.accountSummaryActiveField();
		String excepted_accountSummaryActiveField="Active";
		softAssert.assertEquals(actual_accountSummaryActiveFiled, excepted_accountSummaryActiveField,"AccountSummaryActiveField not matched");
		
		String actual_accountSummaryClosedFiled=report_verifytest.accountSummaryClosedField();
		String excepted_accountSummaryClosedFiled="Closed";
		softAssert.assertEquals(actual_accountSummaryClosedFiled, excepted_accountSummaryClosedFiled,"AccountSummaryClosedField not matched");
		
		String actual_accountSummaryDefaultFiled=report_verifytest.accountSummaryDefaultField();
		String excepted_accountSummaryDefaultFiled="Default";
		softAssert.assertEquals(actual_accountSummaryDefaultFiled, excepted_accountSummaryDefaultFiled,"AccountSummaryDefaultField not matched");
		
		String actual_totalDisbursedAmountOwnField=report_verifytest.totalDisbursedAmountOwn();
		String excepted_totalDisbursedAmountOwnField="Own";
		softAssert.assertEquals(actual_totalDisbursedAmountOwnField, excepted_totalDisbursedAmountOwnField,"TotalDisbursedAmountOwn not matched");
		
		String actual_totalDisbursedAmountOtherField=report_verifytest.totalDisbursedAmountOther();
		String excepted_totalDisbursedAmountOtherField="Other";
		softAssert.assertEquals(actual_totalDisbursedAmountOtherField, excepted_totalDisbursedAmountOtherField,"secondaryField not matched");
		
		String actual_totalCurrentBalancOwnField=report_verifytest.totalcurrentBalanceOwn();
		String excepted_totalCurrentBalancOwnField="Own";
		softAssert.assertEquals(actual_totalCurrentBalancOwnField, excepted_totalCurrentBalancOwnField,"TotalcurrentBalanceOwn not matched");
		
		String actual_totalCurrentBalancOtherField=report_verifytest.totalcurrentBalanceOther();
		String excepted_totalCurrentBalancOtherField="Other";
		softAssert.assertEquals(actual_totalCurrentBalancOtherField, excepted_totalCurrentBalancOtherField,"TotalcurrentBalanceOther not matched");
		
		String actual_totalInstallmentAmountOwnField=report_verifytest.totalDisbursedAmountOwn();
		String excepted_totalInstallmentAmountOwnField="Own";
		softAssert.assertEquals(actual_totalInstallmentAmountOwnField, excepted_totalInstallmentAmountOwnField,"TotalDisbursedAmountOwn not matched");
		
		String actual_totalInstallmentAmountOtherField=report_verifytest.totalInstallmentAmountOther();
		String excepted_totalInstallmentAmountOtherField="Other";
		softAssert.assertEquals(actual_totalInstallmentAmountOtherField, excepted_totalInstallmentAmountOtherField,"TotalDisbursedAmountOther not matched");
		
		softAssert.assertAll();
		}
	@Test(priority=12)
	public void test_MemmberAccountInformation(){
		report_verifytest=new Report_Verify(driver);
		SoftAssert softassertion=new SoftAssert();
		Integer totalRecord = report_verifytest.getTotal_Number_Of_Record();
		
		
		for(int i=0;i<totalRecord;i++){
			List<WebElement> actual_matchField=report_verifytest.memberAccountInformation_match_Field();
			String expected_matchField = Constants.MATCHFIELD;
			softassertion.assertEquals(actual_matchField.get(i).getText().trim(), expected_matchField,"In TradeLine Match Field are not matched");
			softassertion.assertAll();
		}
		
		List<WebElement> realtionshipField=report_verifytest.memberAccountInformation_Realtionship_Field();
		String expected_Realtionship_Field = Constants.Relationship;
				
		List<WebElement> adress1_Field=report_verifytest.memberAccountInformation_Adress1_Field();
		String expected_adress1_Field = Constants.Address1;
		
		List<WebElement> address2Field=report_verifytest.memberAccountInformation_Adress2_Field();
		String expected_address2 = Constants.Address2;
		
		List<WebElement> IDtField=report_verifytest.memberAccountInformation_IDt_Field();
		String expected_IDt_Field = Constants.I_Dt;
		
		List<WebElement> dobField=report_verifytest.memberAccountInformation_DOB_Field();
		String expected_dob_Field = Constants.DOB;   
	
		for(int i=0;i<realtionshipField.size();i++){	
			softassertion.assertEquals(realtionshipField.get(i).getText().trim(), expected_Realtionship_Field, "Realtionship_Field field is not matching.");
		}
		for(int i=0;i<adress1_Field.size();i++){	
			softassertion.assertEquals(adress1_Field.get(i).getText().trim(), expected_adress1_Field, "address1 field is not matching.");
			}

		for(int i=0;i<address2Field.size();i++){	
			softassertion.assertEquals(address2Field.get(i).getText().trim(), expected_address2, "address2 field is not matching.");
			}

		for(int i=0;i<IDtField.size();i++){	
			softassertion.assertEquals(IDtField.get(i).getText().trim(), expected_IDt_Field, "Idt field is not matching.");
			}
			
		for(int i=0;i<dobField.size();i++){	
			softassertion.assertEquals(dobField.get(i).getText().trim(), expected_dob_Field, "Dob field is not matching.");
			}
	
		softassertion.assertAll();
	}

	@Test(priority=13)
	public void test_MemmberAccountInformationTradeLineField(){
	//	Integer totalRecord = report_verifytest.getTotal_Number_Of_Record();
		SoftAssert softassertion=new SoftAssert();
		report_verifytest=new Report_Verify(driver);
		String actual_memmberAccountInformation=report_verifytest.memberAccountInformation();
		String excepted_memmberAccountInformation=Constants.EXCEPTED_MEMMBERACCOUNTINFORMATION;
		softassertion.assertEquals(actual_memmberAccountInformation, excepted_memmberAccountInformation,"mummber accountinformation not matched");
		softassertion.assertAll();
	
		Integer totalRecord = report_verifytest.getTotal_Number_Of_Record();
		for(int i=0;i<totalRecord;i++){
			List<WebElement> actual_matchField=report_verifytest.InformationAsOn_Field();
			String expected_matchField = Constants.INFORMATION_AS_ON;
			softassertion.assertEquals(actual_matchField.get(i).getText().trim(), expected_matchField,"In TradeLine Match Field are not matched");
			softassertion.assertAll();
	}
		
		List<WebElement> phone1Field=report_verifytest.memberAccountInformation_Phone1_Field();
		String expected_phone1_Field = Constants.Phone1;
		
		List<WebElement> phone2Field=report_verifytest.memberAccountInformation_Phone2_Field();
		String expected_phone2Field = Constants.Phone2;
		
		List<WebElement> actualLoanClosedDate_Field=report_verifytest.LoanClosedDate_Field();
		String expectedLoanClosedDate_Field = Constants.Loan_Close_Date;
		
		List<WebElement> actualDPD_Field=report_verifytest.DPD_Field();
		String expectedDPD_Field = Constants.DPD;
		
		List<WebElement> actualInstallmentFrequency_Field=report_verifytest.InstallmentFrequency_Field();
		String expectedInstallmentFrequency_Field = Constants.Installment_Frequency;
		
		List<WebElement> actualDisbursedAmount_Field=report_verifytest.DisbursedAmount_Field();
		String expectedDisbursedAmount_Field= Constants.Disbursed_Amount;
		
		List<WebElement> actualCurrentBalance_Field=report_verifytest.CurrentBalance_Field();
		String expectedCurrentBalance_Field = Constants.Current_Balance;
		
		List<WebElement> actualInatallmentAmount_Field=report_verifytest.InatallmentAmount_Field();
		String expectedInstallmentAmount_Field = Constants.Installment_Amount;
		
		List<WebElement> actualOverdue_AmountField=report_verifytest.Overdue_AmountField();
		String expectedOverdue_AmountField = Constants.Overdue_AmounT;
		
		List<WebElement> actualWriteOff_Amount_Field=report_verifytest.WriteOff_Amount_Field();
		String expectedWriteOff_Amount_Field = Constants.WriteOff_Amount;
		
		List<WebElement> actualRecent_Delinq_Dt_Field=report_verifytest.Recent_Delinq_Dt_Field();
		String expectedRecent_Delinq_Dt_Field = Constants.Recent_Delinq_Dt;
		
		List<WebElement> actualAccount_Number_Field=report_verifytest.Account_Number_Field();
		String expectedAccount_Number_Field = Constants.ACCOUNT_NUMBER;
		
		List<WebElement> actualMFI_Name_Field=report_verifytest.MFI_Name_Field();
		String expectedMFI_Name_Field = Constants.MFI_NAME;
		
		List<WebElement> actualBranch_Field=report_verifytest.Branch_Field();
		String expectedBranch_Field = Constants.BRANCH;
		
		List<WebElement> actualKendra_Center_Field=report_verifytest.Kendra_Center_Field();
		String expectedKendra_Center_Field = Constants.KENDRA_CENTER;
		
		for(int i=0;i<actualLoanClosedDate_Field.size();i++){	
			softassertion.assertEquals(actualLoanClosedDate_Field.get(i).getText().trim(), expectedLoanClosedDate_Field, "LoanClosedDate field is not matching.");
			}
		
		for(int i=0;i<phone1Field.size();i++){	
			softassertion.assertEquals(phone1Field.get(i).getText().trim(), expected_phone1_Field, "Phone1 field is not matching.");
			}
				
		for(int i=0;i<phone2Field.size();i++){	
			softassertion.assertEquals(phone2Field.get(i).getText().trim(), expected_phone2Field, "phone2 field is not matching.");
			}

		
		for(int i=0;i<actualLoanClosedDate_Field.size();i++){	
			softassertion.assertEquals(actualLoanClosedDate_Field.get(i).getText().trim(), expectedLoanClosedDate_Field, "LoanClosedDate field is not matching.");
			}
		
		for(int i=0;i<actualDPD_Field.size();i++){	
			softassertion.assertEquals(actualDPD_Field.get(i).getText().trim(), expectedDPD_Field, "DPD field is not matching.");
			}
				
		for(int i=0;i<actualInstallmentFrequency_Field.size();i++){	
			softassertion.assertEquals(actualInstallmentFrequency_Field.get(i).getText().trim(), expectedInstallmentFrequency_Field, "instalmentFrequency field is not matching.");
			}

		for(int i=0;i<actualKendra_Center_Field.size();i++){	
			softassertion.assertEquals(actualKendra_Center_Field.get(i).getText().trim(), expectedKendra_Center_Field, "KENDRA field is not matching.");
			}
		
		for(int i=0;i<actualBranch_Field.size();i++){	
			softassertion.assertEquals(actualBranch_Field.get(i).getText().trim(), expectedBranch_Field, "BRANCH field is not matching.");
			}
		
		for(int i=0;i<actualDisbursedAmount_Field.size();i++){	
			softassertion.assertEquals(actualDisbursedAmount_Field.get(i).getText().trim(), expectedDisbursedAmount_Field, "DISBURSEDAmount field is not matching.");
			}
				
		for(int i=0;i<actualCurrentBalance_Field.size();i++){	
			softassertion.assertEquals(actualCurrentBalance_Field.get(i).getText().trim(), expectedCurrentBalance_Field, "Current Field  is not matching.");
			}

		for(int i=0;i<actualInatallmentAmount_Field.size();i++){	
			softassertion.assertEquals(actualInatallmentAmount_Field.get(i).getText().trim(), expectedInstallmentAmount_Field, "INSTALLMET field is not matching.");
			}
		
		for(int i=0;i<actualOverdue_AmountField.size();i++){	
			softassertion.assertEquals(actualOverdue_AmountField.get(i).getText().trim(), expectedOverdue_AmountField, "Overdueamount field is not matching.");
			}
		
		for(int i=0;i<actualWriteOff_Amount_Field.size();i++){	
			softassertion.assertEquals(actualWriteOff_Amount_Field.get(i).getText().trim(), expectedWriteOff_Amount_Field, "WriteOff field is not matching.");
			}
				
		for(int i=0;i<actualRecent_Delinq_Dt_Field.size();i++){	
			softassertion.assertEquals(actualRecent_Delinq_Dt_Field.get(i).getText().trim(), expectedRecent_Delinq_Dt_Field, "Recent_Delinq field is not matching.");
			}

		for(int i=0;i<actualAccount_Number_Field.size();i++){	
			softassertion.assertEquals(actualAccount_Number_Field.get(i).getText().trim(), expectedAccount_Number_Field, "Account number field is not matching.");
			}
		
		for(int i=0;i<actualMFI_Name_Field.size();i++){	
			softassertion.assertEquals(actualMFI_Name_Field.get(i).getText().trim(), expectedMFI_Name_Field, "MFI NAME field is not matching.");
			}	
//		for(int i=0;i<totalRecord;i++){
//				String actual_matchField=report_verifytest.memberAccountInformation_match_Field().trim();
//				String expected_matchField = Constants.MATCHFIELD;
//				System.out.println(actual_matchField);
//				System.out.println(expected_matchField);
//				softassertion.assertEquals(actual_matchField, expected_matchField,"In TradeLine Match Field are not matched");
//				softassertion.assertAll();
//		}
//		for(int i=0;i<totalRecord;i++){
//			String actual_NameFieldInMemmberAccount=report_verifytest.memverAccountInformation_Name_Field().trim();
//			String expected_NameFieldInMemmberAccount = Constants.NAMEFIELD;
//			softassertion.assertEquals(actual_NameFieldInMemmberAccount, expected_NameFieldInMemmberAccount,"In TradeLine Name Field are not matched");
//			}
		for(int i=0;i<totalRecord;i++){
				String actual_RelationshipFieldInMemmberAccount=report_verifytest.memverAccountInformation_Realtionship_Field().trim();
				String expected_RelationshipFieldInMemmberAccount = Constants.Relationship;
				softassertion.assertEquals(actual_RelationshipFieldInMemmberAccount, expected_RelationshipFieldInMemmberAccount,"In TradeLine Relationship Field are not matched");
			}
		for(int i=0;i<totalRecord;i++){
				String actual_IDtFieldInMemmberAccount=report_verifytest.memverAccountInformation_IDt_Field().trim();
				String expected_IDtFieldInMemmberAccount = Constants.I_Dt;
				softassertion.assertEquals(actual_IDtFieldInMemmberAccount, expected_IDtFieldInMemmberAccount,"In TradeLine IDt Field are not matched");
			}
		for(int i=0;i<totalRecord;i++){
				String actual_DobFieldInMemmberAccount=report_verifytest.memverAccountInformation_DOB_Field().trim();
				String expected_DobFieldInMemmberAccount = Constants.DOB;
				softassertion.assertEquals(expected_DobFieldInMemmberAccount,actual_DobFieldInMemmberAccount,"In TradeLine DOB Field are not matched");
			}
		for(int i=0;i<totalRecord;i++){
				String actual_Adress1FieldInMemmberAccount=report_verifytest.memverAccountInformation_Adress1_Field().trim();
				String expected_Adress1FieldInMemmberAccount = Constants.Address1;
				softassertion.assertEquals(expected_Adress1FieldInMemmberAccount,actual_Adress1FieldInMemmberAccount,"In TradeLine Address1 Field are not matched");
			}
		for(int i=0;i<totalRecord;i++){
				String actual_Adress2FieldInMemmberAccount=report_verifytest.memverAccountInformation_Adress2_Field().trim();
				String expected_Adress2FieldInMemmberAccount = Constants.Address2;
				softassertion.assertEquals(expected_Adress2FieldInMemmberAccount,actual_Adress2FieldInMemmberAccount,"In TradeLine Adress2 Field are not matched");
		}
		softassertion.assertAll();
	}	
	
	


	@Test(priority=14)
	public void test_DisclaimerPresence(){
		
		//DISCLAIMER FIELD
		SoftAssert softAssert = new SoftAssert();
		report_verifytest = new Report_Verify(BaseTest.driver);	
		String actual_DisclaimerField = report_verifytest.reportDisclimarField();
		String expected_DisclaimerField =Constants.EXCEPTED_DICSLAIMERFIELD;
		softAssert.assertEquals(expected_DisclaimerField,actual_DisclaimerField,"Disclaimer field not present as excepted");
		
		//DISCLAIMER Value	
		String actual_Disclaimervalue = report_verifytest.reportDisclaimerValue();
		String expected_DisclaimerValue=Constants.EXCEPTED_DISCLAIMERVALUE;
		softAssert.assertEquals(expected_DisclaimerValue,actual_Disclaimervalue,"disclaimer value are not match as excepted");
		softAssert.assertAll();
	}
	
}	
*/