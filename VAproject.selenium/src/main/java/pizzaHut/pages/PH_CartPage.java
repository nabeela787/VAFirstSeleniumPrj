package pizzaHut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_CartPage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@aria-label='Go to cart']") WebElement cartButton;
	
	public void clickGoToCart() {
		cartButton.click();
	}
	
	public PH_CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
