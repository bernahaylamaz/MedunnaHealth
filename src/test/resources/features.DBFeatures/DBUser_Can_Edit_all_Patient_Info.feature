Feature: View edit and delete Patient information


  Scenario Outline:

    Given Admin sends the patient query "<query>" to DB with column names "<columnName>"
    And   Admin can edit all patient information
    Then  Admin validates the all patient info

    Examples:

      | query                 |columnName|
      | SELECT * FROM patient |first_name|

    