package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
static WebDriver driver;
	
	public static void main(String[] args) throws IOException{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		screenshots();

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
