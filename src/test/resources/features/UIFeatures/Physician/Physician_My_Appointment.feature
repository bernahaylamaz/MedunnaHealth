Feature: edit appointment

  @Edit_Appointment
  Scenario Outline:  edit appointment
    Given Go to Medunna web site
    And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
    And   Click on My Pages tab and choose My Appointments
    Then  Verify that Physician can click edit button
    Examples:
      |username|password|
      |doctor1 |Ab12345.|


    @Verify_Appointment
    Scenario Outline: verify appointment
    Given Go to Medunna web site
    And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
    And   Click on My Pages tab and choose My Appointments
    Then  Physician Verify that user(doctor) can see patient id, start date, end date, status

    Examples:
      |username|password|
      |doctor1 |Ab12345.|


      @Type_Anamnesis
      Scenario Outline: type anamnesis

    Given Go to Medunna web site
    And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
    And   Click on My Pages tab and choose My Appointments
    And   Physician can click edit button
    Then  Physician type in Anamnesis "<anamnesis>", Treatment "<treatment>" and Diagnosis "<diagnosis>" as required fields and click save button

        Examples:
          |username|password|anamnesis|treatment |diagnosis|
          |doctor1 |Ab12345.|blood test|workout  |cholesterol |


    @Verify_Prescription_Descroption
  Scenario Outline: Verify Prescription and description
        Given Go to Medunna web site
        And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
        And   Click on My Pages tab and choose My Appointments
        And   Physician can click edit button
        Then  Physician Verify Prescription and description

          Examples:
            |username|password|
            |doctor1 |Ab12345.|


    @Verify_status
  Scenario Outline: Verify status
    Given Go to Medunna web site
    And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
    And   Click on My Pages tab and choose My Appointments
    And   Physician can click edit button
    Then  Physician verify status

    Examples:
      |username|password|
      |doctor1 |Ab12345.|



    @May_Request
    Scenario Outline: may request
    Given Go to Medunna web site
    And   Navigate and sign in with doctor credentials with username "<username>" and "<password>"
    And   Click on My Pages tab and choose My Appointments
    And   Physician can click edit button
    And   Physician Click on Request test button
    Then  Physician verify Test Items


      Examples:
        |username|password|
        |doctor1 |Ab12345.|



  @CheckmarkTest
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


