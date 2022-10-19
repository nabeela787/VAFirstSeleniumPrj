package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(linkText = "Books") WebElement books;
	@FindBy(id = "nav-logo-sprites") WebElement logo;
	@FindBy(id = "twotabsearchtextbox") WebElement searchField;
	@FindBy(id = "nav-search-submit-button") WebElement searchButton;
	
	public void booksLink() {
		books.click();
	}
	
	public void clickLogo() {
		logo.click();
	}
	
	public void searchFieldKeys() {
		searchField.sendKeys("computers");
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
