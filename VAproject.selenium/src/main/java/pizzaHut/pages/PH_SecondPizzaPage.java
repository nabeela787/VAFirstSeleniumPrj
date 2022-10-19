package pizzaHut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_SecondPizzaPage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@type='button' and @data-testid='localized-menu-tile-create-your-own']") WebElement createPizza;
	
	public void clickSelectYourOwnPizza() {
		createPizza.click();
	}
	
	public PH_SecondPizzaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
