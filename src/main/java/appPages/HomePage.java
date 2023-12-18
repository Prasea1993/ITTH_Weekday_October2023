package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    public WebDriver driver;
    public  Homepage(WebDriver driver){

        this .driver=driver;
    }
    private By registrationButton =By.id("bahmni.registration");
    public  RegistrationPage navigateToRegistrationPage(){
        driver.findElement(registrationButton).click();
        return new RegistrationPage(driver);

    }
}
