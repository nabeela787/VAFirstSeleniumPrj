package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KindleEbooks {
	WebDriver driver;
	
	@FindBy(linkText = "Kindle eBooks") WebElement kEbooks;
	
	public void kEbooksClick() {
		kEbooks.click();
	}
	
	public KindleEbooks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
