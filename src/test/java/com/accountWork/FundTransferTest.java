package com.accountWork;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.ObjectRepo.FundTransferPage;
import com.banking.ObjectRepo.StaffActionPage;
import com.banking.ObjectRepo.StaffLoginPage;
import com.banking.ObjectRepo.UserLoginPage;
import com.banking.ObjectRepo.ViewBeneficiaryPage;
import com.banking.ObjectRepo.ViewCustByAccNoPage;
import com.banking.genericUtils.BaseClass;
import com.banking.genericUtils.FileUtility;
import com.banking.genericUtils.WebDriverUtility;

public class FundTransferTest extends BaseClass {

	//public static void main(String[] args) throws IOException
	//{
	@Test
	public void fndTransfer() throws Throwable
	{
	
		//Creating objects for Generic utility classes
		//WebDriverUtility wLib=new WebDriverUtility();
		//FileUtility fLib=new FileUtility();
		// this fund transfer view beneficiary test case is working
		//WebDriver driver=new ChromeDriver();
		//For browser maximize
 		//wLib.maximizeTheBrowser(driver);
 		//for reading value from property file by passing key
 		//String URL=fLib.getPropertyKeyValue("url");
		//driver.get(URL);
		//for implicit wait
		//wLib.implicitWait(driver, 10);
  		//clicking on fund transfer & viewing beneficiary details
		FundTransferPage ft=new FundTransferPage(driver);
		ft.fundTransferClick();
		//driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
		
		//using property file for passing cust id & password
		//String uname=fLib.getPropertyKeyValue("customer_id");
		//String pswd=fLib.getPropertyKeyValue("password");
		String uname=fu.getPropertyKeyValue("customer_id");
		String pswd=fu.getPropertyKeyValue("password");
		
		UserLoginPage ul=new UserLoginPage(driver);
		ul.custLogin(uname, pswd);
 		//driver.findElement(By.name("customer_id")).sendKeys(uname);
 		//driver.findElement(By.name("password")).sendKeys(pswd);
 		//driver.findElement(By.name("login-btn")).click();
		
		ft.fundTransferClick();
 		//driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
 		
		ViewBeneficiaryPage vp=new ViewBeneficiaryPage(driver);
				vp.viewBenef();
 		//driver.findElement(By.name("view_beneficiary")).click();
				
			
 		//Capturing beneficiary a/c no
			//String accno=bp.benefDet();
 		//String accno = driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
				ViewCustByAccNoPage vcb=new ViewCustByAccNoPage(driver);
			String benefAcNo=vcb.benefAccNo();
//logging in as staff
 		//driver.findElement(By.xpath("//a[.='Staff Login']")).click();
 		//using property file for passing staff id & password
 		//String stfId=fLib.getPropertyKeyValue("staffid");
 		//String PASSWORD=fLib.getPropertyKeyValue("Password");
			String stfId=fu.getPropertyKeyValue("staffid");
			String PASSWORD=fu.getPropertyKeyValue("Password");
			
 		StaffLoginPage slp=new StaffLoginPage(driver);
		slp.staffLog(stfId, PASSWORD);
 		//driver.findElement(By.name("staff_id")).sendKeys(stfId);
 		//driver.findElement(By.name("password")).sendKeys(PASSWORD);
 		//driver.findElement(By.name("staff_login-btn")).click();
		
		StaffActionPage sap=new StaffActionPage(driver);
		sap.viewCustbyAcc();
 		//driver.findElement(By.name("view_cust_by_ac")).click();
		
 		
		vcb.custAccDet(benefAcNo);
 		//driver.findElement(By.name("account_no")).sendKeys(accno);
 		//driver.findElement(By.name("submit_view")).click();
		
// 		 			}
	}
}
