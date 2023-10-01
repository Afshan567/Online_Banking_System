package com.practice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
public class jsonReadDataTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		JSONParser p=new JSONParser();
		Object obj=p.parse(new FileReader("./src/test/resources/jsonData.json"));
		JSONObject map=(JSONObject)obj;
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
	/*	String uname = (String) map.get("username");
		String pswd = (String) map.get("password");
 		String URL = (String) map.get("url");

		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//a[.='Staff Login']")).click();
			driver.findElement(By.name("staff_id")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pswd);
			driver.findElement(By.name("staff_login-btn")).click();
*/
	}

}
