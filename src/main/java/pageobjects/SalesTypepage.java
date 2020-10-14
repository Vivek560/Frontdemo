package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesTypepage {

		WebDriver driver;
		
	public SalesTypepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(name="sales_type")
	WebElement Salestypename;

	
	@FindBy(xpath="//*[@name='factor']")
	WebElement Calculationfactor;
	
	@FindBy(xpath="//*[@name='tax_included']")
	WebElement Taxincluded;
	
	@FindBy(xpath="//*[text()='Add new']")
	WebElement Addnewbutton;
	
	@FindBy(xpath="//*[text()='Back']")
	WebElement Backbutton;
	
	public WebElement Salestypename() {
		return Salestypename;
	}

	public WebElement Calculationfactor() {
		return Calculationfactor;
	}

	public WebElement Taxincluded() {
		return Calculationfactor;
	}
	
	public WebElement Addnewbutton() {
		return Addnewbutton;
	}

	public WebElement Backbutton() {
		return Backbutton;
	}
}
