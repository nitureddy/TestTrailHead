@LoginTrailhead
Feature: Navigate to dreamhouse Playground

  @01LoginTrailhead
  Scenario: Launch dreamhouse playground
  Given Log in to SalesForce TrailHead
  Then Click on Accounts
  And Click on New Button
  Then Populate all mandatory fields
  And Click on Save button
  Then verify whether account is created in Accounts view
 
 @CreateNewAccountList
 Scenario: Create New Account List
  Given when user is in Acount List
  Then Click on List views
  And Select All Accounts List View
  Then Click on List Control Menu
  And Click New Menu from List Control Menu
  Then populate Name and Select all view radio button
  And click on Save button
  Then Select filters and Select All account radio button
  And click on Done button
 