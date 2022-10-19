package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PizzaHut {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Nabeela\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Go to the Pizza Hut URL
		driver.get("https://www.pizzahut.com/");
		
		//Click on Menu
		WebElement menu = driver.findElement(By.id("menu"));
		menu.click();
		
		//Click on Pizza
		WebElement pizza = driver.findElement(By.xpath("//div[contains(text(),'Pizza')]"));
		pizza.click();
		
		Thread.sleep(3000);
		
		//Click on Cheese Pizza
		WebElement cheesePizza = driver.findElement(By.xpath("//div[@class='MuiGrid-root']/div[2]/div[1]"));
		cheesePizza.click();
		
		//Click on Delivery
		WebElement delivery = driver.findElement(By.xpath("//*[@data-testid='delivery-occasion-tab']"));
		delivery.click();
		
		//Input address information
		driver.findElement(By.id("w2-address")).sendKeys("2709 Fairmount Ave");
		driver.findElement(By.id("w2-address2")).sendKeys("2nd Floor");
		driver.findElement(By.id("w2-city")).sendKeys("Atlantic City");
		driver.findElement(By.id("w2-state")).sendKeys("NJ");
		driver.findElement(By.id("w2-zip")).sendKeys("08401");
		
		//Click on search
		WebElement searchButton = driver.findElement(By.xpath("//*[@data-testid='search']"));
		searchButton.click();
		
		Thread.sleep(3000);
		
		//Click on continue
		driver.findElement(By.xpath("//div[@class='MuiGrid-root jss496 MuiGrid-container']/div[2]/div/button")).click();
		
		Thread.sleep(10000);

		//Click Create Your Own Pizza
		driver.findElement(By.xpath("//*[@type='button' and @data-testid='localized-menu-tile-create-your-own']")).click();
		
		Thread.sleep(15000);
		
		//Click Crust
		driver.findElement(By.xpath("//h2[text()='Crust']")).click();
		
		Thread.sleep(5000);
		
		//Click Crust Size
		driver.findElement(By.xpath("//p[text()='Large']")).click();
		
		Thread.sleep(5000);
		
		//Click Crust Type
		driver.findElement(By.xpath("//p[text()='Original Stuffed Crust®']")).click();
		
		Thread.sleep(5000);
		
		//Click Add to Cart
		driver.findElement(By.xpath("//*[@data-testid='add-to-cart-button']")).click();
		
		Thread.sleep(5000);
		
		//Go to Cart
		driver.findElement(By.xpath("//*[@aria-label='Go to cart']")).click();
		
		Thread.sleep(5000);
		
//		screenshots();
		
	}
	
	public static void screenshots() throws IOException {
		File checkoutPage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(checkoutPage, new File("C:\\Users\\Fatema Nabeela\\eclipse-workspace\\project.selenium\\Pictures\\PizzaHutCheckout.jpg"));
	}

}
