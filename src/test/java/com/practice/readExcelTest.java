package com.practice;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcelTest {
public static void main(String[] args) throws Throwable {
	FileInputStream fl = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	Workbook wb=WorkbookFactory.create(fl);
	Sheet sh=wb.getSheet("EmpDetails"); // mention sheet name of excel
	int count=sh.getLastRowNum();
	int lastcell=sh.getRow(1).getLastCellNum();
	for(int i=1;i<=count;i++) //row
	{
		for(int j=0;j<lastcell;j++) //cell
		{
	String value=sh.getRow(i).getCell(j).getStringCellValue();
	System.out.print(value+" ");
		}
	System.out.println();
	}
	wb.close();
	
}
}
