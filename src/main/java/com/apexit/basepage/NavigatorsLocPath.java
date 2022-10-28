package com.apexit.basepage;

import java.sql.Driver;

import org.openqa.selenium.By;

public class NavigatorsLocPath {

	
	public static final String UserName="//input[@id='userid']";
	public static final String Password="//input[@id='password']";
	public static final String LoginButton="//button[@id='btnActive']";
	public static final int MAX_TIME                        = 60;
	public static final String Home_page="//a[@title='Oracle Logo Home']";
	public static final String Home_Icon="//a[@title='Home']//*[name()='svg']//*[name()='g']//*[name()='path' and contains(@class,'svg-outlin')]";//(//a[@title='Home']//*[name()='svg'])[1]";
	public static final String Home="//h1[contains(.,'Good')]";
	public static final String WorkSpace="//a[normalize-space()='Workspace']";

	public static final String Sales="//a[normalize-space()='Sales']";
	public static final String Service="//a[normalize-space()='Service']";
	public static final String Tools="//a[normalize-space()='Tools']";
	public static final String Others="//a[normalize-space()='Others']";
	public static final String CustData="//a[normalize-space()='Customer Data Management']";
	public static final String MyEnterprise="//a[normalize-space()='My Enterprise']";
		
	public static final String PartManagement="//a[normalize-space()='Partner Management']";
	public static final String Config="//a[normalize-space()='Configuration']";
	public static final String knowledge="//a[normalize-space()='Knowledge']";

	
	public static final String WorkspaceNav="(//div[@title='Workspace'])[2]";

	public static final String SalesNav="(//div[@title='Sales'])[1]";
	//public static final String SalesNav="//div[@title='Sales']//div[2]";//(//div[@title='Sales'])[2]";

	//public static final String SalesNav="//div[@title='Sales' and contains(@class,'navmenu-header')]";
	public static final String ServiceNav="(//div[@title='Service'])[1]";
	public static final String ToolsNav="(//div[@title='Tools'])[1]";
	public static final String OthersNav="(//div[@title='Others'])[1]";
	public static final String partnerNAv="(//div[@title='Partner Management'])[1]";
	public static final String ConfigNav="(//div[@title='Configuration'])[1]";
	public static final String KnowNav="(//div[@title='Knowledge'])[1]";
	public static final String CustDataNav="(//div[@title='Customer Data Management'])[1]";
	public static final String MyEnterpriseNav="(//div[@title='My Enterprise'])[1]";

	//public static final String settings="//a[@title='Settings and Actions Menu']//*[name()='svg']//*[name()='g']//*[name()='path' and contains(@class,'svg-outlin')]";//a[@title='Settings and Actions Menu']";
	public static final String NavClose="(//*[name()='svg'][@aria-label='Close'])[1]";
	public static final String settings="(//*[name()='svg'][@aria-label='Settings and Actions Menu'])[1]";
	public static final String signout="(//a[normalize-space()='Sign Out'])[1]";
	public static final String ConfirmSignout="//button[@name='Confirm']";
	public static final String Leads="//div[@title='Leads']";
	public static final String SalesCampaigns="//div[@title='Sales Campaigns']";
	public static final String Opportunities="//div[@title='Opportunities']";
	public static final String Accounts="//div[@title='Accounts']";
	public static final String Contacts="//div[@title='Contacts']";
	public static final String Contracts="//div[@title='Contracts']";
	public static final String Activities="//div[@title='Activities']";
	public static final String Territories="//div[@title='Territories']";
	public static final String analytics="//div[@title='Analytics']";
	public static final String BusinessPlans="//div[@title='Business Plans']";
	public static final String Queues="//div[@title='Queues']";

	public static final String Offerings="//div[@title='Offerings']";
	public static final String NewFeatures="//div[@title='New Features']";
	public static final String FeatureUpdates="//div[@title='Feature Updates']";
	public static final String SetupMaintenance="//div[@title='Setup and Maintenance']";

	
	
