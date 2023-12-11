package stepDefinitions;

import driverManagement.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

public class CommonActions {

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
        if(System.getProperty("GitHubValue")!=null){
        driver= driverManager.initBrowser(System.getProperty("GitHubValue"));
        }

        else{
             driver= driverManager.initBrowser(properties.getProperty("browser"));
        }


    }




    @After
    public void afterEveryScenario(){


       if(driver!=null) {
           driver.close();
       }

    }



}
