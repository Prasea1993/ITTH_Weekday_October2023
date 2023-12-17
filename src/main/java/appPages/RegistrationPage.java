package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class RegistrationPage {
    public WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;

    }

    public void gotoRegistrationPage() throws InterruptedException {

        driver.findElement(By.id("bahmni.registration")).click();
        WebElement homeButton = driver.findElement(By.className("back-btn"));
        Assert.assertNotNull(homeButton);


        WebElement SearchTab = driver.findElement(By.xpath("//span[@class='nav-link' and text()='S']"));
        Assert.assertEquals(SearchTab.getText(), "Search");
    }

    // Creates new patient and checks all the form fields are correct
    public void createNewPatient() throws InterruptedException {

        WebElement CreateNew = driver.findElement(By.xpath("//*[@id=\"view-content\"]/div[1]/header/ul/li[2]/a/span"));
        Assert.assertEquals(CreateNew.getText(), "Create New");


        WebElement IdBox = driver.findElement(By.id("registrationNumber"));
        Assert.assertNotNull(IdBox);


        WebElement patientname = driver.findElement(By.id("name"));
        Assert.assertNotNull(patientname);


        WebElement phoneNumber = driver.findElement(By.id("customAttribute"));
        Assert.assertNotNull(phoneNumber);

        // Create new patient
        CreateNew.click();


        WebElement patientIdentifierDropDown = driver.findElement(By.id("identifierPrefix"));
        Assert.assertNotNull(patientIdentifierDropDown);

        WebElement patientIdentifierText = driver.findElement(By.xpath("//label[@class='control-label' and @for = 'patientID']"));
        Assert.assertEquals(patientIdentifierText.getText(), "Patient Identifier");


        WebElement patientNameText = driver.findElement(By.xpath("//label[@for='patientName']"));
        Assert.assertEquals(patientNameText.getText(), "Patient Name*");



        WebElement patientMiddleNameText = driver.findElement( By.id("middleName"));
        Assert.assertNotNull(patientMiddleNameText);


        WebElement patientLastNameText = driver.findElement( By.id("familyName"));
        Assert.assertNotNull(patientLastNameText);


        //Gender text
        WebElement genderText = driver.findElement( By.xpath("//label[@for='gender']"));
        Assert.assertEquals(genderText.getText(),"Gender *");


        WebElement genderDropDown = driver.findElement( By.id("gender"));
        Assert.assertNotNull(genderDropDown);


        WebElement AgeText = driver.findElement( By.xpath("//label[@for='ageYears']"));
        Assert.assertEquals(AgeText.getText(),"Age*");
//Thread.sleep(3000);
        WebElement yearsText = driver.findElement( By.xpath("//span[@class='add-on']"));
        Assert.assertEquals(yearsText.getText(),"Years");

        WebElement yearsDropDown = driver.findElement( By.id("ageYears"));
        Assert.assertNotNull(yearsDropDown);
    }

    public void CreateAndTestNewPatient(String firstName,String middleName,String familyName,String gender,String ageYears, String ageMonth,String ageDays  ) throws InterruptedException {

        WebElement CreateNew = driver.findElement(By.xpath("//span[@class='nav-link' and contains(text(),'Create ') ] "));
        CreateNew.click();
        Thread.sleep(2000);
        // Enter Pt name
        driver.findElement(By.id("givenName")).sendKeys(firstName);
        driver.findElement(By.id("middleName")).sendKeys(middleName);
        driver.findElement(By.id("familyName")).sendKeys(familyName);

        Select objSelect = new Select(driver.findElement(By.id("gender")));
        objSelect.selectByVisibleText(gender);

        driver.findElement(By.id("ageYears")).sendKeys(ageYears);
        driver.findElement(By.id("ageMonths")).sendKeys(ageMonth);
        driver.findElement(By.id("ageDays")).sendKeys(ageDays);

        // Save
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement PatientIdentifier = driver.findElement( By.id("patientIdentifierValue"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(d -> {
                         String newPatientId = PatientIdentifier.getText();
                         return !newPatientId.isBlank();
        });

    }
}
