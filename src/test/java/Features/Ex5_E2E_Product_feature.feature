Feature: Product order End to End feature

   Background:
     Given user is on Swag Labs login page
     When user enter username on Swag Labs login page "error_user"
     And user enter password on Swag Labs login page "secret_sauce"
     And user click on login btn on Swag Labs login page

  Scenario: S5-order place E2E
    And user click on Add to cart option for Product SwagLabsBackpack
    And user click on cart option
    And user click on checkout button
    And user enter FN as "abc"
    And user enter LN as "xyz"
    And user enter pin code as 123456
    And user click on continue button
    And user click on finish button
    Then order place message "Thank you for your order!" should be visible


