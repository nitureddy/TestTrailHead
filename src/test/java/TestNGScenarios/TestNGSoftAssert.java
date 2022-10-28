package TestNGScenarios;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestNGSoftAssert {
	WebDriver driver = new ChromeDriver();
	
	@Test (priority = 0)
	public void CloseBrowser() {
		driver.close();
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
	        
	        driver.get("https://www.toolsqa.com/");
	        SoftAssert softassert = new SoftAssert();
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        softassert.assertEquals(originalTitle, expectedTitle);
	        System.out.println("*** Checking For The Second Title ***");
// Checking title for ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation
	        softassert.assertEquals(originalTitle, "Tools QA");
	        softassert.assertAll();
  }
}

