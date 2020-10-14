package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitsMeasurepage {
	
	WebDriver driver;
	public UnitsMeasurepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="abbr")
	WebElement UnitAbbrevationField;
	
	@FindBy(name="description")
	WebElement DesriptivenameField;
	
	@FindBy(name="decimals")
	WebElement Decimalplaces;
	
	@FindBy(xpath="//*[text()='Add new']")
	WebElement Addnewbutton;
	
	@FindBy(xpath="//*[text()='Back']")
	WebElement Backbutton;
	
	public WebElement UnitAbbrevationField() {
		return UnitAbbrevationField;
	}

	public WebElement DesriptivenameField() {
		return DesriptivenameField;
	}

	public WebElement Decimalplaces() {
		return Decimalplaces;
	}
	
	public WebElement Addnewbutton() {
		return Addnewbutton;
	}

	public WebElement Backbutton() {
		return Backbutton;
	}
}
