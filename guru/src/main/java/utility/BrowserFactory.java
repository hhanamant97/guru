package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startapp(WebDriver driver, String browserName, String url) {
		
		if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "F:\\velocity-pune\\2021\\guru\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "F:\\\\velocity-pune\\\\2021\\\\guru\\\\Driver\\\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("ie")){
			System.setProperty("webdriver.chrome.driver", "F:\\\\velocity-pune\\\\2021\\\\guru\\\\Driver\\\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
