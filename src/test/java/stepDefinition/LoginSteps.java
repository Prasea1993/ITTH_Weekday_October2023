package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static driverManagement.DriverManager.getDriver;

public class LoginSteps {

    @Given("User launch the application")
    public void user_launch_the_application() {
        driverManagement.DriverManager dm = new driverManagement.DriverManager();
        dm.initBrowser("Chrome");
        getDriver().get("https://demo-lite.mybahmni.in/");
        getDriver().manage().window().maximize();
    }

    private void setDriver(ChromeDriver chromeDriver) {

    }

    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user Enter valid username")
    public void user_enter_valid_username() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user Enter valid password")
    public void user_enter_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user click Bahmni location")
    public void user_click_bahmni_location() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user click submit button")
    public void user_click_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user shouldbe redirect to dashboard")
    public void user_shouldbe_redirect_to_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}
