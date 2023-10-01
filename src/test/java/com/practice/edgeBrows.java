package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class edgeBrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.in/");
 
	}
}
