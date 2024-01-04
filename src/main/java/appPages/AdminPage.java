package appPages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
    public WebDriver driver;
   public AdminPage(WebDriver driver)
   {
       this.driver=driver;
   }
   private By AdminAditLogClick=By.xpath("//a[text()=\"Audit Log\"]");
   private By AdminOrderSetClick=By.xpath("//a[text()=\"Order Set\"]");
private By AditLogDate=By.xpath("//input[@id=\"startDate\"]");
private By AditLogUserSearch=By.xpath("//input[@id=\"username\"]");
private By AditLogIdSearch=By.xpath("//input[@id=\"patientId\"]");
private By ClickFilter=By.xpath("//button[@type='submit']");
private By ClickHomeForAdmin=By.xpath("//i[@class=\"fa fa-home\"]");

private By OrderSetCreatNew=By.xpath("//button[@class=\"fr small-btn grid-row-element orderSet-Create\"]");
private By OrderSetName=By.xpath("//*[contains(@ng-model,'orderSet.name')]");
private By OrderSetDiscription=By.xpath("//*[contains(@ng-model,'orderSet.description')]");

private  By OrderOperator=By.xpath("//select[@ng-model='orderSet.operator']");
private By OrderSetOrderType=By.xpath("//*[contains(@ng-model,'orderSet.operator')]");
private By HomeClickInAll2=By.xpath("//i[@class='fa fa-home']");
    private By HomeClickInLobaratory1=By.xpath("//i[@class='fa fa-users']");//i[@class='fa fa-users']
    public void NavigatToHomePage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(HomeClickInLobaratory1).click();
        Thread.sleep(5000);
        driver.findElement(HomeClickInAll2).click();
        Thread.sleep(5000);
    }




public void  AdminToSearch(String userName,String userId) throws InterruptedException {
    driver.findElement(AdminAditLogClick).click();
    Thread.sleep(3000);
    driver.findElement(AditLogUserSearch).sendKeys(userName);
    driver.findElement(AditLogIdSearch).sendKeys(userId);
    driver.findElement(ClickFilter).click();
    Thread.sleep(3000);
    driver.findElement(ClickHomeForAdmin).click();
    Thread.sleep(3000);


}
public void AdminOrderSet(String OrderName,String OrderDescription) throws InterruptedException {

    driver.findElement(AdminOrderSetClick).click();
    Thread.sleep(3000);
    driver.findElement(OrderSetCreatNew).click();
    Thread.sleep(7000);
    driver.findElement(OrderSetName).sendKeys(OrderName);
    driver.findElement(OrderSetDiscription).sendKeys(OrderDescription);
    Select  select=new Select(driver.findElement(OrderSetOrderType));

select.selectByIndex(1);

}





}
