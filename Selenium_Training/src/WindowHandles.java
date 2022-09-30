import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.tnpsc.gov.in/");

        Thread.sleep(5);

        WebElement apply = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));

        apply.click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        Set<String> windows = driver.getWindowHandles();

        int count = windows.size();

        System.out.println("Total window count" + count);

        List<String> list = new ArrayList<String>(windows);

        /*Using index*/
        driver.switchTo().window(list.get(1));

        /*Using For each loop*/
        for (String child : windows) {
            System.out.println("inside" + child);
            driver.switchTo().window(child);

        }


        WebElement notify = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Notification']"));

        notify.click();

    }
}