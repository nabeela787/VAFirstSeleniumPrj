package com.train.org.project.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsStatements {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Best Sellers")));

	}

}
