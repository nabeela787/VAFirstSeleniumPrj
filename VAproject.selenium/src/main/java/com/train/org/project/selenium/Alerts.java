package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Click Button to see alert
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//On button click, confirm box will appear
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		
		//On button click, prompt box will appear
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("John");
		driver.switchTo().alert().accept();
	}

}
