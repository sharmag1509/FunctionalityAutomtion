package com.inquiry.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {

public static XSSFSheet readCompanyData(String filePath, int sheetIndex) 
{
	FileInputStream inputStream = null;
	try {
		inputStream = new FileInputStream(filePath);
	//	log.info("inputStream object is created");
	} catch (FileNotFoundException e) {
		//log.error("TestData file not found");
	}
	XSSFWorkbook workbook = null;
	try {
		workbook = new XSSFWorkbook(inputStream);
	//	log.info("Workbook object is created");
	} catch (IOException e) {
		//log.error("IO exception has occured");
	}
	XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(sheetIndex);
//	log.info("Data sheet is found");
	return sheet;
}
public static boolean validateDateFormat(String dateValue) {
	boolean result = false;
	Date date = null;
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	try {
		date = sdf.parse(dateValue);
		if (dateValue.equals(sdf.format(date))) {
			result = true;

		}
	} catch (Exception e) {

	}
	return result;
}
}


