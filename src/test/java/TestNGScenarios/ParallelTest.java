package TestNGScenarios;

import org.openqa.selenium.By;

/*<suite name="Suite">
<test name = "Parallel Tests" parallel = "methods">
<classes>
 <class name="TestNGScenarios.ParallelTest"/>*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;

	@Test
	public void MSEdgeTest() {

		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("BrowserStack Guide");
		WebElement searchIcon = driver.findElement(By.name("btnK"));
		searchIcon.click();
		driver.quit();
	}

	@Test
	public void ChromeTest() {
		// Initialize the chrome driver
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("BrowserStack Guide");
		WebElement searchIcon = driver.findElement(By.name("btnK"));
		searchIcon.click();
		driver.quit();
	}
}
