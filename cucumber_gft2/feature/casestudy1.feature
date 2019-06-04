Feature: Registration for testMeApp

  Scenario: To get registration successfull
    Given the signup page want to open
    When Enter the required fields
    And submit the registration
    Then user redirect to homepage
