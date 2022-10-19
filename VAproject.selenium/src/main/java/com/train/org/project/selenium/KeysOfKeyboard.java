package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysOfKeyboard {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
		
		Actions obj = new Actions(driver);
		
		//Highlight the word
		obj.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(3000);
		
		//Copy
		obj.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(3000);
		
		//Release the key from ctrl
		obj.keyUp(Keys.CONTROL);
		
		//Delete
		obj.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(3000);
		
		//Paste
		obj.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		
	}	
}
