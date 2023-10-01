package com.accountWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.ObjectRepo.AccOpenFormPage;
import com.banking.ObjectRepo.HomePage;
import com.banking.ObjectRepo.StaffActionPage;
import com.banking.ObjectRepo.StaffLoginPage;
import com.banking.genericUtils.BaseClass;
import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.FileUtility;
import com.banking.genericUtils.WebDriverUtility;

public class openDelAcc extends BaseClass {

	//public static void main(String[] args) throws Throwable {
		// while approving the a/c getting cannot be reproducible bug
		@Test
		public void openAcDel() throws Throwable 
		{
		//creating objects of utility classes to access its methods
		//FileUtility ful=new FileUtility();
		//WebDriverUtility wdl=new WebDriverUtility();
		//ExcelUtility eu=new ExcelUtility();
		//try {
		//WebDriver driver=new ChromeDriver();
		//for browser maximize
		//wdl.maximizeTheBrowser(driver);
 		//using property file generic method to fetch url value 
		//driver.get(fu.getPropertyKeyValue("url"));
//for implicit wait
		//wdl.implicitWait(driver, 10);
		HomePage hp=new HomePage(driver);
		hp.openAccClk();
  		//driver.findElement(By.xpath("//li[.='Open Account']")).click();
		
  		//using generic method to fetch multiple data from excel in the form of key & value
  		//eu.getMultipleDataFromExcel("Sheet2", 0, 1, driver);
  		AccOpenFormPage ao=new AccOpenFormPage(driver);
  		ao.accOpenDetails(eu.getMultipleDataFromExcel("Sheet2", 0, 1), driver);
  		
  		
 		 		//driver.findElement(By.name("gender")).click();
		//driver.findElement(By.xpath("//option[.='Male']")).click();
		//driver.findElement(By.name("dob")).click();
		String dob="10-11-1997";
		//driver.findElement(By.name("dob")).sendKeys(dob);
		//using generic method & reading single value from excel
		//String state = eu.readExcelData("Sheet2", 0, 3);
		//WebElement st = driver.findElement(By.name("state"));
		 //using select class generic method to access select by visible text
		//wdl.selectDropDown(state, st);
//WebElement st1 = driver.findElement(By.name("city"));
//using select class generic method to access select by index
//wdl.selectDropDown(st1, 3);
		//calling method from accopenform for remaining details filling apart from map  
ao.accOpenDetails(dob, eu.readExcelData("Sheet2", 0, 3), 3);
/*driver.findElement(By.name("acctype")).click();
driver.findElement(By.xpath("//option[text()='Saving']")).click();
driver.findElement(By.name("submit")).click();
driver.findElement(By.name("cnfrm-submit")).click();*/

//capturing application no
String ApplicationNo=ao.alertHandling(driver);
/*Alert al=driver.switchTo().alert();
String altext=al.getText();
String appno = "";
  for(int i=0; i<altext.length(); i++)
  {
	  if(Character.isDigit(altext.charAt(i)))
			  {
		 appno = appno+altext.charAt(i);
		
			  }

  }
  System.out.println("application no for opening a/c is:\t"+appno);
  
al.accept();*/

StaffLoginPage sp=new StaffLoginPage(driver);
sp.staffClk();
//driver.findElement(By.xpath("//a[.='Staff Login']")).click();
//using property file generic method to fetch values by passing keys
String stfid=fu.getPropertyKeyValue("staffid");
String pswd=fu.getPropertyKeyValue("Password");

sp.staffLog(stfid, pswd);
//driver.findElement(By.name("staff_id")).sendKeys(stfid);
//driver.findElement(By.name("password")).sendKeys(pswd);
//driver.findElement(By.name("staff_login-btn")).click();

//staff approving the account
ao.staffApproval(ApplicationNo);
//driver.findElement(By.name("apprvac")).click();
//driver.findElement(By.name("application_no")).sendKeys(appno);
//driver.findElement(By.name("search_application")).click();
//driver.findElement(By.name("approve_cust")).click();

String Accountno=ao.alertHandl(driver);
/*Alert al2=driver.switchTo().alert();
String altext2=al2.getText();
//System.out.println(altext2);
String accno = "";
  for(int j=0; j<altext2.length(); j++)
  {
	  if(Character.isDigit(altext2.charAt(j)))
			  {
		  accno = accno+altext2.charAt(j);
			  }
  }
  System.out.println(accno);
  al2.accept();*/
ao.subHome();
//driver.findElement(By.xpath("//*[@name='home']")).click();

StaffActionPage spa=new StaffActionPage(driver);
spa.viewActiveCust();
//driver.findElement(By.name("viewdet")).click();

//Validating account is created or not
ao.AccValidation(Accountno);
/*List<WebElement> tabl = driver.findElements(By.xpath("//tbody/tr/td[4]"));
for(WebElement we:tabl)
{
	if(we.getText().equals(accno))
	{
		System.out.println("Account is created successfully");
		break;
	}
	else

			System.out.println("Account is not created");
}*/
		//}
/*catch(Exception e)
{
System.out.println("app defect");
}*/
//driver.close();

	//}
}
}
