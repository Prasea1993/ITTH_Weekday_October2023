package stepDefinitions;

import appPages.LoginPage;
import driverManagement.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.List;

public class FirstTest {


    DriverManager dm;
    WebDriver driver;
    LoginPage lp;


    @BeforeMethod
    public void beforeMethod() throws InterruptedException {

        dm=new DriverManager();
        driver=dm.initBrowser("Chrome");
    }


    @Test(invocationCount = 3)
    public void test()  {

        lp=new LoginPage(DriverManager.getDriver());

        lp.loginToBhamniApp("superman","Admin123");






    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){

        driver.close();
        DriverManager.unloadDriver();
    }

}
