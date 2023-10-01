package com.accountWork;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.ObjectRepo.HomePage;
import com.banking.genericUtils.BaseClass;
import com.banking.genericUtils.FileUtility;
import com.banking.genericUtils.WebDriverUtility;

public class openAccTest extends BaseClass {
	
//public static void main(String[] args) throws IOException {
	
	@Test(groups="smoke")
	public void openAc() 
	{
		

	//open a/c of smoke test is working
	//WebDriver driver=new ChromeDriver();
	//creating object for utility class to access its methods
	//WebDriverUtility wl=new WebDriverUtility();
	//FileUtility fl=new FileUtility();
	//for browser maximize
	//wl.maximizeTheBrowser(driver);
	//using property file generic method, fetching the url
 	//driver.get(fl.getPropertyKeyValue("url"));
 	//using implicit wait generic method from WebDriverUtility class
 	//wl.implicitWait(driver, 10);
 	HomePage hp=new HomePage(driver);
 	hp.openAccClk();
 	System.out.println("Open a/c page displayed");
 		//driver.findElement(By.xpath("//li[.='Open Account']")).click();
	
//}
}
	@Test(groups="smoke")
	public void demo()
	{
		System.out.println("its demo method");
	}
	@Test(groups="smoke")
	public void display()
	{
		System.out.println("its display method");
	}
}