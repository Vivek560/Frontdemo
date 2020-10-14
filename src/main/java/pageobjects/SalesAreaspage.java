package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesAreaspage {
	WebDriver driver;
	
	public SalesAreaspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='description']")
	WebElement Areaname;
	
	@FindBy(xpath="//*[text()='Add new']")
	private WebElement Addbutton;
	
	@FindBy(xpath="//*[text()='Back']")
	private WebElement Backbutton;
	
	public WebElement Areaname() {
		return Areaname;
	}

	public WebElement Add() {
		return Addbutton;
	}
	
	public WebElement Back() {
		return Backbutton;
	}

}
