package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    public WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
    }

    private By registrationButton =By.id("bahmni.registration");
    private By clickClinicalPage= By.xpath("//a[@id='bahmni.clinical']");
    //private By clinicalButton =By.id("bahmni.clinical");
    private By reportsButton =By.id("bahmni.reports");
    private By interfaceButton =By.id("bahmni.implementer.interface");
    private By labButton =By.id("bahmni.lab");
    private By adminButton =By.id("bahmni.admin");
    private By docButton =By.id("bahmni.patient.document.upload");
    private By appointmentButton= By.id("bahmni.appointment.scheduling");

    public void navigateToRegistrationPage() throws InterruptedException {
        driver.findElement(registrationButton).click();
        Thread.sleep(3000);
    }


    public void navigateToClinicalPage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(clickClinicalPage).click();
        Thread.sleep(5000);
    }

    public void navigateToReportsPage() throws InterruptedException {
        driver.findElement(reportsButton).click();
        Thread.sleep(3000);
    }

    public void navigateToInterfacePage() throws InterruptedException {
        driver.findElement(interfaceButton).click();
        Thread.sleep(3000);
    }


    public void navigateToLabPage() throws InterruptedException {
        driver.findElement(labButton).click();
        Thread.sleep(3000);
    }


    public void navigateToAdminPage() throws InterruptedException {
        driver.findElement(adminButton).click();
        Thread.sleep(3000);
    }

    public void navigateToDocumentsPage() throws InterruptedException {
        driver.findElement(docButton).click();
        Thread.sleep(3000);
    }


    public void navigateToAppointmentsPage() throws InterruptedException {
        driver.findElement(appointmentButton).click();
        Thread.sleep(3000);
    }






}
