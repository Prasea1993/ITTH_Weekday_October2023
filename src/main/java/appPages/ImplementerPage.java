package appPages;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.UUID;

public class ImplementerPage {
    WebDriver driver;
    public ImplementerPage(WebDriver driver){
        this.driver=driver;
    }//a[@class="back-btn"]
    private By BuilderFormHome=By.xpath("//i[@class='fa fa-home']");
    private  By FormBuilderClick= By.xpath("//*[text()='Form Builder']");
    private By CreateForm=By.xpath("//*[text()='Create a Form']");
    private By FormName=By.xpath("//input[@class='form-name']");
    private By FormNameClick=By.xpath("//input[@class='button btn--highlight']");
    private  By SaveFormName=By.xpath("//button[@class='fr save-button btn--highlight']");
    private By BackFormBuilder=By.xpath("//a[@class='back-btn']");
private  By Importclick=By.xpath("formImportBtn");

public void NavigateHome() throws InterruptedException {
    driver.findElement(BuilderFormHome).click();
    Thread.sleep(3000);
}


public void Implement() throws InterruptedException {
    driver.findElement(FormBuilderClick).click();
    Thread.sleep(2000);
    driver.findElement(CreateForm).click();
    Thread.sleep(3000);
    //generating random string
    //String uuid = UUID.randomUUID().toString();
    String  uuid= RandomStringUtils.randomAlphabetic(8);
    driver.findElement(FormName).sendKeys(uuid);
    Thread.sleep(3000);
    driver.findElement(FormNameClick).click();
    Thread.sleep(4000);
    driver.findElement(SaveFormName).click();
    Thread.sleep(3000);
   // driver.findElement(Importclick).click();
    //Thread.sleep(3000);
    driver.findElement(BackFormBuilder).click();
    Thread.sleep(5000);
}

}
