Feature: Registration test with examples
  @Registration_Examples
  Scenario Outline: Validate Registration with valid data using examples
    Given user launches app
    And user enters "superman" and "Admin123" and selects "Bahmni Clinic" and clicks on Login button
    And user clicks on registration button
    And user clicks on create new button
    And user enters "<firstname>" and "<lastname>" first and last names and selects "<gender>" as gender and enters "<age>" as age and clicks on start OPD

    Examples:
    |firstname| lastname | gender | age |
    | dilbar  | man      | Male   | 34 |
    | ghadk  | sd      | Female   | 34 |
    | adasd  | sd      | Male   | 34 |