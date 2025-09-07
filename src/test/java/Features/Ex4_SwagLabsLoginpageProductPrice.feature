Feature: product feature
  Background:
    Given user is on Swag Labs login page
    When user enter username on Swag Labs login page "standard_user"
    And user enter password on Swag Labs login page "secret_sauce"
    And user click on login btn on Swag Labs login page

  Scenario: S1-Verify home page contains 6 products
    Then User can see 6 product on home page

  Scenario: S2-Verify Price of Specific Product
    Then Price of Sauce Labs Backpack Product should 29.99

    Scenario: S3-Verify Total price of all product
      Then Total price of all product should 129.94