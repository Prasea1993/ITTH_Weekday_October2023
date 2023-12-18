package stepDefinition;


import driverManagement.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

public class CommonAction {

    private DriverManager driverManager;
    private ConfigReader configReader;
    private WebDriver driver;
    private Properties properties;


    @Before(order =0 )
    public void readProperties() throws IOException {

        configReader=new ConfigReader();
        properties=configReader.loadProperties();

    }



    @Before(order=1)
    public void beforeEveryScenario() throws InterruptedException, MalformedURLException {

        driverManager=new DriverManager();
        driver= driverManager.initBrowser((String) properties.get("browser"));


    }

    @After
    public void afterEveryScenario(){


       // if(driver!=null) {
          //  driver.close();
        //}

    }



}
