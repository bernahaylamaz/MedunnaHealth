Feature: test following items

  @TestItems
  Scenario Outline: test following items

    Given physician go to medunna page
    And   physician click sing in bottom
    And   physician write username and password "<Username>", "<Password>"
    And   physician click sing in bottom
    And   physician click Item&Titles
    And   physician click Test Items
    And   physician click view button



    Examples: