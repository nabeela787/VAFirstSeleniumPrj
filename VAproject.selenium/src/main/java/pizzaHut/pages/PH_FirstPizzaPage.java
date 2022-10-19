package pizzaHut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_FirstPizzaPage {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='MuiGrid-root']/div[2]/div[1]") WebElement cheesePizza;
	@FindBy(xpath = "//*[@data-testid='delivery-occasion-tab']") WebElement delivery;
	@FindBy(id = "w2-address") WebElement streetAddress;
	@FindBy(id = "w2-address2") WebElement apt;
	@FindBy(id = "w2-city") WebElement city;
	@FindBy(id = "w2-state") WebElement state;
	@FindBy(id = "w2-zip") WebElement zip;
	@FindBy(xpath = "//*[@data-testid='search']") WebElement searchButton;
	@FindBy(xpath = "//div[@class='MuiGrid-root jss496 MuiGrid-container']/div[2]/div/button") WebElement continueButton;
	
	public void clickCheesePizza() {
		cheesePizza.click();
	}
	
	public void clickDelivery() {
		delivery.click();
	}
	
	public void enterAddress() {
		streetAddress.sendKeys("2709 Fairmount Ave");
		apt.sendKeys("2nd Floor");
		city.sendKeys("Atlantic City");
		state.sendKeys("NJ");
		zip.sendKeys("08401");
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
	
	public PH_FirstPizzaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
