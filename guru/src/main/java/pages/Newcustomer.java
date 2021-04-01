package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.Extentreport;

public class Newcustomer {
	WebDriver driver;
	public Extentreport ex=new Extentreport();
	public static Extentreport extentreport =new Extentreport();
	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement cu;

	@FindBy(xpath = "//input[@name='name']")
	WebElement cuName;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement address;

	@FindBy(xpath = "//input[@id='dob']")
	WebElement dropDownBoD;

	@FindBy(xpath = "//input[@type='radio']")
	WebElement mfRadioBtn;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//input[@name='state']")
	WebElement state;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pin;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement telephone;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;

	public Newcustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickNew() {
		try {
			Thread.sleep(3000);
			cu.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * customer id 	61687
	 */
	
	
	public void createCustAccount() {
		try {
			Thread.sleep(3000);
			cuName.sendKeys("yogesh");
			// clickRadioBtn("F");
			dropDownBoD.sendKeys("31-03-2021");
			
			address.sendKeys("Pune Wakad");
			city.sendKeys("Pune");
			state.sendKeys("Maharastra");
			pin.sendKeys("411409");
			telephone.sendKeys("9421790901");
			email.sendKeys("yogesh@gmail.com");
			password.sendKeys("abcdefgh98");
			submit.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

	

}