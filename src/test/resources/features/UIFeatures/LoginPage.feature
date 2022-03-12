@admin_login
Feature: admin_login

  Scenario Outline: login_with_admin_credentials

    Given user is on Medunna Health website
    And user clicks on the login dropdown
    And user clicks on the sign in button
    And user sends username "<username>"
    And user sends password "<password>"
    And user clicks on the login button
    Then verify the login is successful
    Then user clicks on the login dropdown
    Then user clicks signOut

    Examples: credentials

      | username | password    |
      | Admin80  | Welcome123! |


  Scenario: user_verifies_signin_requirements

      Given user is on Medunna Health website
      And user clicks on the login dropdown
      And user clicks on the sign in button
      And verify the remember me option
      And verify the option Did you forget your password
      And verify the option Register a new account
      And verify the option to cancel login
      Then close the website











