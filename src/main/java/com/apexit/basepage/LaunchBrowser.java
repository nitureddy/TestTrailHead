package com.apexit.basepage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.apexit.testrunner.TestRunner;


//WebDriver  is an Interface An interface can have methods and variables just like the class but the methods declared in interface are by default abstract. We can achieve 100% abstraction and multiple inheritance in Java with Interface.

//Here, we are using WebDriver Interface to instantiate the Chrome Browser.

//This WebDriver interface supports all the methods that are there in the ChromeDriver class and the same can be rewritten for Firefox browsers which support methods of the FirefoxDriver class.


public class LaunchBrowser extends TestRunner{
	
	public LaunchBrowser() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static WebDriver getDriver() {

		if (driver == null) {
			
			//Launch Internet Explorer Browser
			if ("IE".equalsIgnoreCase("IE1")) {
                
				//Capabilities Deprecated in the SELENIUM version 3.0
				InternetExplorerOptions options = 
						new InternetExplorerOptions().requireWindowFocus();
				options.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
				options.setCapability(InternetExplorerDriver.
						INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				options.setCapability(InternetExplorerDriver.
						UNEXPECTED_ALERT_BEHAVIOR, UnexpectedAlertBehaviour.IGNORE);
				options.setCapability("allow-blocked-content", true);
				options.setCapability("allowBlockedContent", true);
				
				System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver(options);

			//Launch CHROME Browser
			} else if ("CHROME".equalsIgnoreCase("CHROME")) {
		//	ChromeOptions options = new ChromeOptions();
			//options.addArguments("--disable-notifications");
			//options.addArguments("--test-type");
		   //  options.addArguments("--lang=en");
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				//driver = new ChromeDriver();
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_setting_values.notifications", 2);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", prefs);
				//WebDriver driver = new ChromeDriver(options);
				 driver =new ChromeDriver(options);

			    
					//options.addExtensions(new File("Buster-Captcha-Solver-for-Humans.crx"));
			     // capabilities = new DesiredCapabilities();
			   //  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				
			   //  ChromeOptions options = new ChromeOptions();
			     
			    // capabilities = (DesiredCapabilities)options.ToCapabilities();

					//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
					//options.merge(capabilities);
			//		ChromeDriver driver = new ChromeDriver(options);
//
					//driver = new ChromeDriver(capabilities);
			//Launch Microsoft Edge Browser
			} else if ("MSEDGE".equalsIgnoreCase("MSEDGE1")) {

				System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			
			}else {
				System.err.println("No Browsers launched.............");
			}
		}
		return driver;
	}	
}
