package driverManagement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverManager {


// These changes are exclusively available in Vasanthi branch
    // Additional commit


    // Amit changes

    public static ThreadLocal<WebDriver> localDriver=new ThreadLocal<WebDriver>();

   public static synchronized WebDriver getDriver(){

         return localDriver.get();
   }

    public static void unloadDriver(){

       localDriver.set(null);
}


        public WebDriver initBrowser(String browserType) throws InterruptedException, MalformedURLException {


       switch(browserType){

           case  "Chrome":
                WebDriverManager.chromedriver().setup();
                localDriver.set(new ChromeDriver());
                break;

           case "Firefox":
               WebDriverManager.firefoxdriver().setup();
               localDriver.set(new FirefoxDriver());
               break;

           case "Safari":
               WebDriverManager.safaridriver().setup();
               localDriver.set(new SafariDriver());
               break;


           case "Remote BS":

               System.out.println(System.getProperty("GitHub Value"));

               MutableCapabilities capabilities = new MutableCapabilities();
               ChromeOptions options = new ChromeOptions();
               options.addArguments("incognito");  // ChromeOptions for starting chrome in incognito mode

               capabilities.setCapability(ChromeOptions.CAPABILITY, options);

               capabilities.setCapability("browserName", "Chrome");
               capabilities.setCapability("browserVersion", "118.0");
               HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
               browserstackOptions.put("os", "OS X");
               browserstackOptions.put("osVersion", "Ventura");
               capabilities.setCapability("bstack:options", browserstackOptions);
               String username= "prashanthsamudra_9uc23D";
               String accesskey = "LXtj4dZ84jzfXy9QKvY8";
               String browserStackURL = "https://"+username+":"+accesskey+"@hub-cloud.browserstack.com/wd/hub";
               localDriver.set( new RemoteWebDriver(new URL(browserStackURL), capabilities));



// rest of the test case goes here


               break;

           case "Remote SL":
               ChromeOptions browserOptions = new ChromeOptions();
               browserOptions.setPlatformName("Windows 11");
               browserOptions.setBrowserVersion("latest");
               Map<String, Object> sauceOptions = new HashMap<>();
               sauceOptions.put("username", "oauth-itthoctober2023-e2d6a");
               sauceOptions.put("accessKey", "4fb5c3b0-a5c5-4b7d-a9dc-f8292909c5d0");
               sauceOptions.put("build", "selenium-build-Y9JN9");
               sauceOptions.put("name", "<your test name>");
               browserOptions.setCapability("sauce:options", sauceOptions);

               URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
              localDriver.set(new RemoteWebDriver(url, browserOptions));

               break;

           default:
               System.out.println("Please provide the browserType value only from the values Chrome/Firefox/Safari");
               break;

       }



       getDriver().manage().window().maximize();
       return getDriver();



    }




    }














