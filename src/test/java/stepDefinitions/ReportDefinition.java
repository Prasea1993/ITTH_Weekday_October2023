package stepDefinitions;

import appPages.HomePage;
import appPages.ReportPage;
import driverManagement.DriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ReportDefinition {
    WebDriver driver;
    HomePage homePage=new HomePage(DriverManager.getDriver());
    ReportPage reportPage=new ReportPage(DriverManager.getDriver());

    @And("User navigate to Home page")
    public void user_navigate_to_home_page() throws InterruptedException {
        reportPage.NavigatToHOmePage();


    }
    @And("user click on Report button")
    public void user_click_on_report_button() throws InterruptedException {
        homePage.navigateToReportsPage();

    }
    @And("user Click Elements")
    public void user_click_elements() throws InterruptedException {
        reportPage.Reportsimpletest();

    }



}
