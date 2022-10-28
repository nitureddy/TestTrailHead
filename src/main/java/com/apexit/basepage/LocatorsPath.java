package com.apexit.basepage;

import org.openqa.selenium.By;

import com.apexit.Excel.ExcelApiFile;

/**Abstraction is the methodology of hiding the implementation of internal details , we write locators (such as id, name, xpath etc.,) and the methods Step definitions 
 * Literally we hide the implementations of the locators from the tests.
  Created on 06-May-2020
 *
 */
public class LocatorsPath {


	//SF
	public static final String TH_Login=".button.button--neutral.button--animated";

	public static final String TH_SFSignIn="//button[@id='signup_or_signin_with_salesforce']";//div[@id='detect_card-trailblazerid']/following-sibling::div//button";
	public static final String TH_SFUserName="//input[@id='username']";

	public static final String TH_SFPsWD="//input[@id='password']";
	
	public static final String TH_SFLogin="//button[normalize-space()='Sign in']";//input[@id='Login']";
	public static final String TH_launch="(//a[contains(.,'Launch')])[1]";
	public static final String SF_AppLaunch="//div[@class='slds-icon-waffle']";
	public static final String SF_Form="//form[@id='loginPage:social-card-form']";
	public static final String Accounts="//a[@title='Accounts']";
	public static final String New="//a[@title='New']";
	
	public static final String Gmail="//a[contains(text(),'Gmail')]";
	public static final String SFDevMail="(//span[@name='Salesforce Develope.'][normalize-space()='Salesforce Develope.'])[2]";
	public static final String bodyMail="//div[contains(text(),'You recently logged in to Your Developer Edition f')]";
	public static final String linedinLogin="(//button[@id='signup_or_signin_with_linkedin'])[2]";
	public static final String AccName="//input[@name='Name']";
	public static final String Rating="//button[@aria-label='Rating, --None--']";
	
	public static final String ParentAcc="//input[@placeholder='Search Accounts...']";
	public static final String Type="//button[@aria-label='Type, --None--']";
	public static final String Industry="//button[@aria-label='Industry, --None--']";
	public static final String Ownership="//button[@aria-label='Ownership, --None--']";
	public static final String CustomerPri="//button[@aria-label='Customer Priority, --None--']";
	public static final String SLA="//button[@aria-label='SLA, --None--']";
	public static final String Save="//button[@name='SaveEdit']";
	public static final String AccRec="//lightning-formatted-text[@class='custom-truncate']";	
	public static final String ListviewControls="//button[@title='List View Controls']";
	public static final String SelectListview="//button[@title='Select a List View']";
	public static final String AllAccsListview="//span[contains(@class,'virtualAutocompleteOptionText')][normalize-space()='All Accounts']";
	
	public static final String LVNewBtn="//li[@class='slds-dropdown__item listViewSettingsMenuNew']//a[@role='menuitem']";
	public static final String LVName="//input[@name='title']";
	public static final String LVAPIName="//input[@name='developerName']";
	public static final String LVAllUsersRdo="(//span[@class='slds-radio_faux'])[2]";
	public static final String LVASave="(//span[contains(@class,'label bBody')][normalize-space()='Save'])[2]";
	public static final String LVFilter="//div[@class='forceFilterPanelScope']";
	public static final String LVAllAccsRdo="(//span[@class='slds-radio_faux'])[1]";
	public static final String LVAllAccsDone="//span[normalize-space()='Done']";
	public static final String LVAllAccsave="//button[contains(text(),'Save')]";
	
	
	public static final String Contacts="//span[@class='slds-truncate'][normalize-space()='Contacts']";
	
	public static final String Salutation="//button[@name='salutation']";
	
	public static final String FirstName="input[placeholder='First Name']";
	public static final String LastName="//input[@placeholder='Last Name']";
	public static final String SearchAccount="input[placeholder='Search Accounts...']";
	public static final String SelAccount="(//lightning-base-combobox-item[contains(@id,'combobox')])[7]";
	
	
	
	
	
	
	
	

}