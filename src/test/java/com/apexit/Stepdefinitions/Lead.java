package com.apexit.Stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.apexit.Excel.ExcelApiFile;
import com.apexit.basepage.CallObject;
import com.apexit.basepage.LocatorsPath;
import com.apexit.basepage.NavigatorsLocPath;
import com.apexit.basepage.PageObjects;
import com.apexit.testrunner.TestRunner;

import io.cucumber.java.en.Then;

public class Lead extends TestRunner{
	public Lead() throws Exception{
		super();
	}
	Actions action = new Actions(driver); 
	ExcelApiFile file1=new ExcelApiFile("SalesForce.xlsx");
	@Then("Click on Lead")
	public void click_on_lead() throws Exception {

		 WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.leads,NavigatorsLocPath.MAX_TIME);
			action.moveToElement(Element1).click().perform();   
	}

	@Then("Click on New Button in Leads view")
	public void click_on_new_button_in_leads_view() throws Exception {
		  PageObjects.SelectByXpath(driver,LocatorsPath.New,NavigatorsLocPath.MAX_TIME);

	}

	@Then("Populate all mandatory fields in Leads view")
	public void populate_all_mandatory_fields_in_leads_view() throws Exception {
	    System.out.println("Populate_all_mandatory_fields");
	    String account=file1.getCellData("Contact", "ACCOUNT",2);
	    String Salutation=file1.getCellData("Contact", "SALUTATION",2);
	    String selSalutation="//span[@title='"+Salutation+"']";
		PageObjects.SelectByXpath(driver,LocatorsPath.Salutation,NavigatorsLocPath.MAX_TIME);
		PageObjects.SelectByXpath(driver,selSalutation,NavigatorsLocPath.MAX_TIME);
    	String fname	= file1.getCellData("Contact", "FIRSTNAME",2)+CallObject.timestamp();
    	file1.setCellData("Contact", "FIRSTNAME", 2, fname);
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.FirstName, NavigatorsLocPath.MAX_TIME, fname);
		String lname	= file1.getCellData("Contact", "LASTNAME",2)+CallObject.timestamp();
    	file1.setCellData("Contact", "LASTNAME", 2, lname);
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.LastName, NavigatorsLocPath.MAX_TIME, lname);

	}

	@Then("Click on Save button in Leads view")
	public void click_on_save_button_in_leads_view() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify whether contact is created in Leads view")
	public void verify_whether_contact_is_created_in_leads_view() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
