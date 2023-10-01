package com.practice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class spiceJetTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
WebDriver driver = new ChromeDriver(opt);
driver.manage().window().maximize();
driver.get("https://www.spicejet.com/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='round trip']")).click();
driver.findElement(By.xpath("//div[text()='From']")).click();
driver.findElement(By.xpath("//div[text()='DEL']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='AMD']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
 //date is not getting clicked though the xpath is correct
//driver.findElement(By.xpath("//div[contains(text(),'September')]/parent::div[@class='css-1dbjc4n r-k8qxaj']/child::div[text()='2023']/../../descendant::div[text()='25']")).click();
driver.findElement(By.xpath("//div[contains(text(),'September') and text()='2023']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[text()='29']")).click();
/*for(;;)
{
	try {
		 driver.findElement(By.xpath("//div[contains(text(),'Sept') and text()='2023']/../../descendant::div[text()='22']"));
break;
	}
	//shd work from here
	catch(Exception e)
	{
}
driver.findElement(By.xpath("//div[text()='Return Date']")).click();
driver.findElement(By.xpath("//div[contains(text(),'December')]/../../descendant::div[text()='15']")).click();
 //unable to find unique element for nextarrow*/

/*for(;;)
{
	try {

driver.findElement(By.xpath("//div[contains(text(),'November')]/./../../descendant::div[text()='24']")).click();
break;
}
	catch(Exception e)
	{
		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-picker']/..//*[name()='svg']//*[name()='g' and @transform='translate(1 1)']//*[name()='path' and @fill='#A0A0A0']")).click();
	}
}*/
driver.findElement(By.xpath("//div[.='Return Date']")).click();
	}
	}


