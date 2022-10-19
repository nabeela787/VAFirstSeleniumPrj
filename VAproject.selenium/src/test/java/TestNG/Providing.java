package TestNG;

import org.testng.annotations.Test;

import common.Utilities;
import facebook.pages.Home;

import org.testng.annotations.DataProvider;

public class Providing extends Utilities{
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Home home = new Home(driver);
	  home.enterEmail(n);
	  Thread.sleep(5000);
	  home.enterPassword(s);
	  Thread.sleep(5000);
	  home.clickLogin();
	  Thread.sleep(5000);
	  driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "test1", "pass1" },
      new Object[] { "test2", "pass2" },
      new Object[] { "test3", "pass3" },

    };
  }
}
