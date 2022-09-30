import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {

    public static void  main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\USB\\Driver\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://testleaf.herokuapp.com/");

        WebElement linkTex = driver.findElement(By.linkText("Edit"));
        linkTex.click();

        WebElement txtBox = driver.findElement(By.id("email"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='2px solid red'",txtBox);
        txtBox.sendKeys("Text Value");

    }
}
