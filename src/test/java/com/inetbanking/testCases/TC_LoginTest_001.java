package com.inetbanking.testCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException 
	{
			
		/*logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}*/String after ="after:2024/1/1";
	String before ="before:2024/1/31";
		//Login , 
		driver.findElement(By.xpath("//span[contains(text(),'Jan 30')]"));
		//driver.findElement("//*[@name='q']").sendKeys(after + " " + before);
		driver.findElement(By.xpath("//*[@id=\':14a\']/div[1]/span")).click();
		
		}
}
