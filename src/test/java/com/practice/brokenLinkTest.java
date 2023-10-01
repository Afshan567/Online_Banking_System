package com.practice;

 import java.net.URL;
import java.time.Duration;
 import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinkTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		int count = 0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.ksrtc.in/oprs-web/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
List<WebElement> listlink = driver.findElements(By.xpath("//a"));
System.out.println(listlink);
System.out.println(listlink.size());
ArrayList<String> link = new ArrayList<String>();
for(int i=0;i<listlink.size();i++)
{
String eachlink = listlink.get(i).getAttribute("href");	
URL url=null;
int statusCode = 0;
try {
	url=new URL(eachlink);
HttpsURLConnection httpcon=(HttpsURLConnection)url.openConnection();
statusCode=httpcon.getResponseCode();
if(statusCode>=400)
{
	count++;
	link.add(eachlink);
	
	System.out.println(eachlink);
}
}
catch(Exception e)
{
	link.add(eachlink);
	
}
}
System.out.println("no of broken links "+count);


	}

}
