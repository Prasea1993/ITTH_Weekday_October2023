package stepDefinitions;

import appPages.HomePage;
import appPages.ImplementerPage;
import driverManagement.DriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import java.util.UUID;

public class ImplementerDefinition {
    HomePage homePage= new HomePage(DriverManager.getDriver());
    ImplementerPage implementerPage=new ImplementerPage(DriverManager.getDriver());
    @And("User navigate to Builder-Home page")
    public void user_navigate_to_builder_home_page() throws InterruptedException {
        implementerPage.NavigateHome();

    }
    @And("User click on Imlementer tab")
    public void user_click_on_imlementer_tab() throws InterruptedException {
        homePage.navigateToInterfacePage();

    }
    @And("User click on Builder tab and CreateForm")
    public void user_click_on_builder_tab_and_create_form() throws InterruptedException {


        implementerPage.Implement();

    }

}
