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

public class Contacts  extends TestRunner{
	public Contacts() throws Exception{
		super();
	}
	Actions action = new Actions(driver); 
	ExcelApiFile file1=new ExcelApiFile("SalesForce.xlsx");

	@Then("Click on Contacts")
	public void click_on_contacts() throws Exception {
		System.out.println("Then Click on Contacts");
	    //PageObjects.SelectByXpath(driver,LocatorsPath.Contacts,NavigatorsLocPath.MAX_TIME);   
	    WebElement Element1=PageObjects.GetWebElement(driver, LocatorsPath.Contacts,NavigatorsLocPath.MAX_TIME);
		action.moveToElement(Element1).click().perform();   
	}

	@Then("Click on New Button in contacts view")
	public void click_on_new_button_in_contacts_view() throws Exception {
	  PageObjects.SelectByXpath(driver,LocatorsPath.New,NavigatorsLocPath.MAX_TIME);

	}

	@Then("Populate all mandatory fields in contacts view")
	public void populate_all_mandatory_fields_in_contacts_view() throws Exception {
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
		PageObjects.SelectByXpathWithSendKeys(driver, LocatorsPath.SearchAccount, NavigatorsLocPath.MAX_TIME, account);

		PageObjects.SelectByXpath(driver,LocatorsPath.SelAccount,NavigatorsLocPath.MAX_TIME);

	}

	@Then("Click on Save button in contacts view")
	public void click_on_save_button_in_contacts_view() throws Exception {
	    PageObjects.SelectByXpath(driver,LocatorsPath.Save,NavigatorsLocPath.MAX_TIME);

	}

	@Then("verify whether contact is created in Contacts view")
	public void verify_whether_contact_is_created_in_contacts_view() throws Exception {
	String exContact=file1.getCellData("Contact", "SALUTATION",2)+" "+file1.getCellData("Contact", "FIRSTNAME",2)+" "+file1.getCellData("Contact", "LASTNAME",2);
	System.out.println("The account created is "+exContact);

	WebElement acContact = PageObjects.GetWebElement(driver, LocatorsPath.contact, NavigatorsLocPath.MAX_TIME);
	    String AccRec1 = acContact.getText();
 	if(AccRec1.equals(exContact)){
			System.out.println("The contact is created  "+AccRec1);
		} else {
			System.out.println("The contact is not created "+AccRec1);
		}
 	
	
	}

}
