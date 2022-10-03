import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Keyboard_MouseActionandSelect {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\USB\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://testleaf.herokuapp.com/");

        /*Action Class*/
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Edit")));
        act.build().perform();

        WebElement drp = driver.findElement(By.xpath("//img[@alt='ListBox']"));
        drp.click();


        /*Select class*/
        Select sel = new Select(driver.findElement(By.id("dropdown1")));
        sel.selectByIndex(1);
//        sel.deselectByValue("Selenium");
//        sel.deselectByVisibleText("Selenium");

        List<WebElement> option = sel.getOptions();
        for (WebElement ele : option) {
            System.out.println(ele.getText());
        }
    }
}