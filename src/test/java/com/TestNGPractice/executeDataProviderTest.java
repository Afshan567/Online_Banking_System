package com.TestNGPractice;

import org.testng.annotations.Test;

public class executeDataProviderTest {

	@Test(dataProviderClass = usingDataProviderTest.class,dataProvider = "tv")
	public void getData(String prdtname,String price,String size)
	{
		System.out.println(prdtname+"===="+price+"==="+size);
	}
}
