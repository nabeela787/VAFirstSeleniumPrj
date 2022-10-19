package com.train.org.project.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
	static WebDriver driver;
	
	public static void main(String[] args) {
		browsers("Edge");
	}
	
	public static void browsers(String nameOfBrowsers) {
		if (nameOfBrowsers.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (nameOfBrowsers.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

}
