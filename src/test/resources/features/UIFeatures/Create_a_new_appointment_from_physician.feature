Feature: create a appointment from physician test


  @New_appointment
  Scenario Outline: test appointments
    Given physician clicks on make an appointment
    And   physician provides the appointment name "<firstname>"
    And   physician provides the appointment lastname "<lastname>"
    And   physician provides ssn and email "<SSN>" and "<email>"
    And   physician provides the phone number "<phoneNumber>"
    And   physician provides the date "<date>"

    Examples: test data
      |firstname|lastname|SSN        |email               |phoneNumber |date      |
      |Cicek    |Abbas   |203-38-9137|cicekabbas@gmail.com|253-907-2837|06-07-2022|



