package stepDefinitions;

import appPages.AdminPage;
import appPages.HomePage;
import driverManagement.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AdminDefinition {
    WebDriver driver;
    HomePage homePage=new HomePage(DriverManager.getDriver());
    AdminPage adminPage=new AdminPage(DriverManager.getDriver());
    @And("User the navigat to Home page")
    public void user_the_navigat_to_home_page() throws InterruptedException {
        adminPage.NavigatToHomePage();


    }
    @And("user click on Admin button")
    public void user_click_on_admin_button() throws InterruptedException {
        homePage.navigateToAdminPage();

    }
    @And("user click on AuditLog and enter username and password for search")
    public void user_click_on_audit_log_and_enter_username_and_password_for_search(DataTable dataTable) throws InterruptedException {
        List<List<String>> testdata=dataTable.asLists();
        adminPage.AdminToSearch(testdata.get(0).get(0),testdata.get(0).get(1));

    }
    @And("userClick OrderSet and passing data")
    public void user_click_order_set_and_passing_data(DataTable dataTable) throws InterruptedException {
        List<List<String>> testdata=dataTable.asLists();
        adminPage.AdminOrderSet(testdata.get(0).get(0),testdata.get(0).get(1));
    }


}
