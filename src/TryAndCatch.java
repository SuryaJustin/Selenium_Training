import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TryAndCatch {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.tnpsc.gov.in/");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement apply = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        wait.until(ExpectedConditions.visibilityOf(apply));

        apply.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        Thread.sleep(6000);
        Set<String> windows = driver.getWindowHandles();

        List<String> list = new ArrayList<String>(windows);

        try {

            /*Using index*/
            driver.switchTo().window(list.get(1));

        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("false");
        }
       catch (Exception e){
           System.out.println("tttttttttttt "+e.getMessage());
       }

    }
}