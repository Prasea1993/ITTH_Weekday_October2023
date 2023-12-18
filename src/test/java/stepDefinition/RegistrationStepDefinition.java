package stepDefinition;

import appPages.Homepage;
import appPages.RegistrationPage;
import driverManagement.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationStepDefinition {

    WebDriver driver = DriverManager.getDriver();
    //Homepage hp=new Homepage(driver);
        RegistrationPage rp = new RegistrationPage(DriverManager.getDriver());

    @Given("user launch the app")
    public void user_launch_the_app() {
        driverManagement.DriverManager dm = new driverManagement.DriverManager();
       // dm.initBrowser("Chrome");
       //driver.get("https://demo-lite.mybahmni.in/bahmni/home/index.html#/login");
    }

    @When("user enters username and password and clinic and login")
    public void user_enters_username_and_password_and_clinic_and_login() {
        driver.findElement(By.id("username")).sendKeys("superman");
        driver.findElement(By.id("password")).sendKeys("Admin123");

        Select locationSelect = new Select(driver.findElement(By.id("location")));
        locationSelect.selectByVisibleText("Bahmni Clinic");
        driver.findElement( By.xpath("//button[@type='submit' and text()='Login']")).click();
    }

    @Then("user should be logged into the dashboard")
    public void user_should_be_logged_into_the_dashboard() {

    }

    @Then("user clicks on Registration button")
    public void user_clicks_on_registration_button() throws InterruptedException {

        rp.gotoRegistrationPage();


    }

    @Then("user clicks on create new button")
    public void user_clicks_on_create_new_button() {

        //rp.clickOnCreateNew();
    }

    @Then("user Enter {string} and {string} and {string} and {string}")
    public void user_enter_and_and_and(String firstname, String familyName, String gender, String age) throws InterruptedException {
        rp.CreateAndTestNewPatient(firstname, "", familyName, gender, age, "1", "1");
    }

    @Then("user enter data as below")
    public void user_enter_data_as_below(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<List<String>> testData= dataTable.asLists();

        rp.CreateAndTestNewPatient(testData.get(0).get(0), "", testData.get(0).get(1), testData.get(0).get(2), testData.get(0).get(3), "1", "1");
    }

    @Then("user enters {string} and {string} first and last names and selects {string} as gender and enters {string} as age and clicks on start OPD")
    public void user_enters_and_first_and_last_names_and_selects_as_gender_and_enters_as_age_and_clicks_on_start_opd(String firstName, String familyName, String gender, String age) throws InterruptedException {
        rp.CreateAndTestNewPatient(firstName, "", familyName, gender, age, "1", "1");
    }

}
