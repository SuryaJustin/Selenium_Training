import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "" +
                "" +
                "C:\\USB\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.tnpsc.gov.in/");

        Thread.sleep(5);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement apply = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));

        wait.until(ExpectedConditions.visibilityOf(apply));

        apply.click();

        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        new WebDriverWait(driver,Duration.ofSeconds(5));

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> windows = driver.getWindowHandles();

        int count = windows.size();

        System.out.println("Total window count" + count);

//        List<String> list = new ArrayList<String>(windows);
//
//        /*Using index*/
//        driver.switchTo().window(list.get(1));

        /*Using For each loop*/

//        for (String child : windows) {
//            System.out.println("before" + child);
//            driver.switchTo().window(child);
//            System.out.println("after" + child);
//        }
//
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        WebElement notify = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Notification']"));

        notify.click();

    }
}