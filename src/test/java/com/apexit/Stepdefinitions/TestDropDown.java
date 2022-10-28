package com.apexit.Stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDropDown {

	public TestDropDown() throws Exception {
		super();
	}

	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	WebDriverWait wait;
    Select dropdown;
    List<WebElement> categorylist;

	public void invokebrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("Login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://amazon.in");
	}
	
	public void TestDropdownmethods() throws Exception {
		invokebrowser();
		WebElement dropdownElement=driver.findElement(By.id("searchDropdownBox"));
		dropdown=new Select(dropdownElement);
		
		categorylist=dropdown.getOptions();
		for (WebElement category:categorylist) {
			System.out.println(category.getText());
		}
		
		dropdown.selectByVisibleText("Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone7 plus");
		driver.findElement(By.id("nav-search-submit-button")).submit();
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestDropDown dropobj=new TestDropDown();
		dropobj.TestDropdownmethods();
	}

}
