package pizzaHutTC;

import org.testng.annotations.Test;

import pizzaHut.pages.Drivers;
import pizzaHut.pages.PH_CartPage;
import pizzaHut.pages.PH_CreateYourOwnPage;
import pizzaHut.pages.PH_FirstPizzaPage;
import pizzaHut.pages.PH_HomePage;
import pizzaHut.pages.PH_SecondPizzaPage;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class OrderCheesePizzaTest {
	static WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver = Drivers.browsers("chrome");
	  driver.get("https://www.pizzahut.com/");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  }
  
  @Test (priority = 0)
  public void selectPizza() throws IOException {
	  PH_HomePage homePage = new PH_HomePage(driver);
	  homePage.clickMenu();
	  homePage.clickPizza();
	  
	  PH_FirstPizzaPage firstPizza = new PH_FirstPizzaPage(driver);
	  firstPizza.clickCheesePizza();
	  firstPizza.clickDelivery();
	  firstPizza.enterAddress();
	  firstPizza.clickSearchButton();
	  firstPizza.clickContinueButton();
	  
	  PH_SecondPizzaPage secondPizza = new PH_SecondPizzaPage(driver);
	  secondPizza.clickSelectYourOwnPizza();
	  
	  PH_CreateYourOwnPage createPizza = new PH_CreateYourOwnPage(driver);
	  createPizza.clickCrust();
	  createPizza.clickAddToOrder();;
	  
	  PH_CartPage cart = new PH_CartPage(driver);
	  cart.clickGoToCart();
	  
	  screenshots();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }
  
  public static void screenshots() throws IOException {
		Date ob = new Date();
		System.out.println(ob);
		String files = ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(files);
	File homeStPage =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(homeStPage, new File("C:\\Users\\Fatema Nabeela\\eclipse-workspace2\\VAproject.selenium\\Pictures\\" + files + "PizzaHutOrder.png"));
	}

}
