package com.train.org.project.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Nabeela\\eclipse-workspace\\project.selenium\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		/*Log In
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("pnt@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234567");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		*/
		
		/*Forgot Password
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));
		forgotPassword.click();
		*/
		
		//Create New Account
//		WebElement createAnAccount = driver.findElement(By.linkText("Create new account"));
//		createAnAccount.click();
//		Thread.sleep(6000);
//		
//		WebElement firtName = driver.findElement(By.name("firstname"));
//		firtName.sendKeys("John");
//		WebElement lastName = driver.findElement(By.name("lastname"));
//		lastName.sendKeys("Doe");
//		WebElement phoneNumber = driver.findElement(By.name("reg_email__"));
//		phoneNumber.sendKeys("123467890");
//		WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
//		newPassword.sendKeys("abcefg");
//		
//		WebElement month = driver.findElement(By.name("birthday_month"));
//		Select monthObj = new Select(month);
//		monthObj.selectByIndex(5);
//		
//		WebElement days = driver.findElement(By.name("birthday_day"));
//		Select daysObj = new Select(days);
//		daysObj.selectByValue("6");
//		
//		WebElement year = driver.findElement(By.name("birthday_year"));
//		Select yearObj = new Select(year);
//		yearObj.selectByVisibleText("1998");
//		
//		List<WebElement> radioButton = driver.findElements(By.className("_58mt"));
//		for (WebElement e : radioButton) {
//			if (e.getText().equalsIgnoreCase("Female")) {
//				e.click();
//			}
//		}
//		
//		WebElement gender = driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']"));
//		gender.click();
//		
//		WebElement signUpButton = driver.findElement(By.name("websubmit"));
//		signUpButton.click();
		
		//Verify a text in present in the webpage
		String titles = driver.findElement(By.xpath("//*[contains(text(),'Connect with')]")).getText();
		System.out.println(titles);
		
		
	}
}
