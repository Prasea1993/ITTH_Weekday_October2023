Feature: Login validation
  Scenario Outline: To Test Login feature
    Given User launch the application
    When user login with valid credentials
    Then user Enter valid username
    And user Enter valid password
    Then user click Bahmni location
    Then user click submit button
    And user should be redirect to dashboard
Examples:
  | Username | password |
  |superman | Admin123 |