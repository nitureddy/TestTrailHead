package TestNGScenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNgAsserts {
	WebDriver driver = new ChromeDriver();
	
	@Test (priority = 0)
	public void CloseBrowser() {
		driver.close();
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
	        
	        driver.get("https://www.toolsqa.com/");
	        String expectedTitle1 = "Free QA Automation Tools For Everyone";
	        String expectedTitle="Tools QA";

	        
	        String originalTitle1 = driver.getTitle();
	        Assert.assertEquals(originalTitle1, expectedTitle);
	        
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle,"passed");
	        System.out.println("The original title"+originalTitle);
  }
}

