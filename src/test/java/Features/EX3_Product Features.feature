Feature: product feature
  Scenario: Verify home page contains 6 products
    Given user is on Swag Labs login page
    When user enter username on Swag Labs login page "standard_user"
    And user enter password on Swag Labs login page "secret_sauce"
    And user click on login btn on Swag Labs login page
    Then User can see 6 product on home page
