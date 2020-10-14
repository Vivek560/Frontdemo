package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Salesperson{

	
WebDriver driver;
	
	public Salesperson(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='salesman_name']")
	WebElement Salespersonname;
	
	@FindBy(xpath="//*[@name='salesman_phone']")
	WebElement TelephonenumberField;
	
	@FindBy(xpath="//*[@name='salesman_fax']")
	WebElement FaxnumberField;
	
	@FindBy(xpath="//*[@name='salesman_email']")
	WebElement EmailField;

	@FindBy(xpath="//*[@name='provision']")
	WebElement provisionField;

	@FindBy(xpath="//*[@name='break_pt']")
	WebElement TurnoverBreakField;
	
	@FindBy(xpath="//*[@name='provision2']")
	WebElement provision2Field;
	
	@FindBy(xpath="//*[text()='Add new']")
	WebElement Addnewbutton;
	
	@FindBy(xpath="//*[text()='Back']")
	WebElement Backbutton;
	
	public WebElement Salespersonname() {
		return Salespersonname;
	}

	public WebElement TelephonenumberField() {
		return TelephonenumberField;
	}

	public WebElement FaxnumberField() {
		return FaxnumberField;
	}
	
	public WebElement EmailField() {
		return EmailField;
	}

	public WebElement provisionField() {
		return provisionField;
	}


	public WebElement TurnoverBreakField() {
		return TurnoverBreakField;
	}

	public WebElement provision2Field() {
		return provision2Field;
	}
	
	public WebElement Addnewbutton() {
		return Addnewbutton;
	}

	public WebElement Backbutton() {
		return Backbutton;
	}
}
