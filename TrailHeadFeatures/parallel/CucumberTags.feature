@createOrder
Feature: ECommerce Application

@FunctionalTest
Scenario: FunctionalTest
Given This is a Functional test

@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a SmokeTest and RegressionTest

@RegressionTest
Scenario: UnSuccessful Login
Given This is a RegressionTest 

@SmokeTest 
Scenario: Add a product to bag
Given This is a SmokeTest

Scenario: Add multiple product to bag
Given This is a blank test

@SmokeTest @RegressionTest
Scenario: Remove a product from bag
Given This is a Remove a product from bag test

@RegressionTest
Scenario: Remove all products from bag
Given This is part1 of RegressionTest

@SmokeTest
Scenario: product quantity from bag page
Given This is a part1 of SmokeTestse

Scenario: Decrease product quantity from bag page
Given This is a Decrease product quantity from bag page test

@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a Buy a product with cash payment test

@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a Buy a product with CC payment test

