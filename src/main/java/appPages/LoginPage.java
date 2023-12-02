package appPages;

import driverManagement.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {


    public WebDriver driver;



    public LoginPage(WebDriver driver){

        this.driver=driver;

    }

    // Locators

    private By textUserName=By.id("username");
    private By textPassWord=By.id("password");
    private By selectLocation=By.id("location");
    private By buttonLogin=By.xpath("//button[@type='submit' and text()='Login']");



    // Methods

    public void loginToBhamniApp(String username,String password,String clinic) throws InterruptedException {

        driver.findElement(textUserName).sendKeys(username);
        driver.findElement(textPassWord).sendKeys(password);

        Select select=new Select(driver.findElement(selectLocation));
        select.selectByVisibleText(clinic);
        driver.findElement(buttonLogin).click();
        Thread.sleep(3000);

    }



}
