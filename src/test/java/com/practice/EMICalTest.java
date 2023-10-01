package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EMICalTest {
public static void main(String[] args) throws Throwable {
	//unable to capture tip tool text
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://emicalculator.net/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//int i=4;
	Actions act=new Actions(driver);
	act.scrollByAmount(0, 1300).perform();
	WebElement dot = driver.findElement(By.xpath("//div[@id='emibarchart']//*[name()='svg']//*[name()='g' and @class='highcharts-markers highcharts-series-2 highcharts-spline-series highcharts-tracker']//*[name()='path' and @fill='#B8204C'][4]"));
	  act.moveToElement(dot).perform();
//Thread.sleep(3000);
	/*List<WebElement> msg = driver.findElements(By.xpath("//div[@id='highcharts-tazycvk-4']//*[name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='tspan']"));
 	for(WebElement we:msg)
 	{
 		System.out.println(we.getText());
 	}*/
 	}
}


