package com.class01;
/*
 * 
 * TC 2: HRMS Application Negative Login: 
 * 1. Open chrome browser
 * 2. Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
 * 3. Enter valid username
 * 4. Leave password field empty
 * 5. Verify error message with text “Password cannot be empty” is displayed.
 */

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.utilities.CommonMethods;
import com.utilities.Constants;

public class HW2 extends CommonMethods {

	@BeforeMethod
	public void openBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void validLogin() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		boolean errorDisplayed = driver.findElement(By.id("spanMessage")).isDisplayed();
		if (errorDisplayed) {
			System.out.println("Please enter a password");
		}else {
			System.out.println("You've entered");
		}
	}
}
