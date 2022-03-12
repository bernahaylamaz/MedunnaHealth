#@TC_01
#Feature:TC_01_Ssn verification

#  Scenario: ssn_verifying
#Given  user will input ssn
#And user will input firstname
#And user will verify ssn requirement

#@TC_02
#Feature: TC_02 SSN cannot be blank

#  Scenario: ssn_is_not_blank
#Given user gets on the medunna
#And user will enter firstname
#And user will enter lastname
#And user will enter username
#And user will enter email
#And user will enter firstpassword
#And user will enter secondpassword
#And user will click the registrationButton
#Then user will verify the ssn cannot be blank


@TC_03
Feature: firstname_cannot_be_blank

 Scenario: firstname_verification

Given user will provide a valid SSN
And user will place a number in the lastName
And user will provide username
And user will provide email
And user will provide firstpassword
And user will provide secondpassword
And user will click the registrationButton
Then user verifies FirstName is required

@TC_04
  Feature: lastname_can_contain_characters
    Scenario : Character within the lastname

      Given user will get on registration page
      And user places the ssn
      And user place the firstname
      And user place the lastname





















