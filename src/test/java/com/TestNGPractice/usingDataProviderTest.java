package com.TestNGPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.IPConstants;

public class usingDataProviderTest {

	/*@Test(dataProvider = "mobiles")
	public void getData(String prdtname,int price)
	{
		System.out.println(prdtname+"===="+price);
	}*/
	@DataProvider
	public Object[][] mobiles()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0]="one plus";
		obj[0][1]=25000;
		
		obj[1][0]="real me";
		obj[1][1]=10000;
		return obj;
	}
	
	
	@DataProvider
	public Object[][] tv() throws Throwable
{
		ExcelUtility eul=new ExcelUtility();
		Object[][] value = eul.getMultipleSetOfData("Product");
				
		return value;
			}
}
