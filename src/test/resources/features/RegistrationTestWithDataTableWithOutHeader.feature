Feature: Registration test with data table without header row
  @Registration_DatatableNoHeader
  Scenario: Validate Registration with valid data table without header row
    Given user launches app
    And user enters "superman" and "Admin123" and selects "Bahmni Clinic" and clicks on Login button
    And user clicks on registration button
    And user clicks on create new button
    And user enters patient data as below
    | rams | don | Male | 35 |