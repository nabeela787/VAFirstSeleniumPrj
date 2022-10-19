package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/Flights");
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("d1-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@aria-label='Oct 6, 2022']")).click();
		driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022']")).click();

	}

}
