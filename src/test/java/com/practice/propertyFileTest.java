package com.practice;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyFileTest {

	public static void main(String[] args) throws Throwable {
//step 1:object representation of physical file
		FileInputStream fl = new FileInputStream(".\\src\\test\\resources\\commonData.properties");
 		// step 2: object to property class
		Properties pr=new Properties();
		
		//step 3: load the keys
		pr.load(fl);
		
		//step 4:use getProperty to fetch the values by passing keys
		String Browse = pr.getProperty("browser");
		String URL = pr.getProperty("url");
		String uname = pr.getProperty("username");
String pswd = pr.getProperty("password");
System.out.println(Browse);
System.out.println(URL);
System.out.println(uname);
System.out.println(pswd);


	}

}
