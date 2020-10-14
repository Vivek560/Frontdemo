package salespack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import pageobjects.SalesTypepage;
import resources.Base;

public class SalesTypeTest extends Base{

	public WebDriver driver;
	
	
	@BeforeClass
	public void Launchapplication() throws IOException {
		
		driver=Initializedriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test(priority=1)
	public void Login() throws InterruptedException {
		
		Loginpage login=new Loginpage(driver);
		login.username().sendKeys(prop.getProperty("username"));
		login.password().sendKeys(prop.getProperty("password"));
		login.Loginbutton().click();
		Thread.sleep(3000);
	}

	@Test(priority=2)
	public void Addsalestype() throws InterruptedException {
		Homepage home=new Homepage(driver);
		Thread.sleep(2000);
		home.Sales().click();
		Thread.sleep(3000);
		home.SalesType().click();
		
		SalesTypepage saletype=new SalesTypepage(driver);
		saletype.Salestypename().sendKeys(prop.getProperty("salestype"));
		
		Actions A=new Actions(driver);
		A.doubleClick(saletype.Calculationfactor()).build().perform();
		saletype.Calculationfactor().sendKeys(prop.getProperty("Calculationfactor"));
		saletype.Taxincluded().click();
		
		saletype.Addnewbutton().click();
		
		Thread.sleep(2000);
		
		saletype.Backbutton().click();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void Logout() throws InterruptedException{
		Logoutpage logout=new Logoutpage(driver);	
		Thread.sleep(3000);
		logout.Logout().click();
	}
	
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
