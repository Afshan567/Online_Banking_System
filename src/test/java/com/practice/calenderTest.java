package com.practice;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class calenderTest {

	public static void main(String[] args) {
		int date=31, date2=1;
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.ksrtc.in/oprs-web/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.findElement(By.id("txtJourneyDate")).click();
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a[text()='"+date+"']")).click();
driver.findElement(By.id("txtReturnJourneyDate")).click();
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[text()='"+date2+"']")).click();
	}

}
