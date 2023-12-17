package stepDefinitions;

import appPages.ClinicalPage;
import appPages.HomePage;
import appPages.RegistrationPage;
import driverManagement.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class ClinicalStepDefinition {
    HomePage homePage=new HomePage(DriverManager.getDriver());
ClinicalPage clinicalPage=new ClinicalPage(DriverManager.getDriver());
    @And("User navigat to Home page")
    public void user_navigat_to_home_page() throws InterruptedException {
        clinicalPage.NavigatToHomePage();


    }

    @And("User click on clinical button")
    public void user_click_on_clinical_button() throws InterruptedException {
        homePage.navigateToClinicalPage();


    }

    @Then("Moving to consultation and order page and select  BloodTest")
    public void moving_to_consultation_and_order_page_and_select_blood_test(DataTable dataTable) throws InterruptedException {
List<List<String>> testdata=dataTable.asLists();
clinicalPage.ClinicalPage1(testdata.get(0).get(0));
    }

    @And("User click serum and select the serumtest")
    public void user_click_serum_and_select_the_serumtest(DataTable dataTable) {
        List<List<String>> testdata=dataTable.asLists();
        clinicalPage.SelectSerum(testdata.get(0).get(0),testdata.get(0).get(1));

    }

}