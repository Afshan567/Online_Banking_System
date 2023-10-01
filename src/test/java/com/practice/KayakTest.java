package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KayakTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.kayak.co.in/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@placeholder='To?']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='New Delhi, National Capital Territory of India, India']")).click();
driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click(); 
driver.findElement(By.xpath("//div[text()='October 2023']/../../descendant::div[@aria-label='Saturday 28 October, 2023']")).click();
driver.findElement(By.xpath("//div[text()='November 2023']/../../descendant::div[@aria-label='Saturday 25 November, 2023']")).click();
driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
Set<String> windowID = driver.getWindowHandles();
Iterator<String> it = windowID.iterator();
String parentwindowID = it.next();
String childwindowID = it.next();
driver.switchTo().window(childwindowID);
//though the xpath is correct, but its not getting clicked
driver.findElement(By.xpath("//div[@aria-label='Other sort']")).click();
}

}
