package com.train.org.project.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Nabeela\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		
		String window = driver.getWindowHandle();
		System.out.println(window);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		driver.quit();
	}

}
