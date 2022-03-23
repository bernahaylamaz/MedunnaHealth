Feature: view_patient_with_API



  @API_view_patient_info
  Scenario Outline: view_patient_with_API

    Given user sets the necessary path params for patient
    And   user sends the get request for patient data
    And   user deserializes patient data to Java
    And   user saves the users patient data to correspondent files
    Then  user validates api patient data "<SSN>"

    Examples: api view patient
      |SSN|
       |738-73-7374|