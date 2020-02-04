package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utilities.CommonMethods;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AssertionsDemo extends CommonMethods {
	@BeforeMethod
	public void openAndNavigate() {
		setUp("chrome", com.utilities.Constants.HRMS_URL);
	}

	@Test(enabled=true)
	public void titleValidation() {
		String expectedTitle = "Human Management Systems";
		String actualTitle = driver.getTitle();//Human Management System
		Assert.assertEquals(actualTitle, expectedTitle, "Titles are NOT matched");
		
//		if (actualTitle.equals(expectedTitle)) {
//			System.out.println("test pass");
//		} else {
//			System.out.println("test fails");
//		}
	}

	@Test(enabled=true)
	public void logoValidation() {
		boolean isDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		Assert.assertTrue(isDisplayed, "Syntax Logo is NOT displayed");
		//using if condition we cannot make testNG test failed
//		if (isDisplayed) {
//			System.out.println("test pass");
//		} else {
//			System.out.println("test fails");
//		}
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}