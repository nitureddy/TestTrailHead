package TestNGScenarios;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class firsttestngfileMethod {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	WebDriver driver = new ChromeDriver();
     
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
  		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}

