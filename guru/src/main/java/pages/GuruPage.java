package pages;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuruPage {
	     WebDriver driver;

	    @FindBy(name="uid")
	    WebElement guguName;
	    
	    @FindBy(name="password")
	    WebElement password;
	    
	    @FindBy (name="btnLogin")
	    WebElement btnlogin;
	    
	    By user99GuruName = By.name("uid");

	    By password99Guru = By.name("password");

	    By titleText1 =By.className("barone");
	    By titleText =By.xpath("//h4[@class='barone']");

	    By login = By.name("btnLogin");

	    public GuruPage(WebDriver driver){

	       PageFactory.initElements(driver, this);
		
	    }

	    

	    //Click on login button

	    public void clickLogin(){

	    	// Locating search button and click on it
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(btnlogin));
			btnlogin.click();
			// driver.findElement(login).click();

	    }

	    //Get the title of Login Page

	    public String getLoginTitle(){

	     return    driver.findElement(titleText).getText();

	    }

	    /**

	     * This POM method will be exposed in test case to login in the application

	     * @param strUserName

	     * @param strPasword

	     * @return

	     */

	  
	    
	    public void loginpage(String userName, String pass) {
	    	try {
	    		Thread.sleep(3000);
	    		guguName.sendKeys(userName);
	    		password.sendKeys(pass);
	    		Thread.sleep(2000);
	    		btnlogin.click();
	    		//clickLogin();
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	    
	}


