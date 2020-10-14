package inventory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import pageobjects.UnitsMeasurepage;
import resources.Base;

public class UnitsMeasureTest extends Base {
	
	
 public WebDriver driver;
	
	@BeforeClass
	public void Launchapplication() throws IOException {
		driver=Initializedriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(priority=1)
	public void Login() {
		Loginpage login=new Loginpage(driver);
		login.username().sendKeys(prop.getProperty("username"));
		login.password().sendKeys(prop.getProperty("password"));
		login.Loginbutton().click();
	}

	@Test(priority=2)	
	public void AddUnitofMeasure() throws InterruptedException {
		Homepage home=new Homepage(driver);
		home.ItemsandInventory().click();
		Thread.sleep(2000);
		home.UnitsofMeasure().click();
		UnitsMeasurepage unit=new UnitsMeasurepage(driver);
		unit.UnitAbbrevationField().sendKeys(prop.getProperty("UnitAbbrevation"));
		unit.DesriptivenameField().sendKeys(prop.getProperty("Descriptivename"));
		
		Select Decimalplaces=new Select(unit.Decimalplaces());
		Decimalplaces.selectByValue(prop.getProperty("Decimalplaces"));
		
		unit.Addnewbutton().click();
		Thread.sleep(2000);
		unit.Backbutton().click();
	
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
