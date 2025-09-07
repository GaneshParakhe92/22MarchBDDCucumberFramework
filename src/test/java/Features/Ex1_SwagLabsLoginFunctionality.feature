Feature: Login Fuctionality
  Scenario: TC1-user Login with valid credentials
    Given user is on Swag Labs login page
    When user enter username on Swag Labs login page "standard_user"
    And user enter password on Swag Labs login page "secret_sauce"
    And user click on login btn on Swag Labs login page
    Then user home page with logo text "Swag Labs"