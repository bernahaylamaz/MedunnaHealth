@doctor_create_appointment

  Feature: appointment feature

    Scenario Outline: doctor should be able to create appointment

      Given doctor in on the appointment page
      And docktor enter
      Examples:
        |  |||