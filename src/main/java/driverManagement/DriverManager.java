package driverManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {
    public static ThreadLocal<WebDriver> localDriver = new ThreadLocal<WebDriver>();

  //Syn for multiple browser
    public static synchronized WebDriver getDriver() {
       return localDriver.get();
   }

    public static void setDriver(WebDriver driver) {
        localDriver.set(driver);
    }

    public WebDriver initBrowser(String browserType) {

        switch (browserType) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                setDriver(new ChromeDriver());
                break;
            case"Firefox":
                WebDriverManager.firefoxdriver().setup();
                localDriver.set(new FirefoxDriver());
                break;
        }

       // WebDriver getDriver;
        getDriver().get("https://demo-lite.mybahmni.in/bahmni/home/index.html#/login");
      getDriver().manage().window().maximize();
      //Del cookies
getDriver().manage().deleteAllCookies();
getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
return getDriver();
    }
}