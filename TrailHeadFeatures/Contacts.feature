@CreateContact
Feature: Create Contact

  @CreateContact
  Scenario: Create Contact
  Given Log in to SalesForce TrailHead
  Then Click on Contacts
  And Click on New Button in contacts view
  Then Populate all mandatory fields in contacts view
  And Click on Save button in contacts view
  Then verify whether contact is created in Contacts view
  