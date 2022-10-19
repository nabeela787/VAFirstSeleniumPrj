package common;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Utilities {
	public static WebDriver driver;
	
	@Parameters({"browsers", "url"})
	@BeforeTest
	public void browsers(String nameOfBrowsers, String url) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		if (nameOfBrowsers.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} else if (nameOfBrowsers.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);;
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);;
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}
	}

  @AfterTest
  public void afterTest() throws IOException {
//	  screenshots();
	  
//	  driver.close();
  }
  
  public static void screenshots() throws IOException {
		Date ob = new Date();
		System.out.println(ob);
		String files = ob.toString().replace(" ", "_").replace(":", "_");
		System.out.println(files);
	File homeStPage =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(homeStPage, new File("C:\\Users\\Fatema Nabeela\\eclipse-workspace\\project.selenium\\Pictures\\" + files + "_Home.png"));
	}

}
