@UIMyApp
Feature: Physician My Appointments

  Scenario Outline:   user(doctor) can see their appointments list and time slots on My Appointments
    Given Go to Medunna web site
    And Navigate and sign in with doctor credentials with username "<username>" and "<password>"
    And Click on My Pages tab and choose My Appointments
    Then Verify that Physician can see the appointments list and time slots on My Appointments
    Examples:
      |username|password|
      |doctor1 |Ab12345.|







