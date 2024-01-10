Feature: Implementer tab and Builder tab
  Background:
    Given user launches app
    And user enters "superman" and "Admin123" and selects "Bahmni Clinic" and clicks on Login button
    And user clicks on registration button
    And user clicks on create new button
    And user enters "Samer" and "Dil" first and last names and selects "Male" as gender and enters "25" as age and clicks on start OPD
    And User navigat to Home page
    And User click on clinical button
    Then Moving to consultation and order page and select  BloodTest
      |CBN|
    And User click serum and select the serumtest
      |Serum|Serum electrolytes|
    And User the navigat to Home page
    And user click on Admin button
    And user click on AuditLog and enter username and password for search
      |superman|GAN10092|
    And userClick OrderSet and passing data
      |vasanthi|manga|
    And User navigate to Home page
    And user click on Report button
    And user Click Elements
    @Implementer
    Scenario: Implementer tab
      And User navigate to Builder-Home page
      And User click on Imlementer tab
      And User click on Builder tab and CreateForm