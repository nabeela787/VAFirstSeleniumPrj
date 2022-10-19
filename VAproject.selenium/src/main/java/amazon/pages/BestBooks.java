package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBooks {
	WebDriver driver;
	
	@FindBy (linkText = "Best Books of 2022 so Far") WebElement bestBooks;
	
	public void bestBooksLink() {
		bestBooks.click();
	}
	
	public BestBooks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
