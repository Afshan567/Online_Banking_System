
package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeExcelDataTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fl=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
Workbook wb=WorkbookFactory.create(fl);
Sheet sh=wb.getSheet("Emp2"); // mention sheet name of excel
		sh.createRow(0).createCell(0).setCellValue("welcome to excel");
		sh.getRow(0).createCell(1).setCellValue(10);
		sh.getRow(0).createCell(2).setCellValue("");
 		sh.createRow(1).createCell(1).setCellValue(" excel");
FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
wb.write(fout);
wb.close();
	}
}
