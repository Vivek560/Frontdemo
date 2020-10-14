package inventory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.ItemInventoryLocationspage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import resources.Base;

public class InventoryLocationsTest extends Base {
	
 public WebDriver driver;
	

	@BeforeClass
	public void Launchapplication() throws IOException {
		
		driver=Initializedriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test(priority=1)
	public void Login() throws InterruptedException {
		Loginpage login=new Loginpage(driver);
		login.username().sendKeys("qaplanet1");
		login.password().sendKeys("lab1");
		login.Loginbutton().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void Inventorylocation() throws InterruptedException {
		Homepage home=new Homepage(driver);
		home.ItemsandInventory().click();
		Thread.sleep(2000);
		home.InventoryLocations().click();
		ItemInventoryLocationspage location=new ItemInventoryLocationspage(driver);
		location.Locatiocode().sendKeys(prop.getProperty("Locationcode"));
		location.Locationname().sendKeys(prop.getProperty("LocationName"));
		location.ContactDeliveries().sendKeys(prop.getProperty("ContactDeliveries"));
		location.Address().sendKeys(prop.getProperty("Address"));
		location.Telephone().sendKeys(prop.getProperty("Telephone"));
		location.Secondaryphonenumber().sendKeys(prop.getProperty("Secondaryphone"));
		location.Fax().sendKeys(prop.getProperty("Fascimile"));
		location.Email().sendKeys(prop.getProperty("E-mail"));
		location.Addnew().click();
		Thread.sleep(2000);
		location.Back().click();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void Logout() {
		Logoutpage logout=new Logoutpage(driver);
		logout.Logout().click();
	}
	
	
	@AfterClass
	public void closure() {
		driver.close();
	}
}