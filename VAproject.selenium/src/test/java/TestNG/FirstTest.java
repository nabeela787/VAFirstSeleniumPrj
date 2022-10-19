package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
	static WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  driver.navigate().to("https://www.amazon.com/");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void amazonKeys() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
	  
	  Actions obj = new Actions(driver);
		obj.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		obj.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		obj.keyUp(Keys.CONTROL);
		obj.sendKeys(Keys.DELETE).build().perform();		
		obj.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
