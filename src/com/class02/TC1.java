package com.class02;
/*
 * TC 1: HRMS Add Employee: 
 * Open chrome browser
 * Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
 * Login into the application
 * Click on Add Employee
 * Verify labels: Full Name, Employee Id, Photograph are displayed
 * Provide Employee First and Last Name
 * Verify Employee has been added successfully
 * Close the browser
 */

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utilities.CommonMethods;
import com.utilities.Constants;

public class TC1 extends CommonMethods{
	
	@BeforeMethod
	public void open() {
		setUp("chrome", Constants.HRMS_URL);
	}
	
	@Test
	public void loginApplication() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.name("Submit")).click();
	}
	
	@Test
	public void addingEmployee() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		SoftAssert softAssert = new SoftAssert();
		boolean fullNameIsDisplayed = driver.findElement(By.xpath("//div[@id='frmAddEmp']/fieldset/ol/li[1]/label")).isDisplayed();
		softAssert.assertTrue(fullNameIsDisplayed, "Full Name is NOT displayed");
		
		boolean employeeIDIsDisplayed = driver.findElement(By.name("employeeId")).isDisplayed();
		softAssert.assertTrue(employeeIDIsDisplayed, "Employee ID is NOT displayed");
		
		boolean photgraphIsDisplayed = driver.findElement(By.xpath("//div [@id= 'frmAddEmp']/fieldset/ol/li[3]/label[1]")).isDisplayed();
		softAssert.assertTrue(photgraphIsDisplayed, "Photograph is NOT displayed");
		
		softAssert.assertAll();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
