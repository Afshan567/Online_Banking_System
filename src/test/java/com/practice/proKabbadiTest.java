package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class proKabbadiTest {

	public static void main(String[] args) {
		// its working completely
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		/*List<WebElement> matchs=driver.findElements(By.xpath("//p[.='Bengaluru Bulls']/../../../../descendant::p"));
		for(WebElement we:matchs)
		{
System.out.println(we.getText());


			
	}*/
		String team="Puneri Paltan";
/*List<WebElement> matchs = driver.findElements(By.xpath("//div[@class='table-body']/div/descendant::p[text()='"+team+"']/../../../following-sibling::div"));
//for(WebElement we:matchs)
{
	//System.out.print(we.getText()+"\t");
 }*/
String s[]=new String[7];
boolean flag=false;int j=0;
for(int i=1;i<=7;i++)
{
	//try {
	WebElement matchs = driver.findElement(By.xpath("//div[@class='table-body']/div/descendant::p[text()='"+team+"']/../../../following-sibling::div["+i+"]"));

s[j]=matchs.getText();
j++;
flag=true;
	//}

/*catch(Exception e)
{
	System.out.println("team u have entered is not there in list");
	break;
}*/
}
if(flag)
{
	/*System.out.println("team="+team);
	System.out.println("a="+s[0]);

 	System.out.println("a="+s[1]);
	System.out.println("a="+s[2]);
	System.out.println("a="+s[3]);
	System.out.println("a="+s[4]);
	System.out.println("a="+s[5]);
	System.out.println("a="+s[6]);*/
	
}
}
}