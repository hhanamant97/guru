package com.learn.guru;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;

import utility.BrowserFactory;
import utility.ConfigProperties;
import utility.ExcelDataProvider;
import utility.Extentreport;
import utility.Takescreen;

public class Baseguru {

	public static WebDriver driver;
	public static BrowserFactory bro;
	public static ConfigProperties config;
	public static ExcelDataProvider excel;
	
	
	
	
	   

	@BeforeSuite
	public void setupSuite() {
		config = new ConfigProperties();
		excel = new ExcelDataProvider();
		
	}


	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startapp(driver, config.readConfigProperties("Browser"),
				config.readConfigProperties("qaUrl"));
		
	}

	@AfterClass
	public void tearbrowser() {
		
		driver.close();
		
		
	}

	
	@AfterMethod
	public void  teardown(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			Takescreen.takeScreenshot(driver);
		}
		
		
	}
}