	public static final String MyKnowledge="//div[@title='My Knowledge Classic']";
	public static final String SerRequests="//div[@title='Service Requests']";
	public static final String AppProtal="//div[@title='Appliance Management Portal']";
	
	public static final String QueuesNav="//a[@title='Queues']";
	public static final String LeadsNav="//a[@title='Leads']";
	public static final String SalesCampaignsNav="//a[@title='Sales Campaigns']";
	public static final String OpportunitiesNav="//a[@title='Opportunities']";
	public static final String AccountsNav="//a[@title='Accounts']";
	public static final String ContactsNav="//a[@title='Contacts']";
	public static final String ContractsNav="//a[@title='Contracts']";
	public static final String ActivitiesNav="//a[@title='Activities']";
	public static final String TerritoriesNav="//a[@title='Territories']";
	//public static final String analytics="//div[@title='Analytics']";
	public static final String BusinessPlansNav="//a[@title='Business Plans']";
	
	
	public static final String OfferingsNav="//a[@title='Offerings']";
	public static final String NewFeaturesNav="//a[@title='New Features']";
	public static final String FeatureUpdatesNav="//a[@title='Feature Updates']";
	public static final String SetupMaintenanceNav="//a[@title='Setup and Maintenance']";
	
	
	public static final String addClean="//div[@title='Address Cleansing']";
	public static final String DataEnrich="//div[@title='Data Enrichment']";
	public static final String DuplicateID="//div[@title='Duplicate Identification']";
	public static final String DuplicateRes="//div[@title='Duplicate Resolution']";
	public static final String Organizations="//div[@title='Organizations']";
	public static final String Persons="//div[@title='Persons']";
	public static final String Groups="//div[@title='Groups']";
	public static final String Hierarchies="//div[@title='Hierarchies']";
	public static final String DownloadDI="//div[@title='Download Desktop Integration Installer']";

	
	
	public static final String MyKnowledgeNav="//a[@title='My Knowledge Classic']";
	public static final String SerRequestsNav="//a[@title='Service Requests']";
	public static final String AppProtalNav="//a[@title='Appliance Management Portal']";
	
	
	
	public static final String Assets="//div[@title='Assets']";
	public static final String RegRequests="//div[@title='Registration Requests']";
	
	public static final String AssetsNav="//a[@title='Assets']";
	public static final String RegRequestsNav="//a[@title='Registration Requests']";

	public static final String SetPref="//div[@title='Set Preferences']";
	public static final String SchePro="//div[@title='Scheduled Processes']";
	public static final String ImpManage="//div[@title='Import Management']";
	public static final String ExpManage="//div[@title='Export Management']";
	public static final String CloudCustConnect="//div[@title='Cloud Customer Connect']";
	public static final String DSDActivityDashboard="//div[@title='DSD Activity Dashboard']";
	public static final String ActivityAgentDashboard="//div[@title='DSD Agent Activity Dashboard']";

	public static final String SmartText="//div[@title='SmartText']";
	public static final String Partners="//div[@title='Partners']";

	public static final String AuthorClass="//div[@title='Authoring Classic']";
	
	public static final String Appearance="//div[@title='Appearance']";
	public static final String Structure="//div[@title='Structure']";
	public static final String VisualBuilder="//div[@title='Visual Builder']";

	public static final String SetPrefNav="//a[@title='Set Preferences']";
	public static final String ScheProNav="//a[@title='Scheduled Processes']";
	public static final String ImpManageNav="//a[@title='Import Management']";
	public static final String ExpManageNav="//a[@title='Export Management']";
	public static final String ReportsNav="//a[@title='Reports and Analytics']";
	public static final String AuditReportsNav="//a[@title='Audit Reports']";
	public static final String UserRolesNav="//a[@title='Users and Roles']";
	public static final String SmartTextNav="//a[@title='SmartText']";
	public static final String PartnersNav="//a[@title='Partners']";
	public static final String DownloadDINav="//a[@title='Download Desktop Integration Installer']";
	
