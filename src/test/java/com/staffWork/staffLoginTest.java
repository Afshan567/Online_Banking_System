package com.staffWork;


 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.ObjectRepo.StaffLoginPage;
import com.banking.genericUtils.BaseClass;
import com.banking.genericUtils.FileUtility;
import com.banking.genericUtils.WebDriverUtility;

public class staffLoginTest extends BaseClass {
	@Test
	public void stffLoginTest() {
		
//public static void main(String[] args) throws Throwable {
	//staff login page of smoke test is working
	//Creating object of utility class
	//WebDriverUtility wu=new WebDriverUtility();
	//FileUtility ful=new FileUtility();

	//WebDriver driver=new ChromeDriver();
	
	//this method using from utility class for browser maximize
	//wu.maximizeTheBrowser(driver);
	
	//accessing url from property file by using generic method
 	//driver.get(ful.getPropertyKeyValue("url"));
 	
	//this method using from utility class for implicit wait
 	//wu.implicitWait(driver, 10);
 	StaffLoginPage sp=new StaffLoginPage(driver);
 	sp.staffClk();
 	System.out.println("Staff login page displayed");
 	//driver.findElement(By.xpath("//a[.='Staff Login']")).click();

//}
}
}