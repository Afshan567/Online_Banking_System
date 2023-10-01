package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jioMartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.jiomart.com/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
/*WebElement groceries = driver.findElement(By.xpath("//a[text()='Groceries']"));
Actions act=new Actions(driver);
act.moveToElement(groceries).perform();*/
/*WebElement fnv = driver.findElement(By.xpath("//a[text()='Fruits & Vegetables']"));
act.moveToElement(fnv).perform();
List<WebElement> lst = driver.findElements(By.xpath("//a[text()='Fruits & Vegetables']/../descendant::a[@class='header-nav-l3-item-link']"));
	for(WebElement we:lst)
	{
		System.out.println(we.getText());
	}*/
/*int choice=4;
List<WebElement> items = driver.findElements(By.xpath("//a[.='Fruits & Vegetables']/../../descendant::a[@class='header-nav-l2-item-link']"));
driver.findElements(By.xpath("//a[.='Fruits & Vegetables']/../../descendant::a[@class='header-nav-l2-item-link']/../descendant::a[@class='header-nav-l3-item-link']"));
		
		for(int i=0;i<items.size();i++)
{
			if(choice<=items.size())
 	{
		
	}
}*/
String premiumfrt="Home &";
String subfruit="Disposables";
WebElement premiumfruit = driver.findElement(By.xpath("//a[contains(text(),'"+premiumfrt+"')]/parent::li[@class='header-nav-l1-item']"));
Actions act = new Actions(driver);
act.moveToElement(premiumfruit).perform();
WebElement frt = driver.findElement(By.xpath("//a[.='"+subfruit+"']/parent::li[@class='header-nav-l2-item']"));
act.moveToElement(frt).perform();

List<WebElement> lst = driver.findElements(By.xpath("//a[contains(text(),'"+premiumfrt+"')]/parent::li[@class='header-nav-l1-item']/descendant::a[.='"+subfruit+"']/ancestor::li[@class='header-nav-l2-item']/descendant::ul/li/a"));
for(WebElement we:lst)
{
	System.out.println(we.getText());
	
}

	}
	}


