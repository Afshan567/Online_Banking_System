package com.TestNGPractice;

import  static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public void hrdAssert()
	{
		System.out.println(" Step 1 ");
		String A="asdf";
		String B="asdf";
		int a=5,b=5;
		
		assertEquals(a, b);
		System.out.println(" step 2");
		 assertNotEquals(a, b);
		System.out.println("step 3");
		
		
	}
	@Test
	public void hrdAssert2()
	{
		int m=8;
		System.out.println("step 4");
		assertNotNull(m);
		assertNull(m);
		System.out.println("step 5");
		
			}
	
		
}
