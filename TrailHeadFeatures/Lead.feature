@CreateLead
Feature: Create Lead

  @CreateLead
  Scenario: Create Lead
  Given Log in to SalesForce TrailHead
  Then Click on Lead
  And Click on New Button in Leads view
  Then Populate all mandatory fields in Leads view
  And Click on Save button in Leads view
  Then verify whether contact is created in Leads view