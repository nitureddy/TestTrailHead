package com.apexit.Stepdefinitions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import parallel.TestRunner;

public class Loginactions extends TestRunner{

	
	public Loginactions() throws Exception{
		super();
	}
	
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Actions action = new Actions(driver); 
		Action SiriesofActions;
		String ImgPath="C:\\Users\\sunitha.reddy\\OneDrive - Apex IT\\Pictures\\Screenshots\\FaceBookerror.PNG";
		File tempFile,PermanantFile;
		WebDriverWait wait;
		TakesScreenshot screenShot;
		
	@Given("I naviate to application")
	public void i_naviate_to_application() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("Login to TrailHead");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		    driver.get("http://www.facebook.com");
	}

	@When("The home page displayed")
	public void the_home_page_displayed() {
	   
	}

	@Then("I username")
	public void i_username() {
	  
	}

	@Then("I enter pasword")
	public void i_enter_pasword() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check login is successful")
	public void check_login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
