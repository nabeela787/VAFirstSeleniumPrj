package pizzaHut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_CreateYourOwnPage {
	WebDriver driver;
	
	@FindBy(xpath = "//h2[text()='Crust']") WebElement crust;
	@FindBy(xpath = "//p[text()='Large']") WebElement crustSize;
	@FindBy(xpath = "//p[text()='Original Stuffed Crust®']") WebElement crustType;
	@FindBy(xpath = "//span[text()='add to order']") WebElement addToOrderButton;
	
	public void clickCrust() {
		crust.click();
		crustSize.click();
		crustType.click();
	}
	
	public void clickAddToOrder() {
		addToOrderButton.click();
	}
	
	public PH_CreateYourOwnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
