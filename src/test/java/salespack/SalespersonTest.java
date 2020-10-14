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
import pageobjects.Salesperson;
import resources.Base;

public class SalespersonTest extends Base{
	
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
	public void AddSalesPersons() throws InterruptedException {
		Homepage home=new Homepage(driver);
		home.Sales().click();
		home.Salesperson().click();
		
		Salesperson sale=new Salesperson(driver);
		sale.Salespersonname().sendKeys(prop.getProperty("salesperson"));
		sale.TelephonenumberField().sendKeys(prop.getProperty("Telephone"));
		sale.FaxnumberField().sendKeys(prop.getProperty("Faxnumber"));
		sale.EmailField().sendKeys(prop.getProperty("E-mail"));
		
		Actions A=new Actions(driver);
		A.doubleClick(sale.provisionField()).build().perform();
		sale.provisionField().sendKeys(prop.getProperty("provision"));
	
		A.doubleClick(sale.TurnoverBreakField()).build().perform();
		sale.TurnoverBreakField().sendKeys(prop.getProperty("TurnoverBreak"));
		
		A.doubleClick(sale.provision2Field()).build().perform();
		sale.provision2Field().sendKeys(prop.getProperty("provision2"));

		sale.Addnewbutton().click();
		
		Thread.sleep(2000);
		
		sale.Backbutton().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=3)
	public void Logout() {
		Logoutpage logout=new Logoutpage(driver);	
		logout.Logout().click();
	}
	
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
