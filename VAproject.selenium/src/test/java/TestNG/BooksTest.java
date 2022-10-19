package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import amazon.pages.KindleEbooks;
import common.Utilities;
import amazon.pages.HomePage;
import amazon.pages.BestBooks;


public class BooksTest extends Utilities {
  
  @Test (priority = 0)
  public void verfiyBookLinks() {	  
	  HomePage home = new HomePage(driver);
	  home.booksLink();
	  
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
//	  System.out.println("this is before assert");
	  
//	  Hard Assert
//	  Assert.assertEquals(url, "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books");
	  
//	  Soft Assert
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(url, "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books1");
//	  
//	  System.out.println("this is after assert");

	  
	  KindleEbooks book = new KindleEbooks(driver);
	  book.kEbooksClick();
	  
	  BestBooks bb = new BestBooks(driver);
	  bb.bestBooksLink();;
	  sa.assertAll();
  }
  
  @Test (priority = 2, dependsOnMethods = "verfiyBookLinks")
  public void verifySearchField() {
	  HomePage home = new HomePage(driver);
	  home.clickLogo();
	  home.searchFieldKeys();;
	  home.clickSearchButton();
  }
  
  @Test (priority = 1)
  public void findLink() {
	  int linked = driver.findElements(By.tagName("a")).size();
	  System.out.println("Total number of links: " + linked);
	  
	  int homeLink = driver.findElements(By.linkText("Amazon Home")).size();
	  System.out.println("Amazon home count: " + homeLink);
	  
	  if (homeLink == 1) {
		  driver.findElement(By.linkText("Amazon Home")).click();
	}else {
		System.out.println("Element is not displaying.");
	}
  }

}
