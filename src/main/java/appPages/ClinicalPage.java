package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClinicalPage {

    WebDriver driver;
    public ClinicalPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //private By clickClinicalPage= By.xpath("//a[@id='bahmni.clinical']");
    //private By clickAll=By.xpath("//span[text()='All ']");
   // private By searchPatientIdOrName=By.xpath("//input[@id='patientIdentifier']");
    //private By searchButton=By.xpath("//button[@type='submit']");
    private By clickActive=By.xpath("//span[text()='Active ']");
    private By ActivePateint=By.xpath("//div[@class='patient-name']");
    private By ConsultationClick=By.xpath("//a[@class='btn--left btn--success']");
    private By OrderClick=By.xpath("//a[text()='Orders']");
    private By BloodSelectPanelsCBC=By.xpath("//a[@class='grid-row-element button orderBtn ng-binding ng-scope']");

    private By HomeClick=By.xpath("//i[@class='fa fa-home']");
    private By SerumSelectLink=By.xpath("//a[@ng-click='showLeftCategoryTests(sample)']");
    private By SerumSelectPanels=By.xpath("//a[@class='grid-row-element button orderBtn ng-binding ng-scope']");

public void NavigatToHomePage() throws InterruptedException {
    Thread.sleep(3000);
    driver.findElement(HomeClick).click();
    Thread.sleep(5000);

}

    public void ClinicalPage1(String paneltest) throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(HomeClick).click();
//        Thread.sleep(5000);
        //driver.findElement(clickClinicalPage).click();
       // Thread.sleep(5000);
        // driver.findElement(clickAll).click();
        driver.findElement(clickActive).click();
        //Thread.sleep(5000);
        // driver.findElement(searchPatientIdOrName).sendKeys(searchName);
        // driver.findElement(searchButton).click();
        Thread.sleep(5000);
        driver.findElement(ActivePateint).click();
        Thread.sleep(6000);
        driver.findElement(ConsultationClick).click();
        Thread.sleep(5000);
        driver.findElement(OrderClick).click();
        Thread.sleep(5000);//driver.findElement(BloodSelectPanelsCBC).click();
        List<WebElement> webElements = driver.findElements(BloodSelectPanelsCBC);
        for (WebElement element : webElements) {
            if (element.getAttribute("textContent").contains(paneltest)) { //CBN=paneltest
                element.click();

            }
        }

    }
    public void SelectSerum(String serumSelect1,String serumSelect2)   {

        List<WebElement> serumWebElement=driver.findElements(SerumSelectLink);
        for(WebElement element2:serumWebElement){
            if(element2.getAttribute("textContent").contains(serumSelect1)){//Serum=SerumSelct
                element2.click();
            }
        }
        List<WebElement> selectSerumPanels=driver.findElements(SerumSelectPanels);

        for(WebElement element2:selectSerumPanels){
            if(element2.getAttribute("textContent").contains(serumSelect2)){//serumSelect2=Serum electrolytes
                element2.click();
            }
        }





    }

}

