@password_strength
Feature: test the password strength

@SmokeTest
@UIRegistration
Scenario Outline: test password strength
Given user provides the password "<password>"
Then user valides the password strength "<strength>"
Examples: test data
|password|strength|
| abcd    |1      |
| abcABCD |2      |
|ABcd123  |3      |
|*12acAB  |4      |
