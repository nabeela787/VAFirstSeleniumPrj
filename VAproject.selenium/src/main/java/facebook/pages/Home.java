package facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass")	WebElement password;
	@FindBy(id = "u_0_5_Ox") WebElement loginButton;
	
	public void enterEmail(String name) {
		email.clear();
		email.sendKeys(name);
	}
	
	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
