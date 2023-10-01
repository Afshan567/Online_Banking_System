package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricketTest {

	public static void main(String[] args) {
		// its working completely
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> matchs=driver.findElements(By.xpath("//tbody/tr[*]/td[3][@class='table-body__cell u-center-text' and text()<40]/preceding-sibling::td[1]"));
		System.out.println(matchs.size()+" are the countries who played less than 40 matches, below are their names");
		
		for(WebElement we:matchs)
		{
System.out.println(we.getText());


			
	}
 
}
}