	public static final String addCleanNav="//a[@title='Address Cleansing']";
	public static final String DataEnrichNav="//a[@title='Data Enrichment']";
	public static final String DuplicateIDNav="//a[@title='Duplicate Identification']";
	public static final String DuplicateResNav="//a[@title='Duplicate Resolution']";
	public static final String OrganizationsNav="//a[@title='Organizations']";
	public static final String PersonsNav="//a[@title='Persons']";
	public static final String GroupsNav="//a[@title='Groups']";
	public static final String HierarchiesNav="//a[@title='Hierarchies']";
	
	//a[normalize-space()='My Enterprise']
	public static final String FileImport="//a[@title='File Import and Export']";
	public static final String ResourceDirectory="//div[@title='Resource Directory']";

	public static final String GetStarted="//div[@title='Getting Started']";
	public static final String Notifications="//div[@title='Notifications']";
	public static final String Sandboxes="//div[@title='Sandboxes']";
	
	public static final String BusinessObjectsNav="//a[@title='Business Objects']";

	
	public static final String SandboxesNav="//a[@title='Sandboxes']";

	public static final String GetStartedNav="//a[@title='Getting Started']";
	public static final String NotificationsNav="//a[@title='Notifications']";
	public static final String ResorceDirectNav="//a[@title='Resource Directory']";
	public static final String CloudCustConnectNav="//a[@title='Cloud Customer Connect']";
	public static final String PersonalInfoNav="//a[@title='Personal Information']";
	
	public static final String AuthorClassNav="//a[@title='Authoring Classic']";

	public static final String deeplinksNav="//a[@title='Deep Links']";
	public static final String productInfoNav="//a[@title='Product Information Management']";

	public static final String AppearanceNav="//a[@title='Appearance']";
	public static final String StructureNav="//a[@title='Structure']";
	public static final String VisualBuilderNav="//a[@title='Visual Builder']";


	public static final String HamBurger="//a[@title='Navigator']//*[name()='svg']";
	public static final String NavBar="(//a[normalize-space()='Show More'])[1]";
	
	public static final String moreTab="//div[@class='flat-tabs-overflow-right svg-body svg-solid']";
	public static final String lessTab="//div[@class='flat-tabs-overflow-left svg-body svg-solid']";
	
	
//BC BU
	public static final String Promotions="//a[normalize-space()='Promotions']";

	
	public static final String KDPStrategy="//div[@title='KDP Strategy Dashboard']";
	public static final String RRelations="//div[@title='3LR Relationship Dashboard']";
	public static final String InnovationDashboard="//div[@title='Innovation / Must Carry Dashboard']";
	public static final String AppointmentsDashboard="//div[@title='Appointments Dashboard']";
	public static final String ManagerAppDashboard="//div[@title='Manager Appointments Dashboard']";

	public static final String Products="//div[@title='Products']";
	public static final String AppInterest="//div[@title='Appliance of Interest']";
	public static final String AlertConfig="//div[@title='AlertConfig']";
	public static final String RTMPrecalc="//div[@title='RTM Precalc 3LR']";
	public static final String PromoRTM="//div[@title='PromoRTM']";

	//Menu
	//public static final String WorkSpaceNav1="(//div[@title='Workspace'])[2]";

	public static final String WorkSpaceNav1="//a[@title='Workspace']";

	public static final String PromotionNav="(//a[@title='Promotions'])[1]";

	public static final String KDPStrategyNav="//a[@title='KDP Strategy Dashboard']";
	public static final String RRelationsNav="//a[@title='3LR Relationship Dashboard']";
	public static final String InnovationDashboardNav="//a[@title='Innovation / Must Carry Dashboard']";
	public static final String ProductsNav="//a[@title='Products']";
	public static final String AppointmentsDashboardNav="//a[@title='Appointments Dashboard']";
	public static final String AppInterestNav="//a[@title='Appliance of Interest']";
	public static final String AlertConfigNav="//a[@title='AlertConfig']";
	public static final String RTMPrecalcNav="//a[@title='RTM Precalc 3LR']";
	public static final String PromoRTMNav="//a[@title='PromoRTM']";
	public static final String ManagerAppDashboardNav="//a[@title='Manager Appointments Dashboard']";
	public static final String DSDActivityDashboardNav="//a[@title='DSD Activity Dashboard']";

