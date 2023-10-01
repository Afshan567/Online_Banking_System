package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromCmdTest {
@Test
	public void cmdTest()
{
	//this example is of banking project from RMG server
 	String URL=System.getProperty("url");
 	String uname=System.getProperty("username");
 	String pword=System.getProperty("pswd");
 	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(URL);
driver.findElement(By.name("staff_id")).sendKeys(uname);
driver.findElement(By.name("password")).sendKeys(pword);
driver.findElement(By.name("staff_login-btn")).click();

}
 }
/*@Test
public void cmdTest()
{
	//this is example for amazon application
	String URL=System.getProperty("url");
	String contact=System.getProperty("phoneno");
	String pswd=System.getProperty("password");


	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement we = driver.findElement(By.id("nav-link-accountList"));
	Actions act=new Actions(driver);
	act.moveToElement(we).perform();
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	driver.findElement(By.id("ap_email")).sendKeys(contact);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys(pswd);
	driver.findElement(By.id("signInSubmit")).click();
}*/
