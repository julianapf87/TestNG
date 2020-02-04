package com.class02;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.utilities.CommonMethods;
import com.utilities.Constants;

public class TC2Practice extends CommonMethods {

	@BeforeMethod
	public void browser() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test (enabled = true)
	public void AddingEmployee() {
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Syntax@123");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	
	boolean fullNameIsDisplayed = driver.findElement(By.xpath("//label[@class = 'hasTopFieldHelp']")).isDisplayed();

	
	}

}
