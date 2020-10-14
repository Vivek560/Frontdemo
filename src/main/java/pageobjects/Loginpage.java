package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="user_name_entry_field")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;

	@FindBy(name="SubmitUser")
	private WebElement Loginbutton;
	

	public WebElement username() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}

	public WebElement Loginbutton() {
		return Loginbutton;
	}
	
}
