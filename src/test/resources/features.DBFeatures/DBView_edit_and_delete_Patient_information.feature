Feature: View edit and delete Patient information

  Scenario Outline:  test appointment data
    Given User sends the physician query "<query>" to DB with column names "<columnName>"
    And   User saves physician  data in correspondent files
    Then  User validates the physician data

    Examples: test appointment data
      | query                   |columnName|
      | SELECT * FROM physician |id      |
