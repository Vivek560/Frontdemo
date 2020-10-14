package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {

	WebDriver driver;	
	public Logoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Logout")
	WebElement Logout;
	
	public WebElement Logout(){
		return Logout;
	}	
	
}
