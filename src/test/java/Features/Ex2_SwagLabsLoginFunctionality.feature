Feature: login functionality
  Background:
    Given user is on Swag Labs login page
  Scenario: TC1-User Login with valid credentials
    When user enter username on Swag Labs login page "standard_user"
    And user enter password on Swag Labs login page "secret_sauce"
    And user click on login btn on Swag Labs login page
    Then user home page with logo text "Swag Labs"

  Scenario: TC2-User Login with invalid credentials
    When user enter username on Swag Labs login page "abc"
    And user enter password on Swag Labs login page "xyz"
    And user click on login btn on Swag Labs login page
    Then User can see error massage "Epic sadface: Username and password do not match any user in this service"