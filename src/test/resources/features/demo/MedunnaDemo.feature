@demo
  Feature: medunna_demo

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

    Scenario Outline:   user(doctor) can see their appointments list and time slots on My Appointments
      Given Go to Medunna web site
      And Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And Click on My Pages tab and choose My Appointments
      Then Verify that Physician can see the appointments list and time slots on My Appointments
      Examples:
        |username|password|
        |doctor1 |Ab12345.|


    Scenario Outline:  user(doctor) can see patient id, start date, end date, status
      Given Go to Medunna web site
      And Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And Click on My Pages tab and choose My Appointments
      Then Verify that user(doctor) can see patient id, start date, end date, status
      Examples:
        |username|password|
        |doctor1 |Ab12345.|

    @Appointment
    Scenario Outline: test appointments
      Given user clicks on make an appointment
      And user provides the appointment name "<firstname>"
      And user provides the appointment lastname "<lastname>"
      And user provides ssn and email "<SSN>" and "<email>"
      When user provides the phone number "<phoneNumber>"
      And user provides the date "<date>"
      Then user requests appointment and verifies the success message
      Examples: test data
        |firstname|lastname|SSN|email|phoneNumber|date|
        |Cetin    |Isilak  |203-38-2837|cetin@gmail.com|253-283-2837|06-07-2022|


