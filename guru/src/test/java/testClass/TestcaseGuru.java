package testClass;

import org.testng.annotations.Test;
import pages.GuruPage;
import pages.Guruasert;
import pages.Newcustomer;
import com.learn.guru.Baseguru;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;

@Listeners(com.learn.guru.Listeners.class)

public class TestcaseGuru extends Baseguru {
	GuruPage objLogin;
	Newcustomer cu;
	Guruasert objHomePage;
	static JavascriptExecutor js;

	/*
	 * This test case will login in http://demo.guru99.com/V4/
	 */

	@Test()
	public void test_Home_Page_Appear_Correct() throws InterruptedException {
		objLogin = new GuruPage(driver);
		js = (JavascriptExecutor) driver;
		getRunTimeInfoMessage("info","browser open");
		objLogin.loginpage(excel.getStringData("data", 0, 0), excel.getStringData("data", 0, 1));
		
//		cu = new Newcustomer(driver);
//		cu.clickNew();
//		cu.createCustAccount();

	}
	public static void getRunTimeInfoMessage(String messageType, String message) throws InterruptedException {
		// Check for jQuery on the page, add it if need be
		js.executeScript("if (!window.jQuery) {"
				+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
				+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
				+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
		Thread.sleep(5000);

		// Use jQuery to add jquery-growl to the page
		js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

		// js.executeScript("$.getScript('/Users/NaveenKhunteta/Documents/workspace/Test/src/testcases/jquery.growl.js')");

		// Use jQuery to add jquery-growl styles to the page
		js.executeScript("$('head').append('<link rel=\"stylesheet\" "
				+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
		Thread.sleep(5000);

		// jquery-growl w/ no frills
		js.executeScript("$.growl({ title: 'GET', message: '/' });");
		
		if(messageType.equals("error")){
			js.executeScript("$.growl.error({ title: 'ERROR', message: '"+message+"' });");
		}else if(messageType.equals("info")){
			js.executeScript("$.growl.notice({ title: 'Notice', message: '"+message+"' });");
		}else if(messageType.equals("warning")){
			js.executeScript("$.growl.warning({ title: 'Warning!', message: '"+message+"' });");
		}

		// jquery-growl w/ colorized output
//		js.executeScript("$.growl.error({ title: 'ERROR', message: 'Some exception is coming' });");
//		js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
//		js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
	}


	@Test()
	public void testNew() {

	}

}
