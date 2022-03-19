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

    Scenario Outline:  edit appointment
      Given Go to Medunna web site
      And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And   Click on My Pages tab and choose My Appointments
      Then  Verify that Physician can click edit button

      Examples:
        |username|password|
        |doctor1 |Ab12345.|

    Scenario Outline: verify appointment
      Given Go to Medunna web site
      And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And   Click on My Pages tab and choose My Appointments
      Then  Physician Verify that user(doctor) can see patient id, start date, end date, status

      Examples:
        |username|password|
        |doctor1 |Ab12345.|

    Scenario Outline: type anamnesis
      Given Go to Medunna web site
      And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And   Click on My Pages tab and choose My Appointments
      And   Physician can click edit button
      Then  Physician type in Anamnesis "<anamnesis>", Treatment "<treatment>" and Diagnosis "<diagnosis>" as required fields and click save button

      Examples:
        |username|password|anamnesis|treatment |diagnosis|
        |doctor1 |Ab12345.|blood test|workout  |cholesterol |

    Scenario Outline: Verify Prescription and description
      Given Go to Medunna web site
      And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And   Click on My Pages tab and choose My Appointments
      And   Physician can click edit button
      Then  Physician Verify Prescription and description

      Examples:
        |username|password|
        |doctor1 |Ab12345.|

    Scenario Outline: Verify status
      Given Go to Medunna web site
      And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And   Click on My Pages tab and choose My Appointments
      And   Physician can click edit button
      Then  Physician verify status

      Examples:
        |username|password|
        |doctor1 |Ab12345.|

#    Scenario Outline: may request
#      Given Go to Medunna web site
#      And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
#      And   Click on My Pages tab and choose My Appointments
#      And   Physician can click edit button
#      And   Physician Click on Request test button
#      Then  Physician verify Test Items
#
#      Examples:
#        |username|password|
#        |doctor1 |Ab12345.|

    Scenario Outline: checmark test
      Given Go to Medunna web site
      And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
      And   Click on My Pages tab and choose My Appointments
      And   Physician can click edit button
      And   Physician Click on Request test button
      And  Physician checkmark Glucose, Urea, Creatinine, Sodium
      Then save

      Examples:
        |username|password|
        |doctor1 |Ab12345.|


