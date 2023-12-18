Feature: To validate the patient registration
    Scenario Outline: Validate patient registration with valid data
    Given user launch the app
    When user enters username and password and clinic and login
    Then user should be logged into the dashboard
    Then user clicks on Registration button
    Then user clicks on create new button
        And user enters "<firstname>" and "<lastname>" first and last names and selects "<gender>" as gender and enters "<age>" as age and clicks on start OPD
        Examples:
            |firstname| lastname | gender | age |
            | Sri     | Ram      | Male   | 34  |
            | Sree    | Krish    | Female | 34  |
            | Sai     | Srini    | Male   | 34  |
