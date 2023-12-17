Feature: To validate the patient registration
    Scenario: Validate patient registration with valid data
    Given user launch the app
    When user enters username and password and clinic and login
    Then user should be logged into the dashboard
    Then user clicks on Registration button
    Then user clicks on create new button
    Then user enter data as below
        | John | Peter | Male | 35 |

