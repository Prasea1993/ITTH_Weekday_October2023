package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Reports {
    public WebDriver driver;

    public Reports(WebDriver driver) {
        this.driver = driver;

    }

    public void gotoReports() throws InterruptedException {
        //Thread.sleep(3000);
        driver.findElement(By.id("bahmni.reports")).click();
        //Thread.sleep(3000);


        WebElement homeButton = driver.findElement(By.className("back-btn"));
        Assert.assertNotNull(homeButton);


//WebElement reportsText = driver.findElement(By.xpath());
      //  Assert.assertNotNull(Reports);

      //WebElement myreportsText = driver.findElement(By.xpath());
        //  Assert.assertNotNull(MY Reports);


    }
}
