package com.learn.guru;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Takescreen;

public class Listeners extends Baseguru implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test start  "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test Failed "+result.getName());
		if (result.getStatus()==ITestResult.FAILURE) {
			Takescreen.takeScreenshot(driver);
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test Success "+result.getName());
	}

	

	

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
