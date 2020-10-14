package salespack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Logoutpage;
import pageobjects.SalesAreaspage;
import resources.Base;

public class SalesAreasTest extends Base {
	
	
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
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void SalesArea() throws InterruptedException {
		Homepage home=new Homepage(driver);
		home.Sales().click();
		Thread.sleep(3000);
		home.SalesAreas().click();
		SalesAreaspage salearea=new SalesAreaspage(driver);
		salearea.Areaname().sendKeys(prop.getProperty("SalesAreaname"));
		salearea.Add().click();
		Thread.sleep(2000);
		salearea.Back().click();
		Thread.sleep(3000);
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
