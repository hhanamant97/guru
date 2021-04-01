package utility;

import java.io.File;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learn.guru.Baseguru;

@SuppressWarnings("deprecation")
public class Extentreport  {
	public ExtentReports Report;
	
	public static ExtentTest Extent;
	public void  get()
	{ 
		try {
		ExtentHtmlReporter extent = new ExtentHtmlReporter(
				new File(System.getProperty("user.dir") + "/ExtentReporter/GuruPages.html"));
		Report = new ExtentReports();
	 Report.attachReporter(extent);
	
		}catch(Exception e) {
			
		}
		
	}



}
