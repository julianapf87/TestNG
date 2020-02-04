package com.utilities;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	public void onTestStart (ITestResult result) {
		System.out.println("Test started");
	}
	
	public void onTestSuccess (ITestResult result) {
		System.out.println("Test passed"+result.getName());
		CommonMethods.takeScreenshot("passed/"+result.getName());
	}
	
	public void onTestFailure (ITestResult result ) {
		System.out.println("Test failed"+"failed"+result.getName());
		CommonMethods.takeScreenshot("failed/"+result.getName());
	}
}
