Feature: Verify Prescription and description

  Scenario Outline: Verify Prescription and description

  Given Physician Go to Medunna web site
  And   Physician Navigate and sign in with doctor credentials with username "<username>" and "<password>"
  And   Physician Click on My Pages tab and choose My Appointments
  And   Physician  can click edit button
  Then  Physician Verify Prescription and description


    Examples:
      |username|password|
      |doctor1 |Ab12345.|