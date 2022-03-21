Feature: update such as

  @Update_such_as_appointment
  Scenario Outline: such as appointment

    Given physician go to medunna page
    And   physician click sing in bottom
    And   physician write username and password "<Username>", "<Password>"
    And   click sing in bottom
    And   physician  click my pages
    And   physician click my appointment
    And   physician click view button
    And   physician verify appointment



    Examples: test data
    |Username|Password|
    |Admin80 |Welcome123!