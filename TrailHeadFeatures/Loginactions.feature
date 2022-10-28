#Sample Feature Definition Template
@LoginAmazon
Feature: To check the Login
  
  @Loginsuccess
  Scenario: To check successful login
    Given I naviate to application
    When The home page displayed
    Then I username
    Then I enter pasword
    And check login is successful 
    
 