	public static final String ActivityAgentDashboardNav="//a[@title='DSD Agent Activity Dashboard']";

	//Oppurtunity
	public static final String CreateOpp="//button[normalize-space()='Create Opportunity']";
	public static final String CreateOpppage="//h1[normalize-space()='Create Opportunity']";
	public static final String EditOpppage="//h1[contains(text(),'Edit Opportunity')]";
	public static final String CreateCatalogPage="//h1[normalize-space()='Browse Catalog']";
	public static final String OppName="//td[@title='Name']/following-sibling::td//input[@type='text']";

	public static final String AccName="//td[@title='Account']/following-sibling::td//input[@type='text']";
	public static final String SelAccName="(//li[@role='option'])[1]";
	public static final String PrimaryAccContact="//input[contains(@id,'PriContactPartyNameId_create:lov_i1::content')]";
	public static final String PrimaryAccContactDownarrow="//a[contains(@id,'PriContactPartyNameId_create')]";//(//a[@title='Search: * Primary Account Contact'])[1]";
	//public static final String PrimaryAccContactDownarrow1="(//a[@title='Search: * Primary Account Contact'])[2]";

	public static final String SelPrimaryAccContact="(//div[contains(@id,'PriContactPartyNameId_create:lov_i1::dropdownPopup::dropDownContent')])[1]";
	
	public static final String DelDate="//td[@title='Requested Delivery Date']/following-sibling::td//input[@placeholder='m/d/yy']";
	public static final String SelSector="//li[@_adfiv='FS']";
	public static final String Sector="//td[@title='Sector']/following-sibling::td//input[@role='combobox']";
	public static final String SaveCont="//button[normalize-space()='Save and Continue']";
	public static final String BrowseCatalog="//button[normalize-space()='Browse Catalog']";
	public static final String ExpandAway="//span[normalize-space()='Away From Home']/preceding-sibling::span//a[@title='Expand']";
	public static final String ExpandAccess="//span[normalize-space()='AFH Accessories']/preceding-sibling::span//a[@title='Expand']";
	public static final String Plus="//table[@summary='Categories']//tbody/tr[1]/td[3]";
	public static final String Done="//span[normalize-space()='Done']";
	public static final String ConfirmPopup="(//div[contains(@id,'pwAddToOptyPopup')])[1]";
	public static final String Qty="//table[@summary='Opportunity Revenue Items']//tbody/tr[1]/td[4]//input[@type='text']";
	public static final String EstPrice="//table[@summary='Opportunity Revenue Items']//tbody/tr[1]/td[6]//input[@type='text']";
	public static final String Save="//button[normalize-space()='Save']";
	public static final String SaveAndClose="(//button[@accesskey='S'])[1]";////button[normalize-space()='Save and Close']";
	public static final String Cancel="//button[@accesskey='C']";
//Edit Oppurtunity	
	public static final String OppNameStarts="//input[@placeholder='Name starts with']";
	public static final String SelOppNameStarts="//div[@class='FndSearchSuggestItemsContainerPopup']//li[2]";////div[@class='FndSearchSuggestItemTextContainer']//div";//(//div[@class='FndSearchSuggestItem'])[1]";
	public static final String OpenStatus="//input[contains(@id,'statusCode::content')]";
	
	public static final String Competetor="//input[contains(@id,'competitorsId')]";
	public static final String SelOpenStatus1="(//li[normalize-space()='Closed-Lost'])[1]";//(//li[contains(text(),'Closed-Lost')])[2]";
	public static final String SelOpenStatus="(//li[contains(text(),'Closed-Lost')])[2]";

