package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPage {

    WebDriver driver;

    public AmazonPage(WebDriver driver){
        this.driver= driver;
    }
    By Home=By.xpath("//a[normalize-space()='Home']");
    By verifyApplyOnline=By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']");

    public void clickHome() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(Home).click();
    }

    public void verifyApplyOnline(){
       Boolean verify= driver.findElement(verifyApplyOnline).isDisplayed();
        System.out.println(verify);
    }


}
