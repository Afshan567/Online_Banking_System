package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//driver.findElement(By.xpath("//a[text()='Try different image']")).click();
//Thread.sleep(5000);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
driver.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(5000);
List<WebElement> phones = driver.findElements(By.xpath("//div[@id='brandsRefinements']/descendant::span[@class='a-size-base a-color-base']"));
//System.out.println(phones.size());
String c="Nokia";
 List<WebElement> price = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']/descendant::span[@class='a-price-whole']"));
  	
  	
 for(int i=0;i<phones.size();i++)
 	{
 		if(phones.get(i).getText().contains(c))
 		{
 	 		phones.get(i).click();
 	 		
 	 	//after clicking particular mobile brand unable to check condition for<20k
 			price.get(i).getText();
 			
 		}
 			
 		
		
  		}
	
}
	
	}