	public static final String ErrorNote="//td[@class='AFNoteWindow']";
	public static final String LostComments="//textarea[contains(@id,'ExtGen_attr_LostComments_c_Opportunity1::content')]";
	public static final String CoffeeSystem="//input[contains(@id,'ExtGen_attr_CoffeeSystem_c_Opportunity1::content')]";
	public static final String SelCoffeeSystem="//input[@_adftrueval='Bunn']";
	public static final String WinReason="//td[@title='Win/Loss Reason']/following-sibling::td//input[@role='combobox']";
	//public static final String SelWinReason="(//li[normalize-space()='Product, Brewer Features'])[1]";//(//li[contains(text(),'Product, Brewer Features')])[2]";
	public static final String SelWinReason="(//li[contains(text(),'Product, Brewer Features')])[2]";
	public static final String WinReason1="//span[contains(@id,'soc1::cntrl')]";

	public static final String WinLossMandate="//td[@title='Win/Loss Reason']//span[@title='Required'][normalize-space()='*']";
	public static final String LostCommentsMandate="//td[@title='Lost Comments']//span[@title='Required'][normalize-space()='*']";

	public static final String CoffeeSystemMandate="//td[@title='Coffee System']//span[@title='Required'][normalize-space()='*']";
	public static final String OtherCompetetorMandate="//td[@title='Other Competitor']//span[@title='Required'][normalize-space()='*']";
	public static final String OtherCompetetor="//input[contains(@id,'ExtGen_attr_OtherCompetitor_c_Opportunity1::content')]";
	public static final String ErrorCompetetor="(//div[contains(@id,':msgDlg')])[4]";	
	public static final String ErrorOK="//button[@_afrpdo='cancel'][normalize-space()='OK']";
	
	public static final String CompetetorLov1="//div[contains(@id,'competitorsId:')]//table//tbody/tr[2]";
	public static final String CompetetorLov2="//div[contains(@id,'competitorsId:')]//table//tbody/tr[3]";

	public static final String Primary ="//img[@title='Primary']";	
	public static final String SearchCompitetors ="//a[@title='Search: Competitors']";
	
	
	//OppActivity
	public static final String PurchassDelayed="(//li[normalize-space()='Purchase decision delayed'])[1]";
	public static final String AccLink ="(//a[contains(@id,'summary:')])[1]";
	
	public static final String OpenActivities ="(//a[@title='Open Activities'])[1]";
	public static final String PurchaseDecision="(//a[normalize-space()='Purchase decision delayed - Follow up'])[1]";
	public static final String DueDate="//table[@summary='Summary']//tbody/tr/td[3]";
	public static final String Owner="//table[@summary='Summary']//tbody/tr/td[4]";
	public static final String Account="//table[@summary='Summary']//tbody/tr/td[5]";
	public static final String todo="//table[@summary='Summary']//tbody/tr/td[6]";
	
	public static final String AddButton="(//button[normalize-space()='Add'])[1]";
	public static final String Product="//input[contains(@id,'prodGroupNameId')]";
	public static final String ProductQty="//label[normalize-space()='Quantity']/preceding-sibling::input";//table[@summary='Opportunity Revenue Items']//tbody/tr/td[4]";
	public static final String SalesStage="(//input[contains(@id,'salesStageId::content')])[1]/following-sibling::a";
	
	public static final String SalesStage2="//li[normalize-space()='02 - Develop Solution']";
	public static final String SalesStage3="//li[normalize-space()='03 - Agreement Signed']";
	public static final String NoofActivities="//span[contains(@id,'ExtGen_attr_NumberOfOpenTasks')]";
	public static final String OppActivities="(//div[contains(text(),'Activities')])[1]";
	
	public static final String OppActivities5="//table[@summary='Summary'] [@_rowcount='5']";
	public static final String OppActivities6="//table[@summary='Summary'] [@_rowcount='6']";

	
			
	
	
}
