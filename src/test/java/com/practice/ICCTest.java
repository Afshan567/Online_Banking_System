package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 List<WebElement> countrys = driver.findElements(By.xpath("//tbody/tr[*]/td[2]"));
 		for(WebElement we:countrys)
		{
			System.out.println("It is present");
		}
			}

}
