package com.staffWork;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.banking.ObjectRepo.StaffActionPage;
import com.banking.ObjectRepo.StaffLoginPage;
import com.banking.genericUtils.BaseClass;
import com.banking.genericUtils.ExcelUtility;
import com.banking.genericUtils.FileUtility;
import com.banking.genericUtils.WebDriverUtility;
//@Listeners(com.banking.genericUtils.ListenerImpClass.class)
public class creditCustomerTest extends BaseClass {
//public static void main(String[] args) throws Throwable {
		// this credit customer test case is working
	//Creating object of utility classes to access its methods
	@Test
	public void crdtCust() throws Throwable
	{
		
 	//FileUtility ful=new FileUtility();
 	//WebDriverUtility wdu=new WebDriverUtility();
 	//ExcelUtility eul=new ExcelUtility();
 	
 /*WebDriver driver=null;
		//if(BROWSER.equalsIgnoreCase("chrome"))
if(ful.getPropertyKeyValue("browser").equalsIgnoreCase("chrome"))//using property file generic method from utility class
		{
		driver=new ChromeDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
//maximizing the browser
wdu.maximizeTheBrowser(driver);
 		//using property class method from generic utilities
		driver.get(ful.getPropertyKeyValue("url"));
		//using implicit wait method from utility class
wdu.implicitWait(driver, 10);*/
		//driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		
		//using property class method from generic utilities
 		//String uname=ful.getPropertyKeyValue("staffid");
 		//String pswd=ful.getPropertyKeyValue("Password");
 		String uname=fu.getPropertyKeyValue("staffid");
 		String pswd=fu.getPropertyKeyValue("Password");
 		
 		
 		StaffLoginPage sl=new StaffLoginPage(driver);
 		sl.staffLog(uname, pswd);// logging in as staff
 		//driver.findElement(By.name("staff_login-btn")).click();
 		
 		StaffActionPage sap=new StaffActionPage(driver);
 		sap.CreditCust();// clicking credit customer button
 		//driver.findElement(By.name("credit_cust_ac")).click();
 		
 		//Reading multiple data from excel sheet in the form of key & value by using generic utility method
 		//eul.getMultipleDataFromExcel("CreditCustomer", 0, 1, driver);
 		//sap.creditCustDet(eul.getMultipleDataFromExcel("CreditCustomer", 0, 1), driver);// using pom method reading multiple data from  excel via map concept
 		sap.creditCustDet(eu.getMultipleDataFromExcel("CreditCustomer", 0, 1), driver);
 		Assert.fail();
 		//wb.close();
 		//driver.findElement(By.name("credit_btn")).click();
 		//using alert accept method from utility class
 		String text="Amount credited Successfully to customer account";
 		sap.creditclk(text, driver);
 		//wdu.acceptAlertPopup(driver, "Amount credited Successfully to customer account");

 		//driver.findElement(By.name("logout_btn")).click();
 		//driver.findElement(By.xpath("//*/a[.='Home']")).click();
 		//this method used from utility class for scroll down
 		//wdu.scrollByAmount(driver, 0, 400);
 		
 		//WebElement we = driver.findElement(By.xpath("//div[@class='ebanking']"));
 		//this method used from utility class for mouse over 
 		//wdu.mouseOverElement(driver, we);
 //driver.findElement(By.xpath("//a[@href='customer_login.php']")).click();
 	//Reading multiple data from excel sheet in the form of key & value by using generic utility method
	//eul.getMultipleDataFromExcel("Sheet4", 0, 1, driver);
//sap.custLogn(eul.getMultipleDataFromExcel("Sheet4", 0, 1), driver);// using pom method reading multiple data from  excel via map concept
sap.custLogn(eu.getMultipleDataFromExcel("Sheet4", 0, 1), driver);

//wb2.close();
		//driver.findElement(By.name("login-btn")).click();
//driver.findElement(By.xpath("//li[.='Statement']")).click();
}
}
