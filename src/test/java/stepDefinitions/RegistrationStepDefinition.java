package stepDefinitions;

import appPages.HomePage;
import appPages.RegistrationPage;
import driverManagement.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class RegistrationStepDefinition {


    HomePage homePage = new HomePage(DriverManager.getDriver());
    RegistrationPage registrationPage = new RegistrationPage(DriverManager.getDriver());

    @Given("user clicks on registration button")
    public void user_clicks_on_registration_button() throws InterruptedException {

        homePage.navigateToRegistrationPage();
    }
    @Given("user clicks on create new button")
    public void user_clicks_on_create_new_button() throws InterruptedException {

      registrationPage.createNew();

    }


    // This applies top both inline and examples usage from feature file
    @Given("user enters {string} and {string} first and last names and selects {string} as gender and enters {string} as age and clicks on start OPD")
    public void user_enters_and_first_and_last_names_and_selects_as_gender_and_enters_as_age_and_clicks_on_start_opd(String firstname, String lastname, String gender, String age) throws InterruptedException {

        registrationPage.createRegistration(firstname,lastname,gender,age);
    }




}
