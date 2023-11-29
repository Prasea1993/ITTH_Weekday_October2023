package stepDefinitions;

import appPages.LoginPage;
import driverManagement.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginStepDefinition {

    LoginPage lp =new LoginPage(DriverManager.getDriver());

    @Given("user launches app")
    public void user_launches_app() {

       }
    @And("user enters username and password")
    public void user_enters_username_and_password() {

        lp.loginToBhamniApp("superman","Admin123");

        }




}
