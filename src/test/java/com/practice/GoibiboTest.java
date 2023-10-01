package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboTest {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='sc-gKclnd hSnAGZ']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//driver.findElement(By.xpath("//div[text()='August 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='31']")).click();
//driver.findElement(By.xpath("//div[text()='September 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='1']")).click();		
//driver.findElement(By.xpath("//span[text()='Done']")).click();
//driver.findElement(By.xpath("//a[text()='Done']")).click();
		
for(;;)
{
	try {
		driver.findElement(By.xpath("//div[text()='November 2023']/ancestor::div[@class='DayPicker-Month']/descendant::div[@aria-label='Fri Nov 03 2023']")).click();
break;
	}
	catch(Exception e)
	{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}
}
driver.findElement(By.xpath("//span[text()='Done']")).click();
driver.findElement(By.xpath("//a[text()='Done']")).click();
	}

}
