package com.train.org.project.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowSwitch {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement bestSellers = driver.findElement(By.linkText("Best Sellers"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).build().perform();
		bestSellers.click();
		act.keyUp(Keys.SHIFT).build().perform();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		
		String mainWindow = iterator.next();
		String childWindow = iterator.next();
		
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
}
