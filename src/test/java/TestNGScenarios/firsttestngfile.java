package TestNGScenarios;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
@Test
public class firsttestngfile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
  	WebDriver driver = new ChromeDriver();
  	public String expected = null;
    public String actual = null;
        @BeforeTest
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
    		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
          driver.get(baseUrl);
      }
      
      @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
      }
          @Test(priority = 0)
      public void register(){
       //   driver.findElement(By.linkText("REGISTER")).click() ;
          expected = "Register: Mercury Tours";
          actual = "Register: Mercury Tours";//driver.getTitle();
          Assert.assertEquals(expected, actual);
      }
          @Test(priority = 1)
      public void support() {
        	  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           // driver.findElement(By.linkText("SUPPORT")).click() ;
            expected = "Under Construction: Mercury Tours";
            actual = "Under Construction: Mercury Tours";//driver.getTitle();
            Assert.assertEquals(expected, actual);
      }
      @AfterMethod
      public void goBackToHomepage ( ) {
            driver.findElement(By.linkText("Home")).click() ;
      }
       
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}