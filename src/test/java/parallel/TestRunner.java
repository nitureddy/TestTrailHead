/**
 * 
 */
package parallel;


 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apexit.basepage.LaunchBrowser;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
	@CucumberOptions(
			features = {"TrailHeadFeatures/parallel"}, 
			//features = {"DSD_3792_Account_Owner_Navigator.feature","BC_3808_Sales_Rep_Navigator.feature"}, 
	        glue = {"parallel"}, 
	    	        // glue = {"TestNGScenarios"}, 
	         plugin = {"summary","json:target/cucumber-reports/cucumber.json",//to generate different kinds of reports
	               //  "pretty",
	        		// "html:target/cucumber-html-report", 
	                   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	       	     	      //	tags="@LoginTrailhead",
	        		// tags="@LoginTrailhead",
	        monochrome = true)//display output in readable format
	       // dryRun=true) //to check the feature files are mapped with step definition
	

	//For JUNIT Framework Use ---------->  @RunWith(Cucumber.class)
	//TESTNG Framework
public class TestRunner extends AbstractTestNGCucumberTests {
		
		@Override
		@DataProvider(parallel=true)
		public Object[][] scenarios(){
			return super.scenarios();
		}
		protected static WebDriver driver;
		//protected static DesiredCapabilities capabilities;
		
		@BeforeClass
		public static void setUp() throws Throwable {
			if (driver == null) {
		LaunchBrowser.getDriver();
			System.out.println("Executing the WebClient Scripts........");
			}
		}

		
	@BeforeMethod
		public static void beforeMethod() throws Throwable{ 

			System.out.println("Executing the WebClient Scripts........");
			//SavedContacts = new DSD_3220_SavedSearchContact();
			//SavedContacts.Log_into_Oracle_CRM_as_a_KDP_DSD_Account_Owner();
			
		//SalesRep=new AFH_3793_Sales_Rep_Navigator() ;
		//SalesRep.Log_in_to_OEC_as_AFH_Sales_Rep();

		}
		@AfterMethod
		public static void failedScenario() throws Exception{

			System.out.println("Closing the  scripts........");
			//driver.quit();

			
		}
		
		
		
		
		@AfterClass
		public static void tearDown() throws Exception{
			
			if (driver != null) {
				System.out.println("Closing browser");
				driver.quit();
			}
		}
	}
	
	

