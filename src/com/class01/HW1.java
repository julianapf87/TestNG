package com.class01;

import com.utilities.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utilities.CommonMethods;

/*
 * TC 1: HRMS Application Login:
 * 1. Open chrome browser
 * 2. Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
 * 3. Enter valid username and password 
 * 4 .Click on login button
 * 5. Then verify Syntax Logo is displayed
 * 6. Close the browser
 */
public class HW1 extends CommonMethods{
	@BeforeMethod
	public void openbrowser () {
		setUp("chrome",Constants.HRMS_URL);
	}
	
	@AfterMethod
	public void tearDown () {
		driver.close();
	}
	
	@Test
	public void validLogin () {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Syntax@123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Test
	public void displayedLogo () {
		boolean logoIsDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		if (logoIsDisplayed) {
			System.out.println("Test has passed");
		} else {
			System.out.println("Test has failed");
		}
	}
	
	
}
