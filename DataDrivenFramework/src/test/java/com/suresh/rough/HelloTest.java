package com.suresh.rough;

import org.testng.annotations.Test;

import com.suresh.base.TestBase;

public class HelloTest extends TestBase{
	
	@Test
	public void helloTest() {
		System.out.println("The title is "+driver.getTitle());
		log.debug("Hello Test executed");
	}
}
