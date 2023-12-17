package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Appointments {
    public WebDriver driver;

    public Appointments(WebDriver driver) {
        this.driver = driver;

    }

    public void gotoAppointments() throws InterruptedException {
        //Thread.sleep(3000);
        driver.findElement(By.id("bahmni.appointment.scheduling")).click();
        //Thread.sleep(3000);


        WebElement homeButton = driver.findElement(By.className("back-btn"));
        Assert.assertNotNull(homeButton);


WebElement manageAppointments = driver.findElement(By.xpath("//span[@Class='ng-binding' and text()='Manage Appointments'  ]"));
         Assert.assertNotNull(manageAppointments);

      WebElement adminText = driver.findElement(By.xpath("//span[@Class='ng-binding' and text()='Admin']"));
        Assert.assertNotNull(adminText);

manageAppointments.click();

//text
        WebElement summary = driver.findElement(By.xpath("//a[text()='Summary'] "));
        Assert.assertNotNull(summary);

        WebElement Appointmentslist = driver.findElement(By.xpath("//a[text()='Appointments List'] "));
        Assert.assertNotNull(Appointmentslist);

summary.click();

        Appointmentslist.click();



        WebElement addNewAppointments= driver.findElement(By.xpath("//a[contains(text(),'Add new appointment')] "));
        Assert.assertNotNull(addNewAppointments);

      addNewAppointments.click();


        WebElement patientNameOrId= driver.findElement(By.id("react-select-2-input"));
        Assert.assertNotNull(patientNameOrId);


        patientNameOrId. sendKeys("GAN10");

        driver.findElement(By.id("react-select-2-option-0")).click();

        //specialityDropdown
        driver.findElement(By.className("react-select__value-container react-select__value-container--has-value css-1hwfws3")).click();

    }
}