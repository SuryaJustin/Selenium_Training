import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tnpsc {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.tnpsc.gov.in/");

        Thread.sleep(5);

        List<WebElement> lstOptions = driver.findElements(By.xpath("//li[@class='notice']"));
        System.out.println(lstOptions.size());

        WebElement element1 = lstOptions.get(1);
        System.out.println("First Option" + element1.getText());


        for(int i=0; i<lstOptions.size(); i++){
            System.out.println(lstOptions.get(i));
        }
        System.out.println("before");
        for (WebElement ele:lstOptions) {
            System.out.println(ele.getText());
        }
        System.out.println("after");


        WebElement apply = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));

        apply.click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        WebElement notify = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Notification']"));

        notify.click();

        //        lstOptions.forEach(ele1->ele1.getText());
    }
}