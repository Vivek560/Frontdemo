package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemInventoryLocationspage {

	WebDriver driver;
	
	public ItemInventoryLocationspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="loc_code")		
	private WebElement LocationcodeField;
	
	public WebElement Locatiocode() {
	return LocationcodeField;	
	}
	
	@FindBy(name="location_name")
	private WebElement LocationnameField;
	
	public WebElement Locationname(){
		return LocationnameField;
	}

	@FindBy(name="contact")
	private WebElement ContactDeliveriesField;

	public WebElement ContactDeliveries() {
	return ContactDeliveriesField;	
	}
	
	@FindBy(name="delivery_address")
	private WebElement AddressField;
	
	public WebElement Address() {
	return AddressField;
	}
	
	@FindBy(name="phone")
	private WebElement TelephoneField;
	
	public WebElement Telephone() {
	return TelephoneField;
	}
	
	@FindBy(name="phone2")
	private WebElement SecondaryphoneField;
	
	public WebElement Secondaryphonenumber() {
		return SecondaryphoneField;
	}
	
	@FindBy(xpath="//*[@name='fax']")
	private WebElement FaxField;
	
	public WebElement Fax() {
	return FaxField;	
	}
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement EmailField;
	
	public WebElement Email() {
	return EmailField;
	}
	
	@FindBy(xpath="//*[text()='Add new']")
	private WebElement Addnewbutton;
	
	public WebElement Addnew() {
	return Addnewbutton;	
	}
	
	@FindBy(xpath="//*[text()='Back']")
	private WebElement Backlink;

	public WebElement Back() {
	return Backlink;	
	}
	
}
