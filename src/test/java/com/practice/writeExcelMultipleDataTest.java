package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeExcelMultipleDataTest {
	// in this program we can write data in multiple rows & cells
	public static void main(String[] args) throws Throwable {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of rows u want to enter data");
int row_count=sc.nextInt();
System.out.println("Enter the column no u want to enter data");
int col_count=sc.nextInt();
// . in below path indicates current file path
FileInputStream fl=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
Workbook wb=WorkbookFactory.create(fl);
Sheet sh=wb.getSheet("Sheet3");
for(int i=0;i<row_count;i++)
{
	sh.createRow(i);
	for(int j=0;j<col_count;j++)
	{
		System.out.println("Enter data for "+i+"row and" +j+ "cell");
		String cellData=sc.next();
		sh.getRow(i).createCell(j).setCellValue(cellData);
	}
}
FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
wb.write(fout);
wb.close();
}

}
