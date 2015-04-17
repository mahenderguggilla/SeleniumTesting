package Mantis_Automaion.UI_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BrowserTest {
	
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
