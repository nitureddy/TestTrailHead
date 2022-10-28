package com.apexit.Stepdefinitions;

///Encapsulation is a mechanism of binding code and data (variables) together in a single unit.


import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.apexit.Excel.ExcelApiFile;
import com.apexit.basepage.CallObject;
import com.apexit.basepage.LocatorsPath;
import com.apexit.basepage.NavigatorsLocPath;
import com.apexit.basepage.PageObjects;
import com.apexit.testrunner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTrailHead extends TestRunner{
	public LoginTrailHead() throws Exception{
		super();
	}
	
	
	ExcelApiFile file1=new ExcelApiFile("SalesForce.xlsx");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	Actions action = new Actions(driver); 
	SoftAssert softAssert = new SoftAssert();
	//protected static WebDriver driver;
	//private static boolean flag=false;
	
	@Given("^Log in to SalesForce TrailHead$")
	public void	 Log_in_to_SalesForce_as_TrailHeads() throws Throwable{
		String username=file1.getCellData("TrailHead", "USERNAME",2);
		String password=file1.getCellData("TrailHead", "PASSWORD",2);
		LogInTrailHead(username,password);
	}
		
	
	public void	 LogInTrailHead(String username,String password) throws Throwable{
		//LaunchBrowser.getDriver();
		
		//if(flag==false) {
		//flag=true;
		System.out.println("Login to TrailHead");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Polymorphism allows us to perform a task in multiple ways.we use different time stamps such as SECONDS, MINUTES, HOURS etc.,
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//In the WebDriver interface, we use two different methods for navigating or accessing any website i.e. driver.get() and driver.navigate().to().
		driver.get(file1.getCellData("TrailHead","URL",2));
		//This Element is inside 4 nested shadow DOM.
		SearchContext shadow0 = driver.findElement(By.cssSelector("th-header[lx-search='true']")).getShadowRoot();
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("lwc-tds-header")).getShadowRoot();
		SearchContext shadow2 = shadow1.findElement(By.cssSelector("lwc-tds-header-desktop")).getShadowRoot();
		SearchContext shadow3 = shadow2.findElement(By.cssSelector(" header:nth-child(1) > div:nth-child(2) > div:nth-child(5) > slot:nth-child(1) > div:nth-child(1) > lwc-tds-button-link:nth-child(2)")).getShadowRoot();
		WebElement Element=shadow3.findElement(By.cssSelector(".button.button--neutral.button--animated"));
		action.moveToElement(Element).click().perform();
		Thread.sleep(3000);
	WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.linedinLogin,NavigatorsLocPath.MAX_TIME);
	//	action.moveToElement(Element1).click().perform();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", Element1);
	    executor.executeScript("arguments[0].click();", Element1);
		//PageObjects.SelectByXpathWithSendKeys(driver,LocatorsPath.TH_SFSignIn,NavigatorsLocPath.MAX_TIME,password);	
	    Thread.sleep(1000);
		PageObjects.SelectByXpathWithSendKeys(driver,LocatorsPath.TH_SFUserName,NavigatorsLocPath.MAX_TIME,username);	
		PageObjects.SelectByXpathWithSendKeys(driver,LocatorsPath.TH_SFPsWD,NavigatorsLocPath.MAX_TIME,password);	
		PageObjects.SelectByXpath(driver, LocatorsPath.TH_SFLogin,NavigatorsLocPath.MAX_TIME);
		Thread.sleep(30000);
		
		//This Element is inside 5 nested shadow DOM.
		Thread.sleep(1000);
		SearchContext shadow4 = driver.findElement(By.cssSelector("th-header[lx-search='true']")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow5 = shadow4.findElement(By.cssSelector("lwc-tds-header")).getShadowRoot();
        Thread.sleep(1000);
		SearchContext shadow6 = shadow5.findElement(By.cssSelector("lwc-tds-header-desktop")).getShadowRoot();
		SearchContext shadow7 = shadow6.findElement(By.cssSelector(".profile")).getShadowRoot();
		shadow7.findElement(By.cssSelector("lwc-tds-header-avatar[slot='avatar']")).click();
		SearchContext shadow9 = driver.findElement(By.cssSelector("th-header[lx-search='true']")).getShadowRoot();
		SearchContext shadow10 = shadow9.findElement(By.cssSelector("lwc-tds-header")).getShadowRoot();
		SearchContext shadow11 = shadow10.findElement(By.cssSelector("lwc-tds-header-desktop")).getShadowRoot();
		SearchContext shadow12 = shadow11.findElement(By.cssSelector(".profile")).getShadowRoot();
		SearchContext shadow13 = shadow12.findElement(By.cssSelector("lwc-tds-user-menu")).getShadowRoot();
		//shadow13.findElement(By.cssSelector("#item_1411067047"));
		shadow13.findElement(By.cssSelector(" lwc-ui-focus-visible:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(3) > li:nth-child(4)")).click();
		Thread.sleep(3000);
	    PageObjects.SelectByXpath(driver,LocatorsPath.TH_launch,NavigatorsLocPath.MAX_TIME);

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(2000);
}
	
	 @Then("Click on Accounts")
	    public void Then_Click_on_Accounts() throws Throwable {
	    	System.out.println("Then Click on Accounts");
		    PageObjects.SelectByXpath(driver,LocatorsPath.Accounts,NavigatorsLocPath.MAX_TIME);   
		    WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.Accounts,NavigatorsLocPath.MAX_TIME);
			action.moveToElement(Element1).click().perform();
			}
	 
	 @Then("Click on New Button")
	    public void Click_on_New_button() throws Throwable {
	    	System.out.println("Click on New Button");
	    	for (int i=2;i<=4;i++) {
    		String AccType	= file1.getCellData("Account", "TYPE",i);
    		String AccIndustry = file1.getCellData("Account", "INDUSTRY",i);
    		String AccOwner= file1.getCellData("Account", "OWNERSHIP",2);	
    		String CustPriority	= file1.getCellData("Account", "CUSTPRIORITY",i);
    		String AccSLA= file1.getCellData("Account", "SLA",i);
    		
    		String TypeLOV="//lightning-base-combobox-item[@data-value='"+AccType+"']";
    		String IndustryLOV="//lightning-base-combobox-item[@data-value='"+AccIndustry+"']";
    		String OwnershipLOV="//lightning-base-combobox-item[@data-value='"+AccOwner+"']";
    		
    		String CustomerPriLOV="//lightning-base-combobox-item[@data-value='"+CustPriority+"']";
    		String SLALOV="//lightning-base-combobox-item[@data-value='"+AccSLA+"']";
	    		
		    PageObjects.SelectByXpath(driver,LocatorsPath.New,NavigatorsLocPath.MAX_TIME);
		    System.out.println("Populate_all_mandatory_fields");
	    	String Account	= file1.getCellData("ACCOUNT", "NAME",i)+CallObject.timestamp();
	    	file1.setCellData("Account", "NAME", i, Account);
			PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.AccName, NavigatorsLocPath.MAX_TIME, Account);
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.xpath(LocatorsPath.Type)));
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath(LocatorsPath.Type)));

			//WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.Type,NavigatorsLocPath.MAX_TIME);
			//action.moveToElement(Element1).click().perform();
			//PageObjects.SelectByXpath(driver,LocatorsPath.Type,SavedSearchLocPath.MAX_TIME);
			driver.findElement(By.xpath(TypeLOV)).click();
			Thread.sleep(1000);

			PageObjects.SelectByXpath(driver,LocatorsPath.Industry,NavigatorsLocPath.MAX_TIME);
			driver.findElement(By.xpath(IndustryLOV)).click();
			Thread.sleep(1000);

			PageObjects.SelectByXpath(driver,LocatorsPath.Ownership,NavigatorsLocPath.MAX_TIME);
			driver.findElement(By.xpath(OwnershipLOV)).click();
			Thread.sleep(1000);

			js.executeScript("arguments[0].click();", driver.findElement(By.xpath(LocatorsPath.CustomerPri)));
			//PageObjects.SelectByXpath(driver,LocatorsPath.CustomerPri,SavedSearchLocPath.MAX_TIME);
			driver.findElement(By.xpath(CustomerPriLOV)).click();
			Thread.sleep(1000);

			js.executeScript("arguments[0].click();", driver.findElement(By.xpath(LocatorsPath.SLA)));
			//PageObjects.SelectByXpath(driver,LocatorsPath.SLA,SavedSearchLocPath.MAX_TIME);
			driver.findElement(By.xpath(SLALOV)).click();
		    PageObjects.SelectByXpath(driver,LocatorsPath.Save,NavigatorsLocPath.MAX_TIME);
		    System.out.println("verify whether account is created");
		    
		    WebElement AccRec = PageObjects.GetWebElement(driver, LocatorsPath.AccRec, NavigatorsLocPath.MAX_TIME);
		    String AccRec1 = AccRec.getText();
	    	if(AccRec1.equals(file1.getCellData("ACCOUNT", "NAME",i))){
				System.out.println("The account created is "+AccRec1);
			} else {
				System.out.println("The account created is not"+AccRec1);
			}
	    	//if(i==3) {
	        Thread.sleep(1000);
	    		 WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.Accounts,NavigatorsLocPath.MAX_TIME);
	 			action.moveToElement(Element1).click().perform();
	    	//}
	    	}
	    }
	 
	 @Then("Populate all mandatory fields")
	    public void Populate_all_mandatory_fields() throws Throwable {
	    				}
	 @Then("Click on Save button")
	    public void Click_on_Save_button() throws Throwable {
	    	System.out.println("Click on Save Button");
			}
	  
	 @Then("verify whether account is created in Accounts view")
	    public void verify_whether_account_is_created() throws Throwable {
	    			}
	 
	 @Given("when user is in Acount List")
	 public void when_user_is_in_acount_list() throws Exception {
		 WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.Accounts,NavigatorsLocPath.MAX_TIME);
			action.moveToElement(Element1).click().perform();
		 System.out.println("when user is in Acount List");
	 }

	 @Then("Click on List views")
	 public void click_on_list_views() throws Exception {
		    PageObjects.SelectByXpath(driver,LocatorsPath.SelectListview,NavigatorsLocPath.MAX_TIME);

	 }

	 @Then("Select All Accounts List View")
	 public void select_all_accounts_list_view() throws Exception {
		    PageObjects.SelectByXpath(driver,LocatorsPath.AllAccsListview,NavigatorsLocPath.MAX_TIME);

	 
	 }

	 @Then("Click on List Control Menu")
	 public void click_on_list_control_menu() throws Exception {
		 Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", 
					driver.findElement(By.xpath(LocatorsPath.ListviewControls)));
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath(LocatorsPath.ListviewControls)));
		  //  PageObjects.SelectByXpath(driver,LocatorsPath.AllAccsListview,SavedSearchLocPath.MAX_TIME);

	 }

	 @Then("Click New Menu from List Control Menu")
	 public void click_new_menu_from_list_control_menu() throws Exception {
		    PageObjects.SelectByXpath(driver,LocatorsPath.LVNewBtn,NavigatorsLocPath.MAX_TIME);

	 }

	 @Then("populate Name and Select all view radio button")
	 public void populate_name_and_select_all_view_radio_button() throws Exception {
		    String ListView="New All Accounts"+CallObject.timestamp();
			PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.LVName, NavigatorsLocPath.MAX_TIME, ListView);		
		    PageObjects.SelectByXpath(driver,LocatorsPath.LVAllUsersRdo,NavigatorsLocPath.MAX_TIME);

	 }

	 @Then("click on Save button")
	 public void click_on_save() throws Exception {
	 PageObjects.SelectByXpath(driver,LocatorsPath.LVASave,NavigatorsLocPath.MAX_TIME);

	 }

	 @Then("Select filters and Select All account radio button")
	 public void select_filters_and_select_all_account_radio_button() throws Exception {
	    PageObjects.SelectByXpath(driver,LocatorsPath.LVFilter,NavigatorsLocPath.MAX_TIME);
	    PageObjects.SelectByXpath(driver,LocatorsPath.LVAllAccsRdo,NavigatorsLocPath.MAX_TIME);
	 }

	 @Then("click on Done button")
	 public void click_on_done_button() throws Exception {
		    PageObjects.SelectByXpath(driver,LocatorsPath.LVAllAccsDone,NavigatorsLocPath.MAX_TIME);
		    PageObjects.SelectByXpath(driver,LocatorsPath.LVAllAccsave,NavigatorsLocPath.MAX_TIME);

	 }

	
}

