package com.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 {

	@BeforeClass
	public void beforeA() {
		System.out.println("Before A");
	}
	
	@AfterClass
	public void afterA() {
		System.out.println("After A");
	}
	
	@BeforeMethod
	public void methodA() {
		System.out.println("Method A");
	}
	
	@AfterMethod
	public void methodAfterA() {
		System.out.println("Method after A");
	}
	
	@Test
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@Test
	public void afterTest() {
		System.out.println("After Test");
	}
	
}
