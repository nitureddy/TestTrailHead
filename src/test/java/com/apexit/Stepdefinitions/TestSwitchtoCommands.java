package com.apexit.Stepdefinitions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSwitchtoCommands {

	public TestSwitchtoCommands() throws Exception {
		super();
	}

	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
	WebDriverWait wait;
	String parentWindow, childWindow1;
	int noofwindows;

	public void invokebrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("Login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public void SwitchtoAlert() throws Exception {
		invokebrowser();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.tagName("button")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert MyAlert = driver.switchTo().alert();
		String alerttext = MyAlert.getText();
		System.out.println(alerttext);
		MyAlert.accept();
	}

	public void Switchtowindow() throws Exception {
		invokebrowser();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.tagName("button")).click();
		parentWindow = driver.getWindowHandle().toString();
		childWindow1 = driver.getWindowHandles().toArray()[1].toString();
		driver.switchTo().window(childWindow1);
		driver.findElement(By.linkText("LEARN HTML")).click();
		driver.switchTo().window(parentWindow);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestSwitchtoCommands switchcmd = new TestSwitchtoCommands();
		//switchcmd.SwitchtoAlert();
		switchcmd.Switchtowindow();

	}

}
