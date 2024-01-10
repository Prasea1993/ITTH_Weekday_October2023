package appPages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReportPage {
    public WebDriver driver;

    public ReportPage(WebDriver driver) {
        this.driver = driver;
    }

    private By ClickBackHomePage1 = By.xpath("//i[@class='fa fa-users']");
    private By ClickSeeAdmin2 = By.xpath("//i[@class='fa fa-home']");//click twice to move HomePage
    private By ReportChooseFormate = By.xpath("//select[@ng-model='default.reportsRequiringDateRange.responseType']");
    private By ReportEndDate = By.xpath("//*[contains(@class,'form-field start-date ng-pristine ng-valid ng-valid-min ng-touched')]");
    private By ReportStartDate = By.xpath("//input[@type='date' and @ng-model='default.reportsRequiringDateRange.startDate']");


   public void NavigatToHOmePage() throws InterruptedException {
       driver.findElement(ClickBackHomePage1).click();
       Thread.sleep(3000);
       driver.findElement(ClickSeeAdmin2).click();
       Thread.sleep(3000);
       driver.findElement(ClickSeeAdmin2).click();
       Thread.sleep(3000);
   }

   public void Reportsimpletest() throws InterruptedException {


       Thread.sleep(3000);
       Actions action = new Actions(driver);

       action.moveToElement(driver.findElement(ReportStartDate)).click().perform();


//        Thread.sleep(2000);
//        driver.findElement(ReportEndDate).click();
       Thread.sleep(3000);
       Select select=new Select(driver.findElement(ReportChooseFormate));
       select.selectByIndex(2);
       Thread.sleep(5000);


    }
}
