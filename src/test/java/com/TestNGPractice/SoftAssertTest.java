package com.TestNGPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

@Test
public void sftAsrt()
{
	SoftAssert sa = new SoftAssert();

	System.out.println("step 1");
	int a=9, b=8;
	sa.assertEquals(a, b);
	System.out.println("step 2");
	sa.assertNotEquals(a, b);
	System.out.println("step 3");
	sa.assertAll();

 }
@Test
public void sftAsrt2()
{
	SoftAssert sa1 = new SoftAssert();

	System.out.println("step 4");
	sa1.assertEquals(3,3);
	sa1.assertAll();

}

}
