package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}


	@FindBy(linkText="Sales")
	private WebElement Sales;
	
	@FindBy(linkText="Sales Types")
	private WebElement SalesType;
	
	@FindBy(linkText="Sales Persons")
	private WebElement Salesperson;
	
	@FindBy(linkText="Sales Areas")
	private WebElement SalesAreas;
	
	@FindBy(linkText="Items and Inventory")
	private WebElement ItemsandInventory;
	
	@FindBy(linkText="Inventory Locations")
	private WebElement InventoryLocations;
	
	@FindBy(linkText="Units of Measure")
	private WebElement UnitsofMeasure;
	
	public WebElement Sales() {
		return Sales;
	}
	
	public WebElement SalesType() {
		return SalesType;
	}

	public WebElement Salesperson() {
		return Salesperson;
	}
	
	public WebElement SalesAreas() {
		return SalesAreas;
	}
	
	public WebElement ItemsandInventory() {
		return ItemsandInventory;
	}

	public WebElement InventoryLocations() {
		return InventoryLocations;
	}

	public WebElement UnitsofMeasure() {
		return UnitsofMeasure;
	}
	
}
