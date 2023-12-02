Feature: Registration test with inline data from feature file
  @Registration_Inline
  Scenario: Validate Registration with valid data with inline data
    Given user launches app
    And user enters "superman" and "Admin123" and selects "Bahmni Clinic" and clicks on Login button
    And user clicks on registration button
    And user clicks on create new button
    And user enters "Samer" and "Dil" first and last names and selects "Male" as gender and enters "25" as age and clicks on start OPD