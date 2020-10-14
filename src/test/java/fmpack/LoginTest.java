package fmpack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import resources.Base;

public class LoginTest extends Base{
	
	public WebDriver driver;

	@BeforeMethod
	public void Launchapplication() throws IOException, InterruptedException {
		
	 driver=Initializedriver();
	 driver.get(prop.getProperty("url"));
	 Thread.sleep(3000);
	}

	
	@Test(dataProvider="logindata")
	public void Login(String user,String pass,String ExpectedResult) throws InterruptedException {
	Loginpage login=new Loginpage(driver);
	login.username().sendKeys(user);
	login.password().sendKeys(pass);
	login.Loginbutton().click();
	
	Thread.sleep(2000);
	
	Homepage home=new Homepage(driver);	
	
	String actualresult = null;
	
	try {
	if(home.Sales().isDisplayed()) {
		actualresult="Succesful";
	}	}
	
	catch(Exception e) {
		actualresult="failure";
		}
	
	Assert.assertEquals(actualresult,ExpectedResult);
	}
	
	@DataProvider
	public Object[][] logindata() {
	
	Object[][] credentials= {{"qaplanet1","lab1","Succesful"},{"qaplanet1","lab","failure"}};	
	
	return credentials;
	
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	
}
