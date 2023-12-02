package stepDefinitions;

import appPages.LoginPage;
import driverManagement.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginStepDefinition {

    LoginPage lp =new LoginPage(DriverManager.getDriver());

    @Given("user launches app")
    public void user_launches_app() throws InterruptedException {

        DriverManager.getDriver().get("https://demo-lite.mybahmni.in/bahmni/home/index.html#/login");
        Thread.sleep(3000);


    }

    @And("user enters {string} and {string} and selects {string} and clicks on Login button")
    public void user_enters_and_and_selects_and_clicks_on_login_button(String username, String password, String clinic) throws InterruptedException {

        lp.loginToBhamniApp(username,password,clinic);
    }




}
