Feature: Clinical test go and selecting BloodTest
  Background:
    Given user launches app
    And user enters "superman" and "Admin123" and selects "Bahmni Clinic" and clicks on Login button
    And user clicks on registration button
    And user clicks on create new button
    And user enters "Samer" and "Dil" first and last names and selects "Male" as gender and enters "25" as age and clicks on start OPD
  @clinical_DatatableNoHeader
    Scenario: Clinical Test
    And User navigat to Home page
    And User click on clinical button
    Then Moving to consultation and order page and select  BloodTest
    |CBN|
    And User click serum and select the serumtest
      |Serum|Serum electrolytes|