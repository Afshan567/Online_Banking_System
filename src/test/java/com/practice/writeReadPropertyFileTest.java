package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writeReadPropertyFileTest {
public static void main(String[] args) throws Throwable {
	//writing data
	Properties pr = new Properties();
	pr.setProperty("url", "http://rmgtestingserver/domain/Online_Banking_System/");
	pr.setProperty("username","210001");
	pr.setProperty("password", "password");
	FileOutputStream fo=new FileOutputStream(".\\src\\test\\resources\\commonData2.properties");
	pr.store(fo, "writing data");
	fo.close();
	
//reading data	
FileInputStream fi=new FileInputStream("./src/test/resources/commonData2.properties");
pr.load(fi);
String URL = pr.getProperty("url");
String Uname = pr.getProperty("username");
String Pswd = pr.getProperty("password");
WebDriver driver=new ChromeDriver();
driver.get(URL);
driver.findElement(By.xpath("//a[.='Staff Login']")).click();
	driver.findElement(By.name("staff_id")).sendKeys(Uname);
	driver.findElement(By.name("password")).sendKeys(Pswd);
	driver.findElement(By.name("staff_login-btn")).click();
	
}
}
