package com.TestNGPractice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sampleClass1Test extends sampleClass2Test {
	@BeforeSuite
	public void BS()
	{
		System.out.println("Connect to DB");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("login to application");
	}
	@BeforeClass
public void BC()
{
		System.out.println("Launch the browser");
}
	@AfterClass
	public void AC()
	{
		System.out.println("Close the browser");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("logout from application");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("Disconnect from DB");
	}
	@Test
	public void demo()
	{
		System.out.println("Testscript 1");
	}
	@Test
	public void display()
	{
		System.out.println("Test script 2");
	}
}
