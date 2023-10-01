package com.accountWork;

import java.io.IOException;
 
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.ObjectRepo.FundTransferPage;
import com.banking.ObjectRepo.StaffActionPage;
import com.banking.ObjectRepo.StaffLoginPage;
import com.banking.ObjectRepo.TransferAmtToBeneficiaryPage;
import com.banking.ObjectRepo.UserLoginPage;
import com.banking.genericUtils.BaseClass;
import com.banking.genericUtils.FileUtility;
import com.banking.genericUtils.WebDriverUtility;

public class fundTrasnferViewDetail extends BaseClass {
//fund transfer & transferring amount, this test case is working
	
	//public static void main(String[] args) throws IOException {
	@Test
	public void detailFundTransfer() throws Throwable {
		
		//Creating objects for Generic utility classes
		//WebDriverUtility wLib=new WebDriverUtility();
		//FileUtility fLib=new FileUtility();
		//WebDriver driver=new ChromeDriver();
		//for browser maximize
		//wLib.maximizeTheBrowser(driver);
		//using property file generic method to pass url
		//String URL = fLib.getPropertyKeyValue("url");
 		//driver.get(URL);
 		//using implicit wait method from utility class
 	//wLib.implicitWait(driver, 10);
 	
  		//clicking on fund transfer &  transferring amount
 	FundTransferPage fp=new FundTransferPage(driver);
 	fp.fundTransferClick();
		//driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
 	
		//using property file generic method fetching values
		//String custID = fLib.getPropertyKeyValue("customer_id");
		//String pswd = fLib.getPropertyKeyValue("password");
 	String custID = fu.getPropertyKeyValue("customer_id");
 	String pswd = fu.getPropertyKeyValue("password");
 	
		UserLoginPage up=new UserLoginPage(driver);
		up.custLogin(custID, pswd);
 		//driver.findElement(By.name("customer_id")).sendKeys(custID);
 		//driver.findElement(By.name("password")).sendKeys(pswd);
 		//driver.findElement(By.name("login-btn")).click();
		
	 	fp.fundTransferClick();
 		//driver.findElement(By.xpath("//li[.='Fund Transfer']")).click();
	 	
	 	TransferAmtToBeneficiaryPage tra=new TransferAmtToBeneficiaryPage(driver);
	 	tra.getBeneficiaryClk();
 		//driver.findElement(By.name("beneficiary")).click();
	 	
	 	tra.getSlctBeniciary();
 		//driver.findElement(By.xpath("//option[@value='1011901011225']")).click();
	 	
 		//String trnsfAmt="4000";
 		//driver.findElement(By.name("trnsf_amount")).sendKeys(trnsfAmt);
	 	
 		//getting beneficiary a/c no & separating numbers
	 	String benefAcno=tra.benefValidate();
 		/*String benefacno=driver.findElement(By.xpath("//option[@value='1011901011225']")).getText();
 		String accdet = "";
		  for(int i=0; i<benefacno.length(); i++)
		  {
			  if(Character.isDigit(benefacno.charAt(i)))
					  {
				 accdet = accdet+benefacno.charAt(i);
				
					  }
		  }*/
	 	
		//String transferPurpose="party";
 		//driver.findElement(By.name("trnsf_remark")).sendKeys(transferPurpose);
 		//driver.findElement(By.name("fnd_trns_btn")).click();
	 	
//logging as staff & checking under active customer
	 	//driver.findElement(By.xpath("//a[.='Staff Login']")).click();
 		//using property file generic method fetching the values
 		//String stfid = fLib.getPropertyKeyValue("staffid");
 		//String passwd = fLib.getPropertyKeyValue("Password");
	 	String stfid = fu.getPropertyKeyValue("staffid");
	 	String passwd = fu.getPropertyKeyValue("Password");
 		
 		StaffLoginPage slp=new StaffLoginPage(driver);
 		slp.staffLog(stfid, passwd);
 		//driver.findElement(By.name("staff_id")).sendKeys(stfid);
 		//driver.findElement(By.name("password")).sendKeys(passwd);
 		//driver.findElement(By.name("staff_login-btn")).click();
 		
 		StaffActionPage sta=new StaffActionPage(driver);
 		sta.viewActiveCust();
 		//driver.findElement(By.name("viewdet")).click();
 		
 		
 		//For validating beneficiary a/c details from view active customers details
 		tra.activCustValidate(benefAcno);
 		 /*List<WebElement> tabl = driver.findElements(By.xpath("//tbody/tr/td[4]"));
 for(WebElement we:tabl)
 {
	 if(we.getText().equals(accdet))
	 {
		 System.out.println("beneficiary a/c details are displayed in view active customer");
		}
	 else {
	System.out.println("beneficiary details are not displayed"); 
break;
}
}*/
	//}
}
}