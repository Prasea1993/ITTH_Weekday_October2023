package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {

        public WebDriver driver;
        public LoginPage(WebDriver driver){
            this.driver=driver;

        }
        public  void loginToBahmni(String username,String password) throws InterruptedException {
            //Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/div/a")).click();

            //Thread.sleep(3000);
            driver.findElement(By.id("username")).sendKeys("superman");
            driver.findElement(By.id("password")).sendKeys("Admin123");

            Select locationSelect = new Select(driver.findElement(By.id("location")));
            locationSelect.selectByVisibleText("Bahmni Clinic");

            driver.findElement( By.xpath("//button[@type='submit' and text()='Login']")).click();




        }
}

