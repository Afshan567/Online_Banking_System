package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class olympicsTest {

	public static void main(String[] args) {
		// its working completely
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
/*driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
List<WebElement> count = driver.findElements(By.xpath("//div[@class='styles__CountryWrapper-sc-fehzzg-4 hjfJyH']/following-sibling::div/child::span"));
//System.out.println(count.size());	
for(int i=4;i<count.size();i++)
		
	{
		if(i>=4 && i<9)
		{
			System.out.println(count.get(i).getText());
		}
	}*/
	
	driver.get("https://www.amazon.in/");
	int choice=4;
	List<WebElement> items = driver.findElements(By.xpath("//li[.='digital content and devices']/following-sibling::li["+choice+"]"));
for(int i=1;i<=choice;i++)
{
	items.get(i).click();
}
	

	}
}
