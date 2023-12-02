package driverManagement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DriverManager {



    public static ThreadLocal<WebDriver> localDriver=new ThreadLocal<WebDriver>();

   public static synchronized WebDriver getDriver(){

         return localDriver.get();
   }

    public static void unloadDriver(){

       localDriver.set(null);
}


        public WebDriver initBrowser(String browserType) throws InterruptedException {


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

           default:
               System.out.println("Please provide the browserType value only from the values Chrome/Firefox/Safari");
               break;

       }



       getDriver().manage().window().maximize();
       return getDriver();



    }




    }














