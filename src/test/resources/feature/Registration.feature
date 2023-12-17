Feature: To validate the patient registration
    Scenario: Validate patient registration with valid data
    Given user launch the app
    When user enters username and password and clinic and login
    Then user should be logged into the dashboard
    Then user clicks on Registration button
    Then user clicks on create new button
    Then  user Enter "Prashath" and "Samudrala" and "Male" and "15"
    Then  user Enter "Prashathh" and "Samudralaa" and "Male" and "16"
