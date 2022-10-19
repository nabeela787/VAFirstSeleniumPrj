package pizzaHut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_HomePage {
	WebDriver driver;
	
	@FindBy (id = "menu") WebElement menu;
	@FindBy (xpath = "//div[contains(text(),'Pizza')]") WebElement pizza;
	
	public void clickMenu() {
		menu.click();
	}
	
	public void clickPizza() {
		pizza.click();
	}
	
	public PH_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
