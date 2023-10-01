package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class makeMyTripTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//driver.navigate().refresh();
Actions act=new Actions(driver);
act.doubleClick().perform();
Thread.sleep(3000);
act.moveByOffset(0, 80).click().perform();
Thread.sleep(5000);
//driver.findElement(By.xpath("//div[@data-cy='tertiaryRowContainer']")).click();

		//driver.findElement(By.xpath("//a[@class='close']")).click();
driver.findElement(By.xpath("//label[@for='departure']")).click();
driver.findElement(By.xpath("//div[text()='September 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='22']")).click();
/*driver.findElement(By.xpath("//span[text()='Return']")).click();
for(;;)
{
	try {
		driver.findElement(By.xpath("//div[text()='November']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='2']")).click();
	break;
	}
	catch(Exception e)
	{
	driver.findElement(By.xpath("//div[text()='October']")).click();*/	
	}
//}
//driver.findElement(By.xpath("//a[text()='Search']")).click();
	}


