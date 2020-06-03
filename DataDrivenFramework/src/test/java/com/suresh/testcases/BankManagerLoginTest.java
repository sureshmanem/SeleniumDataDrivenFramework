package com.suresh.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.suresh.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		//verifyEquals("abc", "xyz");
		//Thread.sleep(3000);
		log.debug("Inside Bank Manager Login Test");
		
		click("bmlBtn_CSS");

		AssertJUnit.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))));
		
		log.debug("Completed Bank Manager Login Test");
		
		//Assert.fail("Login not successful");
	}	
}
