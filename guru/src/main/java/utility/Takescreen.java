package utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Takescreen{

	public static void takeScreenshot(WebDriver driver) {
		 File sou = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
		 File Dest= new File("F:\\velocity-pune\\2021\\guru\\Takescreen\\guru.jpg");
		 FileUtils.copyFile(sou,Dest); 
		 }catch(Exception e) {
			 System.out.println("Unable to capture screenshot "+e.getMessage());
		 }
	}
	
	
	public static String getCurrentDateTime() {
		
		DateFormat cuformat= new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate= new Date();
		
		return cuformat.format(currentDate);
		
		
		
	}
	
}
