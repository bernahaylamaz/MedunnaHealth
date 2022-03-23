Feature: view edit impatients by physician

  @View_Impatient_by_Physician
  Scenario Outline:

  Given Physician Go to Medunna web site
  And   Physician Navigate and sign in with doctor credentials with username "<username>" and "<password>"
  And   Physician Click on My Pages tab and choose My Patients
  Then  Physician verify patient info



    Examples:
    |username|password|
    |doctor1 |Ab12345.|
