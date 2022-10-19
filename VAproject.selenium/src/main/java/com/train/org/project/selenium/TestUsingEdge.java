package com.train.org.project.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUsingEdge {
	static WebDriver driver;
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Fatema Nabeela\\eclipse-workspace\\project.selenium\\Drivers\\msedgedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

}
