Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given user is open the application
    When user click on to signin link
    And user enters "<username>" and "<password>"
    Then message displayed Login Successfully

    Examples: 
      | username | password    |
      | lalitha  | password123 |
