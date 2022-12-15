Feature: Test Guru99 application

  Scenario Outline: Test register page guru99 application
    Given user is on register page
    When user enter valid "<firstName" and "<lastName>"

    Examples: 
      | firstName   | lastName |
      | dnyaneshwar | kadam    |
